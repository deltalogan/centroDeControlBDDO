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
public class Registracion {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://mobileqa.swissmedical.com.ar/pre/api-smg/v1.0/prestadores/hl7/registracion");

			try {
				HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

				httpURLConnection.setRequestMethod("POST");
				httpURLConnection.setDoOutput(true);
				httpURLConnection.setRequestProperty("Authorization", "Bearer "
						+ "9qv0AHpu5xJ7Vfrrmtx7s6dMPPIB3+efw5JO8igf6zZPmvoRI8kWpfzKmnAXOSHSV4E64mEQAG3OeFd076FFR1xxN4TWAZMYU8eOq5/LQNKsVh/7GPcYLMR0H3OTyPv3LoTm7kGnwVPEL7GBg67JN4I4s0MAPRWy5o0MHVHd2HtN5pN8BA8B8RR1bweKMaww/ARX4AVSf7kxiC6moPrapJm/bm0XKXPBhLfAVEUdheRBAsHvWd14hNiuuIPeN6l6L6g8eckVIUDo8hM26Sp4xspX8Se/2INryc2aJqxaSjBQ5H//rTrOD+Xh9muWxSsSzNaRrfEZ5KhxXIzRl+EgNETTFheQxJg2bvMFygT1srMgFrSxK4YBSQYm8bU5bHkWjid46mbTnn7Eykm6GtEOvf+mRYd9B6tB2zqe4IBGJ9zINgtCdI0Rv4tcmDFF4HX4BX9dhQbtYviumigFTpv9+iUfLwA50epbuppLc2yivCoYdtZs9AvaFNYhtQxHvKdZN6z9gqz5fpTPc6TSUThztqO5JRIA+K4wbaxgXzH6D9UQwL70g3AFv0u4eli6GhFyeFtly9yJIs+INvAOJfm83zQfXYKbCLe82NoXVPHLDgi1JsALGnt9P0gulz8cbjacWshBTV4EGreutxDAdIQ6zsHvulIrGz7lNuL6h6f4LOloC4skbqwTu69fg27+Yx+mN9S0PqiZQW7dZ+790CTm01mlAdwHRs+k6Ir64E+edDluBLOG4UuKzQeB8x1npTQqYjSNkZ7GzQYNWYl0KT0Kh48FLTJtKui4oPkH5b2WKxMnv/I4UWEUdVIkrH8RAVEJgp3RAn2HEZwxKHgasNum7B/zZLT8UI5BlcMmVPqAPVsCbr7W4ExUxPcuf4y9j+USh5wZt+hgo0t2bLlT4ze1Tw==");
				httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
				OutputStream outputStream = httpURLConnection.getOutputStream();
				FileReader fileReader = new FileReader(
						ClassLoader.getSystemResource("apiSmg/requestRegistracion.json").getPath());
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