public class Computer {

    private Operater opt;
    Server a = new Server();

    Computer(){
        Ram ram01= new Ram();
        CPU inoCpu = new CPU();
        InputTry iT = new InputTry(1);
        TurnOn com1 = new TurnOn(ram01,inoCpu,iT);

    }

    public static void main(){
        new com1();
        Operater opt = new Operater("Hello.");
        a. ... //오퍼레이터와 통신, 일을 할 것인지 물어보기
        //한다면... com1()을 줌. 어떤 일에 사용된다는 예로...
        //켜진 상태이기 때문에, Computer()를 줘야할 것 같다.
        // opt가 TurnOn()부분을 가져야 할 듯.
        //또, 이 메인함수가 다른 클래스에서 만들어 져야할 듯하다. ...
        //opt랑 컴퓨터를 불러오는 클래스를 만들고... 이런 식이겠지.
        // 안전관리, 개인 스케쥴러, 서버, 스레드, 클라이언트. ... 만들어보세요. ...
    }
}
