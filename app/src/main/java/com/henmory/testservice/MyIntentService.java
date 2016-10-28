package com.henmory.testservice;

import android.app.IntentService;
import android.content.Intent;

import static java.lang.Thread.sleep;

/**
 * author: henmory
 * time:  10/28/16
 * function:
 * description:
 */

public class MyIntentService extends IntentService {

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("create");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("destory");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        try {
            sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
