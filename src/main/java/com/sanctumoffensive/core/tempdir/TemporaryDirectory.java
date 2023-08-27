package com.sanctumoffensive.core.tempdir;

import com.sanctumoffensive.core.random.RandomString;

import java.io.File;

public class TemporaryDirectory {
    private final String nameDirectory;

    public TemporaryDirectory() {
        this.nameDirectory = RandomString.getAlphaNumericString(20);
    }

    public boolean createTempDirectory() {
        File file = new File(this.nameDirectory);

        if(file.exists()) file.delete();

        return file.mkdir();
    }

    public String getTempDirectory() {
        return this.nameDirectory;
    }

    public boolean deleteTempDirectory() {
        File file = new File(this.nameDirectory);

        return file.delete();
    }
}
