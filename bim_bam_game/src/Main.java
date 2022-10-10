import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static boolean game = true;
    static public long number;


    public static void main(String[] args) {
        Mechanics obj = new Mechanics();

        while(game){
            obj.obtainData();
            obj.maths(number);

            if(obj.maths(number) == 0){
                obj.Bim();
            }else if(obj.maths(number) == 1){
                obj.Bam();
            }else{
                String bimbam = obj.bim.concat(obj.bam);
                System.out.println(bimbam);
            }
        }
    }
}

class Mechanics{

    String bim = "bim";
    String bam = "bam";

    public void obtainData() {
        Scanner scan = new Scanner(System.in);
        boolean input = true;

        do {
            try {
                System.out.print("Enter any number (9999 to exit): ");
                Main.number = scan.nextLong();

                if(Main.number == 9999){
                    System.exit(0);
                }

                input = false;

            } catch (InputMismatchException e) {
                System.out.println("Integer expected! Try again... ");
                scan.nextLine();
            }
        }while(input);
    }

    public long maths(long x){
        long result = Main.number % 3;
        return result;
    }

    void Bim(){
        System.out.println(bim);
    }
    void Bam(){
        System.out.println(bam);
    }
}

