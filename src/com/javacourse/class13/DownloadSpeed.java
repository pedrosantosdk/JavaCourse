package com.javacourse.class13;

import java.util.Scanner;

public class DownloadSpeed {
    public static void main(String[] args) {
        // bit value
        int bits= 8;

        // User input.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the file size in (MB):");
        double megaBytes =  scan.nextDouble();
        System.out.println("Enter your internet speed in Mb/s:");
        double mBits = scan.nextDouble();

        // Calculate download speed.
        double internet = mBits / bits;
        double download = megaBytes / internet;

        // Output.
        System.out.printf("To download a %.2f (MB) file over a %.2f Mb/s connection, it will complete in %.2f seconds.", megaBytes, mBits, download);

    }
}
