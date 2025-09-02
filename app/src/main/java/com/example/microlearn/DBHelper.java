package com.example.microlearn;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    final public static String DB_NAME = "chat";

    final public static String CHATS_TABLE = "chats";
    final public static String MESSAGES_TABLE = "messages";
    final public static String CHAT_ID = "chat_id";
    final public static String CHAT_NAME = "name";

    final public  static String MESSAGE = "message";
    final public  static String MESSAGE_ID = "message_id";

    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String chatsTable = "CREATE TABLE IF NOT EXISTS " + CHATS_TABLE + " (" +
                CHAT_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                CHAT_NAME + " TEXT)";

        String messagesTable = "CREATE TABLE IF NOT EXISTS " + MESSAGES_TABLE + " (" +
                MESSAGE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                CHAT_ID + " INTEGER, " +
                MESSAGE + " TEXT)";

        db.execSQL(messagesTable);
        db.execSQL(chatsTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
