## device-detector
An example code to detech device (Desktop, Tablet, Mobile) from User-Agent HTTP header

### Usage
#### Adding Required Dependencies

```xml
<dependency>
  <groupId>net.sf.uadetector</groupId>
  <artifactId>uadetector-resources</artifactId>
  <version>2014.04</version>
</dependency>
```
#### Invoking the UserAgentParser to the Device Category

```java
public static String detectDevice(String userAgentString) {
  String userAgent = userAgentString.toLowerCase();
  UserAgentStringParser agentStringParser = UADetectorServiceFactory.getResourceModuleParser();
  ReadableUserAgent agent = agentStringParser.parse(userAgent);
  return new DeviceNameResolver().getDeviceName(agent.getDeviceCategory().getName());
}
```
#### Test Cases to Detect if the device is Desktop, Tablet or Mobile
```java
@Test
@DisplayName("Desktop Test")
public void testDesktopDeviceDetection(){
  String userAgent1 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36";
  assertEquals(DeviceType.DESKTOP.toString(), DeviceDetectorService.detectDevice(userAgent1));
}

@Test
@DisplayName("Tablet Test")
public void testTabletDeviceDetection(){
  String userAgent2 = "Mozilla/5.0 (iPad; CPU OS 13_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) CriOS/87.0.4280.77 Mobile/15E148 Safari/604.1";
  assertEquals(DeviceType.TABLET.toString(), DeviceDetectorService.detectDevice(userAgent2));
}
@Test
@DisplayName("Mobile Test")
public void testMobileDeviceDetection(){
  String userAgent3 = "Mozilla/5.0 (iPhone; CPU iPhone OS 13_2_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/13.0.3 Mobile/15E148 Safari/604.1";
  assertEquals(DeviceType.MOBILE.toString(), DeviceDetectorService.detectDevice(userAgent3));
}
```


