package apiSmg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class TipoPrestacion {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://sgiint.swissmedical.com.ar/ws.rem-prestaciones/api/tipo-prestacion");

			try {
				HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

				httpURLConnection.setRequestMethod("GET");
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

			} catch (IOException e) {
				System.out.println(e.getMessage().toString());
			}

		} catch (MalformedURLException e) {
			System.out.println(e.getMessage().toString());
		}

	}
}