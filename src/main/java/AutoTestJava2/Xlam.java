package AutoTestJava2;

public class Xlam {




    public static void main(String[] args) {
        int i;
        for(i = 1; i <= 50; i++) {
             if (i == 15) System.out.println("");
             else if (i >= 25 && i <= 30) System.out.println("");
             else if (i %2 == 1) System.out.println("Hello " + i);
             else if (i %2 != 1) System.out.println("Next hello " + i);
        }
        System.out.println("_________________________________________");
        i = 0;
        while (i < 30){
            i++;
            if(i == 15) System.out.println(" " + i);
            else if (i >= 25) System.out.println("Hello third " + i);
        }
    }
}
