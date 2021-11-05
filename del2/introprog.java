package del2;

import java.util.Scanner;

public class introprog {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your words");


        TestText myText = new TestText();


        while (!(myText.isStopped())){

            String text = scan.nextLine();
            myText.lines(text);
            if(myText.isStopped()) {

                myText.addCharacters(text);

            }else{
                myText.addCharacters(text);
            }

        }
        System.out.println("Number of rows are" + " " + myText.getRows());
        System.out.println("Number of charachters " + " " + myText.getCharacters());



    }


}
