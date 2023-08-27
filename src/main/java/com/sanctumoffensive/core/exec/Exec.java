package com.sanctumoffensive.core.exec;

import java.util.Scanner;

public class Exec {
    public static String cmd(String cmd) throws java.io.IOException, InterruptedException {
       ProcessBuilder builder = new ProcessBuilder();
       builder.command("sh", "-c", cmd);
       Process process = builder.start();
       process.waitFor();

       Scanner scanner = new Scanner(process.getInputStream()).useDelimiter("\\A");

       if(process.isAlive()) process.destroyForcibly();

       return scanner.hasNext() ? scanner.next() : "";
    }
}
