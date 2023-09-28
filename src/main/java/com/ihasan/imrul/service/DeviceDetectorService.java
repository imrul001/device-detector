package com.ihasan.imrul.service;

import com.ihasan.imrul.util.DeviceNameResolver;

import net.sf.uadetector.ReadableUserAgent;
import net.sf.uadetector.UserAgentStringParser;
import net.sf.uadetector.service.UADetectorServiceFactory;


public class DeviceDetectorService {
    public static String detectDevice(String userAgentString) {
        String userAgent = userAgentString.toLowerCase();
        UserAgentStringParser agentStringParser = UADetectorServiceFactory.getResourceModuleParser();
        ReadableUserAgent agent = agentStringParser.parse(userAgent);
        return new DeviceNameResolver().getDeviceName(agent.getDeviceCategory().getName());
    }
}
