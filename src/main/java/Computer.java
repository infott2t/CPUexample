public class Computer {

    Computer(){
        Ram ram01= new Ram();
        CPU inoCpu = new CPU();
        InputTry iT = new InputTry(1);
        TurnOn com1 = new TurnOn(ram01,inoCpu,iT);
    }

    public static void main(){
        new com1();
    }
}
