public class MethodExecution {
    public static void main(String[] args) throws InterruptedException {
        /* 
        //Thread 메소드 실행 
        Thread mt = new MyThread();
        mt.start();                                     //Start() 새 스레드 만들고 run() 실행
        
        //Runnable 메소드 실행 (다중 상속 불가 문제 해결)
        Thread mr = new Thread(new MyRunnable());
        mr.start();                                     //별도 스레드에서 실행
        */
        /* 스레드가 겹쳐서 값이 이상하게 나옴
        Counter counter = new Counter();

        Thread mt1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++)
            counter.increment();
        });
        Thread mt2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++)
            counter.increment();
        });

        mt1.start();
        mt2.start();
        mt1.join();
        mt2.join();

        System.out.println("최종 count( 정상값 아님) : " + counter.count);
        */
        
        /*
        //동기화 시켜서 해결
        Counter counter = new Counter();

        Thread mt1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++)
            counter.synchronizedIncrement();
        });
        Thread mt2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++)
            counter.synchronizedIncrement();
        });

        mt1.start();
        mt2.start();
        mt1.join();
        mt2.join();

        System.out.println("최종 count( 정상값) : " + counter.count);
        */

        /*
        // ReentrantLock으로 해결하는 방법
        Counter counter = new Counter();

        Thread mt1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) counter.reentrantLockIncrement();
        });

        Thread mt2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) counter.reentrantLockIncrement();
        });

        mt1.start();
        mt2.start();
        mt1.join();
        mt2.join();

        System.out.println("최종 count (정확하게 나옴) : " + counter.getCount());
         */
    }
}
