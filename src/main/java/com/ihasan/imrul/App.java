package com.ihasan.imrul;

import com.ihasan.imrul.service.DeviceDetectorService;
import com.ihasan.imrul.util.DeviceNameResolver;

public class App {

    public static void main(String[] args) {
        // Sample User-Agent strings for testing
        String userAgent1 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36";
        String userAgent2 = "Mozilla/5.0 (iPad; CPU OS 13_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) CriOS/87.0.4280.77 Mobile/15E148 Safari/604.1";
        String userAgent3 = "Mozilla/5.0 (iPhone; CPU iPhone OS 13_2_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/13.0.3 Mobile/15E148 Safari/604.1";
        String userAgent4 = "Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.91 Mobile Safari/537.36";
        String userAgent5 = "Mozilla/5.0 (Linux; Android 8.0.0; SM-G955U Build/R16NW) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.141 Mobile Safari/537.36";
        String userAgent6 ="Mozilla/5.0 (Linux; Android 10; SM-G981B) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.162 Mobile Safari/537.36";
        String userAgent7 ="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.82 Safari/537.36";
        String userAgent8 ="Mozilla/5.0 (Linux; Android 11.0; Surface Duo) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Mobile Safari/537.36";
        String userAgent9 ="Mozilla/5.0 (Linux; Android 9.0; SAMSUNG SM-F900U Build/PPR1.180610.011) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Mobile Safari/537.36";
        String userAgent10 ="Mozilla/5.0 (Linux; Android) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.109 Safari/537.36 CrKey/1.54.248666 (x)";
        String userAgent11 ="Mozilla/5.0 (X11; Linux aarch64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.188 Safari/537.36 CrKey/1.54.250320";
        
    
        System.out.println("UserAgent 1: " + DeviceDetectorService.detectDevice(userAgent1)); // Should print "Desktop"
        System.out.println("UserAgent 2: " + DeviceDetectorService.detectDevice(userAgent2)); // Should print "Tablet"
        System.out.println("UserAgent 3: " + DeviceDetectorService.detectDevice(userAgent3)); // Should print "Mobile"
        System.out.println("UserAgent 4: " + DeviceDetectorService.detectDevice(userAgent4)); // Should print "Mobile"
        System.out.println("UserAgent 5: " + DeviceDetectorService.detectDevice(userAgent5)); // Should print "Mobile"
        System.out.println("UserAgent 6: " + DeviceDetectorService.detectDevice(userAgent6)); // Should print "Mobile"
        System.out.println("UserAgent 7: " + DeviceDetectorService.detectDevice(userAgent7)); // Should print "Tablet"
        System.out.println("UserAgent 8: " + DeviceDetectorService.detectDevice(userAgent8)); // Should print "Mobile"
        System.out.println("UserAgent 9: " + DeviceDetectorService.detectDevice(userAgent9)); // Should print "Mobile"
        System.out.println("UserAgent 10: " + DeviceDetectorService.detectDevice(userAgent10)); // Should print "Desktop"
        System.out.println("UserAgent 11: " + DeviceDetectorService.detectDevice(userAgent11)); // Should print "Desktop"

        DeviceNameResolver deviceNameResolver = new DeviceNameResolver();
        System.out.println(deviceNameResolver.getDeviceName(DeviceDetectorService.detectDevice(userAgent3)));
        
    }
}





