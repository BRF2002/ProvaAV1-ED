package ex2;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
import java.io.File;

public class ex2 {
    public static void main(String[] args) throws FileNotFoundException {

        Stack pilha1 = new Stack();
        Stack pilha2= new Stack();
        Stack pilha3= new Stack();


        Scanner s1 = new Scanner(new File("./txts/pilha1.txt"));
        Scanner s2 = new Scanner(new File("./txts/pilha2.txt"));
        Scanner s3 = new Scanner(new File("./txts/pilha3.txt"));

        while ( s1.hasNextLine() && s2.hasNextLine() && s3.hasNextLine()){
            pilha1.push(s1.nextLine());
            pilha2.push(s1.nextLine());
            pilha3.push(s1.nextLine());
        }
        while (!pilha1.empty() && !pilha2.empty() && !pilha3.empty() ){
            System.out.println("Assistente 1 - prato: "+pilha1.pop());
            System.out.println("Assistente 2 - prato: "+pilha2.pop());
            System.out.println("Assistente 3 - prato: "+pilha3.pop());
        }
    }
}
