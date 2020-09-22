import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] bahasa = new String[2][3];

        for(int i=0; i<2; i++){
            for (int j=0; j<3; j++ ){
                System.out.printf("siapa yang akan duduk di kelas (%d,%d) : ",i,j);
                bahasa[i][j] = scan.nextLine();
            }
    }

        System.out.println("==============================================================================");
        for(int i=0; i<2; i++){
            for (int j=0; j<3; j++ ){
                System.out.printf("|%-20s|\t\t",bahasa[i][j]);
            }
            System.out.println();
        }
        System.out.println("==============================================================================");

    }
}
