package org.silentsoft.oss;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Test;
import org.silentsoft.oss.license.ApacheLicense2_0;
import org.silentsoft.oss.license.JSONLicense;
import org.silentsoft.oss.license.MITLicense;

public class NoticeFileTest {
	
	private static final License APACHE_LICENSE_2_0 = new ApacheLicense2_0();
	private static final License JSON_LICENSE = new JSONLicense();
	private static final License MIT_LICENSE = new MITLicense();
	
	@Test
	public void noticeFileTest() throws Exception {
		String markdown = generatePushbulletAPINoticeMarkdown();
		
		System.out.println("--------START OF THE NOTICE FILE--------");
		System.out.println(markdown);
		System.out.println("---------END OF THE NOTICE FILE---------");
		
		Assert.assertEquals(markdown, readFile());
	}
	
	private String generatePushbulletAPINoticeMarkdown() {
		return NoticeFileGenerator.newInstance("Pushbullet API", "silentsoft.org")
			.addText("This product includes software developed by silentsoft.org.")
			.addText("This product includes software developed by The Apache Software Foundation (http://www.apache.org/).")
			.addLibrary("commons-codec 1.11", "https://github.com/apache/commons-codec", APACHE_LICENSE_2_0)
			.addLibrary("commons-io 2.4", "https://github.com/apache/commons-io", APACHE_LICENSE_2_0)
			.addLibrary("commons-logging 1.2", "https://github.com/apache/commons-logging", APACHE_LICENSE_2_0)
			.addLibrary("httpclient 4.5.12", "https://github.com/apache/httpcomponents-client", APACHE_LICENSE_2_0)
			.addLibrary("httpcore 4.4.13", "https://github.com/apache/httpcomponents-core", APACHE_LICENSE_2_0)
			.addLibrary("httpmime 4.5.12", "", APACHE_LICENSE_2_0)
			.addLibrary("ini4j 0.5.4", "https://github.com/michaelPf85/ini4j", APACHE_LICENSE_2_0)
			.addLibrary("jackson-annotations 2.10.3", "https://github.com/FasterXML/jackson-annotations", APACHE_LICENSE_2_0)
			.addLibrary("jackson-core 2.10.3", "https://github.com/FasterXML/jackson-core", APACHE_LICENSE_2_0)
			.addLibrary("jackson-databind 2.10.3", "https://github.com/FasterXML/jackson-databind", APACHE_LICENSE_2_0)
			.addLibrary("jna 4.2.2", "https://github.com/java-native-access/jna", APACHE_LICENSE_2_0)
			.addLibrary("jna-platform 4.2.2", "https://github.com/java-native-access/jna", APACHE_LICENSE_2_0)
			.addLibrary("json 20141113", "https://github.com/douglascrockford/JSON-java", JSON_LICENSE)
			.addLibrary("proxy-vole 1.0.3", "https://github.com/MarkusBernhardt/proxy-vole", APACHE_LICENSE_2_0)
			.addLibrary("silentsoft-net 1.5.0", "https://github.com/silentsoft/silentsoft-net", APACHE_LICENSE_2_0)
			.addLibrary("slf4j-api 1.7.25", "https://github.com/qos-ch/slf4j", MIT_LICENSE)
			.generate();
	}
	
	private String readFile() throws Exception {
		return String.join("\r\n", Files.readAllLines(Paths.get(System.getProperty("user.dir"), "NOTICE.md"), StandardCharsets.UTF_8));
	}

}
