package labs_examples.packages.labs.two;

public class Hours {

   /*Create two classes, one of which is protected*/
   public double pay(double ratePerHour, double shiftLength){
       return ratePerHour * shiftLength;
   }

   protected void isDoubleTime(){
       boolean isDoubleTime;
       if (isDoubleTime = true); {
           System.out.println("This shift pays double rate");
       }
   }

    public static void main(String[] args) {
        /*Create new Hours object*/
        Hours testHours = new Hours();
        /*Implement pay method on Hours object*/
        double myWages = testHours.pay(10.50, 7.5);
        System.out.println("This shift pays £" + myWages);
        /*Implement isDoubleTime method on Hours object*/
        testHours.isDoubleTime();
    }
}
