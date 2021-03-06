package com.stest;

import android.database.sqlite.SQLiteDatabase;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.google.gson.Gson;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;
import com.stest.model.MusicInfoDetail;

import org.litepal.LitePalApplication;
import org.litepal.tablemanager.Connector;

import java.util.List;
import java.util.logging.Handler;

/**
 * Created by Limuyang on 2016/8/15.
 */
public class NetEasyApplication extends LitePalApplication {
    private static Gson gson;
    private static NetEasyApplication instance;
    private static RefWatcher sRefWatcher;
    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
        Fresco.initialize(this);
        instance = this;
    }
    public static RefWatcher getRefWatcher() {
        return sRefWatcher;
    }

    public static NetEasyApplication getInstance() {
        return instance;
    }

    public static Gson gsonInstance() {
        if (gson == null) {
            gson = new Gson();
        }
        return gson;
    }


}
