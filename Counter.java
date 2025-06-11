import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int count = 0;
    private final ReentrantLock lock = new ReentrantLock();

    void increment() {
        count++;                        // 여러 스레드가 동시에 실행하면 꼬일 수 있음!
    }
    
    synchronized void synchronizedIncrement(){
        count++;
    }

    void reentrantLockIncrement(){
        lock.lock();                    //락 획득
        try{
            count++;
        }finally{
            lock.unlock();              //락 해제(예외가 발생해도 반드시 해제)
        }
    }

    int getCount(){
        return count;
    }
    
}
