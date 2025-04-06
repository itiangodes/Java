import java.util.Scanner;

class main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print ("Enter the Number of cups: ");
        int numofcup = input.nextInt();
        int numofdozens = numofcup / 12;
        int numofexcess = numofcup % 12;
    
        System.out.println("Number of Dozens: " + numofdozens);
        System.out.println("Number of Excess: " + numofexcess);
    }
}

