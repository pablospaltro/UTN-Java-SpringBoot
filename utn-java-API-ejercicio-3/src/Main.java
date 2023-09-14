import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        try {


            URL url = new URL("https://v2.jokeapi.dev/joke/Programming?type=single&amount=10");
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
            conexion.connect();
            int respuestaCodigo = conexion.getResponseCode();
            if (respuestaCodigo != 200) {
                throw new RuntimeException("Ocurrio un error" + respuestaCodigo);
            } else {
                StringBuilder informacionString = new StringBuilder();
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                String linea;
                while ((linea = reader.readLine()) != null) {
                    informacionString.append(linea);
                }
                reader.close();

                //StringBuilder a string:
                String jsonString = informacionString.toString();

                JSONObject jsonObject = new JSONObject(jsonString);
                JSONArray jokesArray = jsonObject.getJSONArray("jokes");

                boolean anotherJoke = true;
                System.out.println("\nJOKES");
                do {
                    int randomIndex = random.nextInt(9) + 1;

                    JSONObject jokeObject = jokesArray.getJSONObject(randomIndex);

                    String joke = jokeObject.getString("joke");
                    String category = jokeObject.getString("category");
                    String type = jokeObject.getString("type");
                    System.out.println("\n"+joke);
                    System.out.println("\n( Category: " + category + ", Type: " + type + " )");
                    System.out.println("\nAnother joke? Y / N ");
                    String opcion = scanner.nextLine();

                    if (opcion.equalsIgnoreCase("N")) {
                        anotherJoke = false;
                    }

                } while (anotherJoke);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}