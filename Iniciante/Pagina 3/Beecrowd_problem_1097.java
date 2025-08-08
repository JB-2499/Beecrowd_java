public class Main {
    public static void main(String[] args) {
        int i = 1;
        int j = 7;
        int maior_j = j;
        while (i <= 9) {
            System.out.println("I="+i+" J="+j);
            j -= 1;
            if(maior_j - j >= 2) {
                System.out.println("I="+i+" J="+j);  
                i += 2;
                j = maior_j + 2;
            }
            if(j > maior_j) {
                maior_j = j;
            }
        }
    }
} 
