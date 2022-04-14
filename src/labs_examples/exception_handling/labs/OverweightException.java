package labs_examples.exception_handling.labs;

/*Exercise_07.java - Create Custom Exception*/

public class OverweightException extends Exception{
    @Override
        public String toString(){
        return "OverweightException - the maximum weight allowed is 100 tonnes";
    }

}
