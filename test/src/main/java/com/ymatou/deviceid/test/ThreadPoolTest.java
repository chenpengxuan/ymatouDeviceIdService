/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */
package com.ymatou.deviceid.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author tuwenjie 2016年5月18日 下午12:57:49
 */
public class ThreadPoolTest extends WithoutDubboBaseTest {


    @Autowired
    private TaskExecutor taskExecutor;
    @Autowired
    private TaskExecutor taskExecutorBiz;

    @Test
    public void testExceptionInThread() throws IOException {

        ExecutorService es = Executors.newFixedThreadPool(1);

        for (int i = 0; i < 10; i++) {
            es.execute(new Runnable() {

                @Override
                public void run() {
                    RuntimeException e = new RuntimeException("error in thread");
                    e.printStackTrace();
                    throw e;
                }
            });
        }


        ThreadPoolTaskExecutor tpte = new ThreadPoolTaskExecutor();
        tpte.setMaxPoolSize(1);
        tpte.initialize();

        for (int i = 0; i < 10; i++) {
            tpte.execute(new Runnable() {

                @Override
                public void run() {
                    RuntimeException e = new RuntimeException("error in thread");
                    e.printStackTrace();
                    throw e;
                }
            });
        }

        // System.in.read();

    }

    @Test
    public void testTaskExecutor() throws IOException {
        for (int i = 0; i < 100; i++) {

            taskExecutor.execute(() -> System.out.println(Thread.currentThread().getName() + " taskExecutor!"));
        }
        for (int i = 0; i < 100; i++) {

            taskExecutorBiz.execute(() -> {
                System.out.println(Thread.currentThread().getName() + " taskExecutorBiz!");
            });
        }
        System.in.read();
    }

}
