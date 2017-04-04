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

public class testclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
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
			
			
			
			URL url = new URL("http://psensortapp.azurewebsites.net/pressureSensorMonitoringCloud/api/psrestcalls/sendpdata");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

			String input = "{\"qty\":100,\"name\":\"iPad 5\"}";

			OutputStream os = conn.getOutputStream();
			os.write(input.getBytes());
			os.flush();

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			conn.disconnect();

		  } catch (MalformedURLException e) {

			e.printStackTrace();

		  } catch (IOException e) {

			e.printStackTrace();

		 }
	}

}
