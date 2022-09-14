import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Card {

    int cardNumber; String name; String lastname;long idNumber;long piNumber;

    public Card(int cardNumber, String name, String lastname, long piNumber) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.lastname = lastname;
        this.piNumber = piNumber;

    }
    Scanner sc = new Scanner(System.in);
    public void CardOkuma(int cardNumarasi) {
       cardNumarasi = sc.nextInt();

        try {
            if (cardNumarasi == cardNumber) {

                idOkuma(piNumber);
            }
            else
            {
                throw new Exception();
            }

        }catch(Exception e)
        {
            System.err.println("Error reading card");
            System.out.println("There has been an error");
        }
    }
    public void idOkuma(long idNumarasi)
    {
        System.out.println("Enter your identification number");
        idNumarasi=sc.nextInt();

        if(idNumarasi==piNumber)
        {
            System.out.println("İşlem Seçiniz");
        }
        else
        {
            System.out.println("You have entered an incorrect PI Number, please try again, you can try incorrectly 3 times");
           int counter=0;
            while(counter<3 & idNumarasi!=piNumber)
            {
                System.out.println("Enter your identification number");
                idNumarasi=sc.nextInt();

                counter++;
                System.out.println("Please try again you have "+ (3-counter) + " changes to enter incorrectly");
            }
        }

    }
}
