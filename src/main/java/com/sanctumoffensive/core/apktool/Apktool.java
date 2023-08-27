package com.sanctumoffensive.core.apktool;

import com.sanctumoffensive.core.exec.Exec;

import java.io.IOException;

public class Apktool {
    public static final String NotExistMessage = "Didn't find 'apktool' executable. Install instructions is here: https://ibotpeaches.github.io/Apktool/install/";

    private static String exec(String... command) throws IOException, InterruptedException {
        return Exec.cmd(String.format("apktool %s", String.join(" ", command)));
    }

    public static boolean exists() {
        return version() != null;
    }

    public static String version() {
        String apktoolExecutionOutput = null;

        try {
            apktoolExecutionOutput = exec("-version");
        } catch (IOException | InterruptedException ignore) {}

        return apktoolExecutionOutput;
    }

    public static String decompile(String apk, String directoryTemporary) {
        String apktoolExecutionOutput = null;

        try {
            apktoolExecutionOutput = exec("d", apk, "-o", directoryTemporary, "-fq");
        } catch (IOException | InterruptedException e) {
            System.err.println(e.getMessage() + " - (When running apktool)");
            System.exit(0);
        }

        return apktoolExecutionOutput;
    }
}
