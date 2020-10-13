package ro.siit;

import java.util.Random;

public class ExceptionGenerator {
    public static void generateException() throws Exception{
        Random randomizer = new Random();
        while(true){
            int nr = randomizer.nextInt(10);
            if(nr%5 == 0){
                throw new Exception(nr + " este divizibil cu 5");
            } else {
                System.out.println("Generam " + nr);
            }
        }
    }
}
