package com.example.wiltontuckerhart.examen3calculadora.database;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;

public class CalcExamApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(this);
    }
}
