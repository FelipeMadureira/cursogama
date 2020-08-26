package exercicios;

public class Exercicio06 {
    public static void main(String[] args) {
        int i, a;

        a = 10;
        i = 0;
        while(i < 3){
            a = a + i;
            i++;
        }
        System.out.println("(while) O valor de a é " + a);

        a = 10;
        for (i = 0; i < 3; i++) {
            a = a + i;
        }
        System.out.println("(for) O valor de a é " + a);
    }
}