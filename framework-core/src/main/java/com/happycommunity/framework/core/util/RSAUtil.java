package com.happycommunity.framework.core.util;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;

/**
 * @author Danny
 * @Title: RSAUtil
 * @Description:
 * @Created on 2018-11-29 15:58:19
 */
public class RSAUtil {

    /**
     * 解密经过RSA加密后的数据
     *
     * @param password
     * @param privateKey
     * @return
     * @throws Exception
     */
    public static String decrypt(String password, String privateKey) throws Exception {
        String decryptedPassword = decrypt(loadPrivateKey(privateKey), strToBase64(password));
        return decryptedPassword;
    }

    /**
     * 私钥解密过程
     *
     * @param privateKey
     *            私钥
     * @param cipherData
     *            密文数据
     * @return 明文
     * @throws Exception
     *             解密过程中的异常信息
     */
    public static String decrypt(RSAPrivateKey privateKey, byte[] cipherData) throws Exception {
        if (privateKey == null) {
            throw new Exception("解密私钥为空, 请设置");
        }
        Cipher cipher = null;
        try {
            // 使用默认RSA
            cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            byte[] output = cipher.doFinal(cipherData);
            return new String(output);
        } catch (NoSuchAlgorithmException e) {
            throw new Exception("无此解密算法");
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
            return null;
        } catch (InvalidKeyException e) {
            throw new Exception("解密私钥非法,请检查");
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
            throw new Exception("密文长度非法");
        } catch (BadPaddingException e) {
            e.printStackTrace();
            throw new Exception("密文数据已损坏");
        }
    }

    /**
     * 从字符串中加载私钥
     *
     * @param privateKeyStr
     *            私钥字符串
     * @return
     * @throws Exception
     */
    public static RSAPrivateKey loadPrivateKey(String privateKeyStr) throws Exception {
        try {
            byte[] buffer = javax.xml.bind.DatatypeConverter.parseBase64Binary(privateKeyStr);
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(buffer);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            return (RSAPrivateKey) keyFactory.generatePrivate(keySpec);
        } catch (NoSuchAlgorithmException e) {
            throw new Exception("无此算法", e);
        } catch (InvalidKeySpecException e) {
            throw new Exception("私钥非法", e);
        } catch (NullPointerException e) {
            throw new Exception("私钥数据为空", e);
        }
    }

    public static byte[] strToBase64(String str) {
        return javax.xml.bind.DatatypeConverter.parseBase64Binary(str);
    }
}
