import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int choice;
        Line line = new Line(2, 1, 4, 7);
        Line line2 = new Line(2, 1, 4, 7);

        do{
            System.out.print("1. Tiesės krypties koeficientas / ilgis \n");
            System.out.println("2. Ar tiesės lygiagrečios");
            System.out.print("3. Sfera \n");
            System.out.print("4. Išeiti \n");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:{
                    System.out.println("Tiesės krypties koeficientas: " + line.rastiNuolydi());
                    System.out.println("Tiesės ilgis: " + line.rastiIlgi());
                }
                break;
                case 2:{
                    System.out.println(line.arLygiagrecios(line2));
                }
                break;
                case 3:{

                }
                break;
                default:{
                    break;
                }
            }
        }while(choice!=4);

    }
}
