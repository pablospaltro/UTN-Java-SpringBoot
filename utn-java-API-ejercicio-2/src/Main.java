import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {

        try {
            URL url = new URL("http://api.weatherapi.com/v1/current.json?key=ed7a573e1d084fc3a76135213231309&q=Mar%del%Plata&aqi=no");
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
            conexion.connect();
            int respuestaCodigo = conexion.getResponseCode();
            if (respuestaCodigo != 200) {
                throw new RuntimeException("Ocurrió un error " + respuestaCodigo);
            } else {
                StringBuilder informacionString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext()) {
                    informacionString.append(scanner.next());
                }
                scanner.close();

                // Convertir StringBuilder a String
                String jsonString = informacionString.toString();

                // instanciamos un JSNObject y se lo asignamos al String que creamos
                JSONObject jsonObject = new JSONObject(jsonString);

                // Creamos la variable para la llave que queremos leer
                /*
                String name = jsonObject.getString("name");
                String lastUpdated = jsonObject.getString("last_updated");
                String text = jsonObject.getString("text");
                */

                JSONObject locationObject = jsonObject.getJSONObject("location");
                JSONObject currentObject = jsonObject.getJSONObject("current");
                JSONObject conditionObject = currentObject.getJSONObject("condition");


                String name = locationObject.getString("name");
                String localtime = locationObject.getString("localtime");
                String text = conditionObject.getString("text");


                System.out.println("Nombre de la ubicación: " + name);
                System.out.println("Fecha: " + localtime);
                System.out.println("Estado: " + text);

                //muestra el objeto completo Location
                //String location = String.valueOf(jsonObject.getJSONObject("location"));

                //String name = jsonObject.getString("name");

                //String current = jsonObject.getString("current");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
