
package cislonaktoremyslim;
import java.util.Scanner;

public class CisloNaKtoreMyslim {

    static int cisloNaKtoreMyslim = 10;
    public static void main(String[] args) {
        boolean vyhral = false;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadajte pocet pokusov: ");
        int pocetPokusov = scanner.nextInt();
        System.out.println("Hladajte cislo, ktore si myslim. Mate na to " + pocetPokusov + " pokusov");
        
        for (int i = 1; i <= pocetPokusov; i++){
            System.out.println("Pokus c. " + i + ": ");
            if(overeneCislo(scanner.nextInt())){
                System.out.println("SUPER!!! Vyhral si na " + i + ". pokus");
                vyhral = true;
                break;
                        
            }
            else
                continue;
        }
        if(vyhral)
            System.out.println("Blahozelame ...");
        else
            System.out.println("Skus stastie nabuduce");
        System.exit(1);
    }
    static boolean overeneCislo(int tip){
        return tip == cisloNaKtoreMyslim?true:false;
    }
}
