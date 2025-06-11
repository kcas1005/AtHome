public class RecursionExample {
    public static int factorial(int n){
        System.out.println(n + "번째 실행중");
        if(n <= 1) return 1;            // 종료 조건
        return n * factorial(n - 1);    // 자기 자신 호출
    }
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("팩토리얼 = " + result);
    }

}
