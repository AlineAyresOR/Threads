import java.util.Calendar;

public class ExecuteThread implements Runnable {

    @Override
    public void run() {


        while (true) {

            Calendar hours = Calendar.getInstance();
            int hrs = hours.get(Calendar.HOUR_OF_DAY);
            int min = hours.get(Calendar.MINUTE);
            int seg = hours.get(Calendar.SECOND);

            if ((hrs == 8) && (min == 0) && (seg == 0)) {
                System.out.println("Bom dia!!");

            } else if ((hrs == 12) && (min == 0) && (seg == 0)) {
                System.out.println("Boa tarde!!");

            } else if ((hrs == 19) && (min == 0) && (seg == 0)) {
                System.out.println("Boa noite!!");

            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }

    }


    }

