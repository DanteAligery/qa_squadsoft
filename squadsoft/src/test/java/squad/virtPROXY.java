package squad;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.NTCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Base64;




public class virtPROXY {
	static String LentaURL = "http://test-squadspace.squadsoft.ru";
	static String driverPath = "/home/dante/QA/squadsoft/driver/";
	static String realm = "test-squadspace.squadsoft.ru";
	static String userName = "lesnikov";
	static String password = "qoO5QOE9";
	static String soapMessage;
	
	

	public static void proxy() throws Exception{
		String basicAUTH = userName + ":" + password;
    	String basicAUTHencoded = Base64.getEncoder().encodeToString(basicAUTH.getBytes());
    	System.out.println(basicAUTHencoded);
	    System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver");
		BrowserMobProxyServer server = new BrowserMobProxyServer();
		
		URL url = new URL(LentaURL);
		URLConnection urlConnection = url.openConnection();
		urlConnection.setRequestProperty("WWW-Authenticate", "NTLM");
        urlConnection.setRequestProperty("WWW-Authenticate", "Basic " + basicAUTHencoded);
        InputStream is = urlConnection.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);

		
		server.start();
		System.out.println("proxy start!");
		
		

		
	 }
	}