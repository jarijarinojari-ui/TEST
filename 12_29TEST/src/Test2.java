public class Test2 {
    public static void main(String[] args) {
        int k = 0;
        int z = 0;
        for (int i = 1; i <= 10; i++){
            k = 0;
            for (int j = 1; j <= i; j++){
                System.out.print(j);
                k += j;//두번째 for의 합인 j의 총합을 k에 저장
            }
            System.out.print(" = " + k);
            System.out.println();
            z += k;//첫번째 for의 합인 k의 총합을 z에 저장
            //첫번째 for이 끝나면 k를 초기화 한다.
        }
        System.out.println(z);
    }
}
