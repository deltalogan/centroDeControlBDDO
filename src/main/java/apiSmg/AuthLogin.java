package apiSmg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Hello world!
 *
 */
public class AuthLogin {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://mobileqa.swissmedical.com.ar/pre/api-smg/v0/auth-login");

			try {
				HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

				httpURLConnection.setRequestMethod("POST");
				httpURLConnection.setDoOutput(true);
				httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
				OutputStream outputStream = httpURLConnection.getOutputStream();
				FileReader fileReader = new FileReader(
						ClassLoader.getSystemResource("apiSmg/requestAuthLogin.json").getPath());
				JSONParser jSONParser = new JSONParser();
				Object object;
				try {
					object = jSONParser.parse(fileReader);
					JSONObject jSONObject = (JSONObject) object;
					outputStream.write(jSONObject.toJSONString().getBytes());
					outputStream.flush();
					outputStream.close();
					httpURLConnection.connect();

					if (httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {

						BufferedReader bufferedReader = new BufferedReader(
								new InputStreamReader(httpURLConnection.getInputStream()));
						String inputLine;
						StringBuffer stringBuffer = new StringBuffer();

						while ((inputLine = bufferedReader.readLine()) != null) {
							stringBuffer.append(inputLine);
						}
						bufferedReader.close();

						System.out.println(stringBuffer.toString());
					}

					else

						System.out.println(httpURLConnection.getResponseMessage().toString());

				} catch (ParseException e) {
					System.out.println(e.getMessage().toString());
				}

			} catch (IOException e) {
				System.out.println(e.getMessage().toString());
			}

		} catch (MalformedURLException e) {
			System.out.println(e.getMessage().toString());
		}

	}
}