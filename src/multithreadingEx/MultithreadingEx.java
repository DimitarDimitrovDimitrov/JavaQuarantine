package multithreadingEx;

public class MultithreadingEx{


    public static void main(String[] args){

        ThreadExtendEx threadExtendEx = new ThreadExtendEx();

        RunnableEx runnableEx = new RunnableEx();

        Thread thread2 = new Thread(runnableEx);

        threadExtendEx.setDaemon(false);

        threadExtendEx.start();
        thread2.start();
    }
}

