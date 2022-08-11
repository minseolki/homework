public class BusExam {
    public static void main(String[] args) {
        Bus b1 = new Bus("1234");
        Bus b2 = new Bus("5678");

        System.out.println("Bus 1 : "+b1.busNum);
        System.out.println("Bus 2 : "+b2.busNum);



        b1.boarding(2);
        b1.showBus();
        b1.fuel(-50);
        b1.changeStat();
        System.out.println(b1.stat);
        b1.fuel(10);
        b1.changeStat();
        System.out.println(b1.stat);
        b1.boarding(45);
        b1.boarding(5);
        b1.showBus();
        b1.fuel(-55);
        System.out.println("remain gas : "+b1.gas+"    Status : "+b1.stat);



    }
}
