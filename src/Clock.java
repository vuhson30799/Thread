public class Clock implements Runnable {
    @Override
    public void run() {

        byte ss = 0, mm = 0, hh = 0;
        while (true){
            String ssStr = "",mmStr = "",hhStr = "";
            ss += 1;
            if (ss == 60){
                mm += 1;
                ss = 0;
            }
            if (mm == 60){
                hh += 1;
                mm = 0;
            }
            if (ss < 10) {
                ssStr = "0" + ss;
            }else {
                ssStr = ss + "";
            }
            if (mm < 10) {
                mmStr = "0" + mm;
            }else {
                mmStr = ss + "";
            }
            if (hh < 10) {
                hhStr = "0" + hh;
            }else {
                hhStr = ss + "";
            }
            System.out.println(hhStr + ":" + mmStr + ":" + ssStr);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
