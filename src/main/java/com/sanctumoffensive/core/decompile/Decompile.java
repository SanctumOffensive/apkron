package com.sanctumoffensive.core.decompile;

import brut.androlib.ApkDecoder;
import brut.androlib.ApktoolProperties;
import brut.androlib.Config;
import brut.common.BrutException;
import brut.directory.ExtFile;
import com.sanctumoffensive.core.exec.Exec;

import java.io.File;
import java.io.IOException;

import static brut.androlib.ApktoolProperties.getVersion;

public class Decompile {

    public static void decode(String appAndroid, String outputDirectory) throws BrutException, IOException {
        new ApkDecoder(Config.getDefaultConfig(), new ExtFile(appAndroid)).decode(new File(outputDirectory));
    }

    public static String version() {
        return getVersion();
    }
}
