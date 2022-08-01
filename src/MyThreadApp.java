

public class MyThreadApp {

    public static void main (String [] args){
        // Instanciar a thread aqui.
        // run executa na mesma thred.
        //start cria uma nova thread.

        ExecuteThread threadNew = new ExecuteThread();
        Thread threadEx = new Thread(threadNew);
        threadEx.start();


    }
}
