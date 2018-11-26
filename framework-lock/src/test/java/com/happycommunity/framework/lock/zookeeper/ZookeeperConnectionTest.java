/*
package com.happycommunity.framework.lock.zookeeper;

import org.apache.zookeeper.*;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

*/
/**
 * @author Danny
 * @Title: ZookeeperConnectionTest
 * @Description:
 * @Created on 2018-11-26 14:24:22
 *//*

public class ZookeeperConnectionTest {

    */
/* zookeeper地址*//*

    static final String CONNECT_STRING = "39.106.124.34:2181";
    */
/* session超时时间*//*

    static final int SESSION_TIMEOUT = 1000 * 2;
    */
/* 信号量，阻塞程序执行，用于等待zookeeper连接成功，发送成功信号*//*

    static final CountDownLatch countDownLatch = new CountDownLatch(1);

    static ZooKeeper zooKeeper;

    public static void main(String[] args) throws IOException, KeeperException, InterruptedException {

        zooKeeper = new ZooKeeper(CONNECT_STRING, SESSION_TIMEOUT, new Watcher() {
            public void process(WatchedEvent watchedEvent) {
                //获取事件状态
                Event.KeeperState keeperState = watchedEvent.getState();
                Event.EventType eventType = watchedEvent.getType();
                if (Event.KeeperState.SyncConnected == keeperState) {
                    if (Event.EventType.None == eventType) {
                        //如果建立连接成功，则发送信号量，让后续阻塞程序向下执行
                        System.out.println("Zookeeper 建立连接");
                        countDownLatch.countDown();
                    }
                }
            }
        });

        countDownLatch.await();

        // 创建父节点
        //zooKeeper.create("/testRoot", "testRoot".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.PERSISTENT);
        byte[] data = zooKeeper.getData("/testRoot", false, null);
        System.out.println(new String(data));
        System.out.println(zooKeeper.getChildren("/testRoot", false));

        // 创建子节点
        // zk.create("/testRoot/children", "children data".getBytes(),
        // Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);

        // 获取节点洗信息
        // byte[] data = zk.getData("/testRoot", false, null);
        // System.out.println(new String(data));
        // System.out.println(zk.getChildren("/testRoot", false));

        // 修改节点的值
        // zk.setData("/testRoot", "modify data root".getBytes(), -1);
        // byte[] data = zk.getData("/testRoot", false, null);
        // System.out.println(new String(data));

        // 判断节点是否存在
        // System.out.println(zk.exists("/testRoot/children", false));
        // 删除节点
        // zk.delete("/testRoot/children", -1);
        // System.out.println(zk.exists("/testRoot/children", false));

        zooKeeper.close();
    }

    public static void init() throws IOException {
        zooKeeper = new ZooKeeper(CONNECT_STRING, SESSION_TIMEOUT, new Watcher() {
            public void process(WatchedEvent watchedEvent) {
                //获取事件状态
                Event.KeeperState keeperState = watchedEvent.getState();
                Event.EventType eventType = watchedEvent.getType();
                if (Event.KeeperState.SyncConnected == keeperState) {
                    if (Event.EventType.None == eventType) {
                        //如果建立连接成功，则发送信号量，让后续阻塞程序向下执行
                        System.out.println("Zookeeper 建立连接");
                        countDownLatch.countDown();
                    }
                }
            }
        });
    }

    public static void close() throws InterruptedException {
        if (zooKeeper != null) {
            zooKeeper.close();
        }
    }
}
*/
