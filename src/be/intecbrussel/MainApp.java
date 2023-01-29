package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {
        // Type casting is wanneer je een waarde toewijst van een primitieve datatype naar een ander datatype.
        //We kennen 2 manieren om een type casting te doen:

        System.out.println(" ---- Widening casting ---- ");
        // Widening Casting - omzetten van een kleinere type naar een grotere type.

        int myInt = 9;

        // Automatische casting: int naar double
        double myDouble = myInt;

        System.out.println("Integer = " + myInt);
        System.out.println("Double = " + myDouble);

        // De conversie tussen numeriek datatype naar char of Boolean gebeurt niet automatisch.
        // Ook zijn de gegevenstypen char en Boolean niet compatibel met elkaar.

        char myChar = 'q';

        // compileer fout "incompatible types: char cannot be converted to boolean"
        // boolean myBoolean = myChar;

        // System.out.println(myChar);
        // System.out.println(myBoolean);

        System.out.println(" ---- Narrowing casting ---- ");
        // Narrowing Casting (handmatig) - een groter type omzetten naar een kleiner formaat type.

        double Double = 9.78d;

        // Manueel casting: double naar int
        int myInteger = (int) Double;

        System.out.println("Double = " + Double);
        System.out.println("Integer = " + myInteger);

    }
}
