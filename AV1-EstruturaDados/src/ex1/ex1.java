package ex1;

public class ex1 {
        public static void main(String[] args) {

            int vetor[] = {3, 8, 7, 9, 10, 11, 80, 2, 1, 50};
            int j= 0, val= 0, con=0;
            for ( int i = 0; i< vetor.length; i++){
                val = vetor[i];
                j = i - 1;

                while ((j >= 0) && (val < vetor[j])) {
                    con = vetor [j+1];
                    vetor[j + 1] = vetor[j];
                    vetor[j]=con;
                    j=j-1;
                    if (j==-1){
                        break;
                    }

                }
            }

            for ( int i=0; i< vetor.length; i++)
                System.out.println(vetor[i]);
        }

    }


