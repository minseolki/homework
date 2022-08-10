public class TaxiExam {
    public static void main(String[] args) {
        Taxi t1 = new Taxi("1111");
        Taxi t2 = new Taxi("2222");

        System.out.println("Taxi 1 : "+t1.taxiNum);
        System.out.println("Taxi 2 : "+t2.taxiNum);
        System.out.println(t1.gas);
        System.out.println(t1.stat);

        t1.boarding(2);
        t1.setDest("Seoul Station",2);

        t1.showTaxi();
        t1.fuel(-80);
        System.out.println("total cost : "+t1.pay);
        t1.arrival();

        t1.boarding(5);

        t1.boarding(3);
        t1.setDest("Guro Digital Station",12);
        t1.showTaxi();

        t1.fuel(-20);
        t1.arrival();
        System.out.println(t1.gas);
        System.out.println(t1.stat);
        System.out.println(t1.income);




    }
}
