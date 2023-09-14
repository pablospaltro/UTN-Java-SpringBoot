import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) {

        try{
            URL url = new URL("https://jsonplaceholder.typicode.com/users");
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
            conexion.connect();
            int respuestaCodigo = conexion.getResponseCode();
            if (respuestaCodigo!=200){
                throw new RuntimeException("Ocurrio un error" + respuestaCodigo);
            } else {
                StringBuilder informacionString = new StringBuilder();
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                String linea;
                while ((linea = reader.readLine()) != null){
                    informacionString.append(linea);
                }
                reader.close();

                //StringBuilder a string:
                String jsonString = informacionString.toString();

                //Parsear el JSON como un array de objetos
                JSONArray jsonArray = new JSONArray(jsonString);
                System.out.println("\nUSERS\n");
                for(Object object : jsonArray){
                    if (object instanceof JSONObject jsonObject1) {
                        int id = jsonObject1.getInt("id");
                        String name = jsonObject1.getString("name");
                        String email = jsonObject1.getString("email");
                        System.out.println("Id: "+id+"\nName: "+name+"\nEmail: "+email+"\n");
                    }
                }

                System.out.println("USER id 6 : ");
                for(Object object : jsonArray) {
                    if (object instanceof JSONObject jsonObject2) {
                        int id = jsonObject2.getInt("id");

                        if(id == 6){
                            System.out.println("Id: 6\nName: "+jsonObject2.getString("name"));
                        }
                    }
                }


            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}