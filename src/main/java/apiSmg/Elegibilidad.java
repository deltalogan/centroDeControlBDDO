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
public class Elegibilidad {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://mobileqa.swissmedical.com.ar/pre/api-smg/v1.0/prestadores/hl7/elegibilidad");

			try {
				HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

				httpURLConnection.setRequestMethod("POST");
				httpURLConnection.setDoOutput(true);
				httpURLConnection.setRequestProperty("Authorization", "Bearer "
						+ "9qv0AHpu5xJ7Vfrrmtx7s6dMPPIB3+efw5JO8igf6zZPmvoRI8kWpfzKmnAXOSHS6LKGDlXAxekrjGC/51Y2WXeR9HgL0yXNJIbcRDYguiSQC4wGPv7aT7aoSVz6ipDy0PKeWPKKYHahw27KOZU0Oj7BkojDJO2iCgF0B7TeMG49Tr+tQ92FKX+kd+Uc6xUiVSDxBNZYyal6lcXc1uG5aQEQbXcUuThtB3gU7t3qJpHiqQKY05oimINp/rU8bajh1RVE4oQpl05o1x9nY7Un7Dx4GKanrPmmTnWArt2Cp0QAqAlShjfuEF94p6nkwWUEnQ+YKOTPqvcq+UAJUz5iqf2ir+fe+kGGs4aFvpBoSCR9zM8CKK4bWJvU3520sZ1H6HyKaJEJY421Mu2QAKUeU+nnoYBdz8xBTG6MQa9+VtbWpjiJOOrl8LW0TLiBFqA2Ub5Zzbbd8ZmIf45Vyew+th2BUWEmNNeDqDaardOwPCBsdMEPUE458vJmxEyoRSVxmofdcZPabMtFJGypOHl1rB2Fn6R8mXM8heifn4ZwN62rCdYyt/FgE9SznYg0AZq6aAz+Thw03TeCFNi7nhShJPmOQLQsMXWkjLlmK60CMQdvIJFuQ//x0Pg5Adju7qjbFd+lsNNMrjFkFEM07ReoaEUOPZFUXsVZ/Sue3s7FUPBl0KFw9lsTPA301XfzG5bYbpgDXBkXzX7o5+IrkgtCQt4IY+ES/6jIkX4dUHhplaS4GoZnPnZk2jm0j4fGrx4gT4kgsvjWfmYCqjxJJiWyZVQ9ikBs4EwILQg2uFgvEAd3L4l/cyLa3Qi7v87xw2Ti6Q8Z62OTaiac3rxsl/vS8wz89ezB1RsF2Imb70oHxrsvAS772TKvAe9wT4lGUYJeNKDnKO2cObGr9P/3ipi0qg==");
				httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
				OutputStream outputStream = httpURLConnection.getOutputStream();
				FileReader fileReader = new FileReader(
						ClassLoader.getSystemResource("apiSmg/requestElegibilidad.json").getPath());
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