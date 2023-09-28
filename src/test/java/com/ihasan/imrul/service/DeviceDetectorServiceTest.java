package com.ihasan.imrul.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ihasan.imrul.model.DeviceType;

public class DeviceDetectorServiceTest {

    @Test
    @DisplayName("Desktop Test")
    public void testDesktopDeviceDetection(){
        String userAgent1 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36";
        String userAgent10 ="Mozilla/5.0 (Linux; Android) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.109 Safari/537.36 CrKey/1.54.248666 (x)";
        String userAgent11 ="Mozilla/5.0 (X11; Linux aarch64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.188 Safari/537.36 CrKey/1.54.250320";
        assertEquals(DeviceType.DESKTOP.toString(), DeviceDetectorService.detectDevice(userAgent1));
        assertEquals(DeviceType.DESKTOP.toString(), DeviceDetectorService.detectDevice(userAgent10));
        assertEquals(DeviceType.DESKTOP.toString(), DeviceDetectorService.detectDevice(userAgent11));
    }
    @Test
    @DisplayName("Tablet Test")
    public void testTabletDeviceDetection(){
        String userAgent2 = "Mozilla/5.0 (iPad; CPU OS 13_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) CriOS/87.0.4280.77 Mobile/15E148 Safari/604.1";
        String userAgent7 ="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.82 Safari/537.36";
        assertEquals(DeviceType.TABLET.toString(), DeviceDetectorService.detectDevice(userAgent2));
        assertNotEquals(DeviceType.TABLET.toString(), DeviceDetectorService.detectDevice(userAgent7));
    }
    @Test
    @DisplayName("Mobile Test")
    public void testMobileDeviceDetection(){
        String userAgent3 = "Mozilla/5.0 (iPhone; CPU iPhone OS 13_2_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/13.0.3 Mobile/15E148 Safari/604.1";
        String userAgent4 = "Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.91 Mobile Safari/537.36";
        String userAgent5 = "Mozilla/5.0 (Linux; Android 8.0.0; SM-G955U Build/R16NW) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.141 Mobile Safari/537.36";
        String userAgent6 ="Mozilla/5.0 (Linux; Android 10; SM-G981B) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.162 Mobile Safari/537.36";
        String userAgent8 ="Mozilla/5.0 (Linux; Android 11.0; Surface Duo) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Mobile Safari/537.36";
        String userAgent9 ="Mozilla/5.0 (Linux; Android 9.0; SAMSUNG SM-F900U Build/PPR1.180610.011) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Mobile Safari/537.36";
        assertEquals(DeviceType.MOBILE.toString(), DeviceDetectorService.detectDevice(userAgent3));
        assertEquals(DeviceType.MOBILE.toString(), DeviceDetectorService.detectDevice(userAgent4));
        assertEquals(DeviceType.MOBILE.toString(), DeviceDetectorService.detectDevice(userAgent5));
        assertEquals(DeviceType.MOBILE.toString(), DeviceDetectorService.detectDevice(userAgent6));
        assertEquals(DeviceType.MOBILE.toString(), DeviceDetectorService.detectDevice(userAgent8));
        assertEquals(DeviceType.MOBILE.toString(), DeviceDetectorService.detectDevice(userAgent9));
    }

    
}
