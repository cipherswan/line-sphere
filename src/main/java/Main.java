import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int choice;
        Line line = new Line();

        do{
            System.out.print("1. Tiesės krypties koeficientas \n");
            System.out.print("2. Sfera \n");
            System.out.print("3. Išeiti \n");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:{
                    System.out.println("Įveskite koordinates: ");

                    System.out.print("x1: ");
                    BufferedReader brx1 = new BufferedReader(new InputStreamReader(System.in));
                    double x1 = brx1.read();

                    System.out.print("y1: ");
                    BufferedReader bry1 = new BufferedReader(new InputStreamReader(System.in));
                    double y1 = bry1.read();

                    System.out.print("x2: ");
                    BufferedReader brx2 = new BufferedReader(new InputStreamReader(System.in));
                    double x2 = brx2.read();

                    System.out.print("y2: ");
                    BufferedReader bry2 = new BufferedReader(new InputStreamReader(System.in));
                    double y2 = bry2.read();

                    System.out.println("Krypties koeficientas: " + line.findSlope(x1, y1, x2, y2));
                }
                break;
                case 2:{


                }
                break;
                default:{
                    break;
                }
            }
        }while(choice!=3);

    }
}
