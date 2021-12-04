package com.vcolofati.convidados.repositories;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.vcolofati.convidados.constants.DatabaseConstants;

public class GuestDatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "convidados.bd";
    private static final int DB_VERSION = 1;

    private static final StringBuilder CREATE_TABLE_GUEST = new StringBuilder()
            .append("create table ")
            .append(DatabaseConstants.GUEST.TABLE_NAME)
            .append(" (")
            .append(DatabaseConstants.GUEST.COLUMNS.ID)
            .append(" integer primary key autoincrement, ")
            .append(DatabaseConstants.GUEST.COLUMNS.NAME)
            .append(" text, ")
            .append(DatabaseConstants.GUEST.COLUMNS.PRESENCE)
            .append(" text);");

    public GuestDatabaseHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE_GUEST.toString());
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}