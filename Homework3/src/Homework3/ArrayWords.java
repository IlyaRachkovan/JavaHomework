package Homework3;
import java.util.Scanner;
/**
 * Created by Ilya on 21.04.2017.
 */
public class ArrayWords {
    public static void main(String[] args) {
        //Разбиение текста на слова
        String text = "Кот рыба птица собака";
        String [] myAnimals = text.split(" ");//Разбили на слова

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите индекс слова");
        String index = scan.nextLine();
        //Найти слово и вывести индекс
        for (int beast = 0; beast < myAnimals.length; beast++ ){
            if (index.equals(myAnimals[beast])){
                System.out.println(myAnimals[beast]);
                System.out.println(beast);
            }
        }
    }
}
