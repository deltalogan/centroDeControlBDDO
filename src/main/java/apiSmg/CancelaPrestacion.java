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
public class CancelaPrestacion {
	public static void main(String[] args) {
		try {
			URL url = new URL(
					"https://mobileqa.swissmedical.com.ar/pre/api-smg/v1.1/prestadores/hl7/cancela-prestacion");

			try {
				HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

				httpURLConnection.setRequestMethod("POST");
				httpURLConnection.setDoOutput(true);
				httpURLConnection.setRequestProperty("Authorization", "Bearer "
						+ "9qv0AHpu5xJ7Vfrrmtx7s6dMPPIB3+efw5JO8igf6zZPmvoRI8kWpfzKmnAXOSHSMinrmp37DvRE4hozJVsZkdehe1yzNbIUVer2BNt/nBHCiAy8EEtfrRZNH1X5w71co7jRu+93dA3PK92awizRXKSRw4iSZrmNfVPe7gR2CxvDJeqBxzFU3iMhHo+WRerd8WOdqQtU86e3xfdQjP5+9T0Y2WC273LYeRUBNElAfhrfgyU7I3h7rBH8l1umJEbXvjBa6wom/UabYl4AolOlkIQUUK7flsEpHl7apXczx1zJM0izq3K/wr/k1tn6n8L325dA0CSKxF1W1ebePkQvDL0ShhWFXHLEla3x+tvoOJW1nN3mRWy8/Z/EaxzLomE7Vwq630/fCxUGhiphf3XoASoaW6qt17BoCm6H4Bz+0V3R8FGZoTGCO/+lXz1GiczP8k/kcix1nxQ4C8SRgBOD0Fn2x0XqrWijizkyePmH40QhPhWWQ0GdHOk1cJ9EIuhGMOMJbQNSnWJuYFCoqDgL7ofucdc6SU78FD1+dXDdwm+R1EPZvTm+xjJHmNkPmkyChIYNS5lTMMkz4azST7ETf8yIbPu65wdgjMZ/B40iXDEH38DAPLZtQm8ug1p8q1GniX8AHloMgB6FucZ+/eTBUPyiZUojl9ZL+Hsgh4xjSlqEP1CNEQFIqqideeXtNc82MmDwkpK50RLGD7WswZ8FUXYo1U8+qjJWvli3/YvQblvB36B0rtzA+CcgKxjJUzgSKn4kUPyIulgbGoYrIzKU/EMpE/RnctaiI0MdsTyfU53upx5dU+laRVbj9Ywg4Fg3Yaswo4dn+++NGAIug19cptFglm8PcFztp1yyB823d2XVbhbgrw10M15lLK/yfH3ZOvcFkPWuJLsIzYMgIyTESw==");
				httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
				OutputStream outputStream = httpURLConnection.getOutputStream();
				FileReader fileReader = new FileReader(
						ClassLoader.getSystemResource("apiSmg/requestCancelaPrestacion.json").getPath());
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