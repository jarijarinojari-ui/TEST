public class Test2 {
    public static void main(String[] args) {
        int k = 0;
        int z = 0;
        for (int i = 1; i <= 10; i++){
            k = 0;
            for (int j = 1; j <= i; j++){

                System.out.print(j);
                k += j;
            }
            System.out.print(" = " + k);
            System.out.println();
            z += k;
        }
        System.out.println(z);
    }
}
