package com.sanctumoffensive;

import brut.androlib.exceptions.OutDirExistsException;
import brut.common.BrutException;
import com.sanctumoffensive.core.decompile.Decompile;
import com.sanctumoffensive.core.tempdir.TemporaryDirectory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("APKRON - APPLICATION INFORMATION COLLECTION");
        System.out.println("APKTool Version: " + Decompile.version());

        System.out.println("...developerment...");
    }
}