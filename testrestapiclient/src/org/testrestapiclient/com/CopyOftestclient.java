
/*
package org.testrestapiclient.com;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;

public class CopyOftestclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String URLAddress = "http://localhost:8080/com.nav.rest/api/v1/status/post";
			
			final String authUser = "ic016389";
			final String authPassword = "Europeantit3#";
			Authenticator.setDefault(
			   new Authenticator() {
			      @Override
			      public PasswordAuthentication getPasswordAuthentication() {
			         return new PasswordAuthentication(
			               authUser, authPassword.toCharArray());
			      }
			   }
			);

			System.setProperty("http.proxyUser", authUser);
			System.setProperty("http.proxyPassword", authPassword);
			System.setProperty("http.proxyHost", "194.138.0.25");
			System.setProperty("http.proxyPort", "9400");
			
			
			
			//String URLAddress = "http://hellowebapplbl.azurewebsites.net/pressureSensorMonitoringCloud/api/hello";
			URL url = new URL(URLAddress);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			//conn.setRequestMethod("GET");
			conn.setRequestMethod("POST");
			//conn.setRequestProperty("Content-Type", "text/plain; charset=utf-8");
			conn.setRequestProperty("Content-Type", "application/json");
			
			int responseCode = 0;
	    	responseCode = conn.getResponseCode();
	        System.out.format("Connecting to %s\nConnection Method: '%s'\nResponse Code is: %d\n", URLAddress, "GET", responseCode);
	        System.out.println("----[ URL DETAILS ]-----------------");
	        System.out.println("URL Protocol....: " + url.getProtocol());
	        System.out.println("URL Host........: " + url.getHost());
	        System.out.println("URL Port........: " + url.getPort());
	        System.out.println("URL Authority...: " + url.getAuthority());
	        System.out.println("URL Path........: " + url.getPath());
	        System.out.println("URL User Info...: " + url.getUserInfo());
	        System.out.println("URL Query Info..: " + url.getQuery());

	        System.out.println("----[ OUTPUT BELOW ]-----------------------------------------------------------------");
             // open the contents of the URL as an inputStream and print to stdout
	        String inputString = null;
	        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	        while ((inputString = in.readLine()) != null) {
	 	                   System.out.println(inputString);
	        }
	        in.close();        
			conn.disconnect();

		  } catch (MalformedURLException e) {

			e.printStackTrace();

		  } catch (IOException e) {

			e.printStackTrace();

		 }
	}

}
*/