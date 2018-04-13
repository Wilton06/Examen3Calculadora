package com.example.wiltontuckerhart.examen3calculadora.database.Models;

import com.example.wiltontuckerhart.examen3calculadora.database.CalcDataBase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

@Table(database = CalcDataBase.class)
public class Historial extends BaseModel {

    @Column
    @PrimaryKey(autoincrement = true)
    public long id;

    @Column
    public String operationHistory;
}
