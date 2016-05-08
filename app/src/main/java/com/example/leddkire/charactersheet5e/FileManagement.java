package com.example.leddkire.charactersheet5e;

import android.os.Environment;

/**
 * Created by leddkire on 5/4/2016.
 */
public class FileManagement {

/* Checks if external storage is available for read and write */
    public static boolean isExternalStorageWritable() {
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            return true;
        }
        return false;
    }
}



