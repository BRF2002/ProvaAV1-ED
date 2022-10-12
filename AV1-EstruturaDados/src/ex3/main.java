package ex3;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Deque<RS> redeSocial = new LinkedList<RS>();

        int key=0;
        String publi;
        byte relevante;
        do {
            System.out.println("<1>Cadastrar Post \n<2>Visualizar Posts Relevantes \n<3>Sair");
            key = scan.nextInt();
            scan = new Scanner(System.in);
            switch (key){
                case 1:

                    System.out.println("O que deseja postar: ");
                    publi = scan.nextLine();


                    System.out.println("Este post é relevante? (1= Relevante | 2= Normal)");
                    relevante = scan.nextByte();

                    if (relevante==1){
                        RS Post = new RS(publi, relevante);
                        redeSocial.addFirst(Post);
                    } else if (relevante == 2) {
                        RS Post = new RS(publi, relevante);
                        redeSocial.addLast(Post);
                    }else{
                        System.out.println("Defina Corretamente");
                    }

                    break;
                case 2:

                    for (RS post: redeSocial){
                        if (post.getRelevancia()==1){
                            System.out.println(post.getMsg() +"\n");
                        }
                    }

                    break;
                case 3:
                    System.out.println("Parabéns por participar da rede ");
                    break;
                default:
                    System.out.println("O valor está inválido!");

            }

        }while(key!=3);
    }

}
