//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

public class Test1 {
    int ball =23;
    void a() {
        int box = (5 <= ball) ? ball % 5 : 0;
        System.out.println("필요한 박스의 개수는 "+box+"개");
    }
    void b() {
        int box;
        if ( 5 <= ball ) {
            box = ball % 5;
        } else {
            box = 0;
        }
        System.out.println("필요한 박스의 개수는 "+box+"개");
    }
    public static void main(String[] args) {
        //- 상자 하나에는 농구공이 최대 5개 들어갈 수 있다.
        //- 만약 농구공이 23개라면 몇 개의 상자가 필요할까?
                //- 농구공의 갯수 당 필요한 상자의 수를 출력하는 코드를 작성하세요.
        Test1 main = new Test1();
        main.a();
        main.b();

    }



}
