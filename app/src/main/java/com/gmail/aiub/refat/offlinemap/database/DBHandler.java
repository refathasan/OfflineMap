package com.gmail.aiub.refat.offlinemap.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Refat-Dola on 7/9/2016.
 */
public class DBHandler extends SQLiteOpenHelper {
    /**
     * KEY OF DB VERSION
     */
    public static final int DATABASE_VERSION = 1;
    /**
     *  KEY OF DB NAME
     */
    public static final String DATABASE_NAME = "attendanceManagement";

    /**
     * KEY OF TABLE NAME
     */
    public static final String TABLE_NAME ="user_info";

    public static final String ID = "id";
    public static final String USER_NAME ="user_name";
    public static final String USER_PASSWORD ="password";
    public static final String USER_EMAIL ="email";


    public DBHandler(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String create_user_info_table = "CREATE TABLE "+ TABLE_NAME +" ( "+ID+" INT PRIMARY KEY"+
                USER_NAME+" TEXT "+USER_PASSWORD+" TEXT "+USER_EMAIL+" TEXT "+" ) ";
        sqLiteDatabase.execSQL(create_user_info_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " +TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
