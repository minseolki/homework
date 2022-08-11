public class Taxi extends Transport{
    String taxiNum;   // 택시번호
    int gas;
    int speed;
    String dest;
    int basicDis;  // 기본거리
    int destDis;  // 추가거리
    int basicFee; // 기본요금
    int extraFee;  // 추가요금
    String stat;  // InService : 운행중,   end : 차고지
    int pay = this.basicFee+this.extraFee;  // 계산금액

    int income; //  누적금액

    public Taxi(String num){
        this.taxiNum = num;
        this.stat = "inService";
        this.maxP = 4;
        this.nowP = 0;
        this.basicDis = 1;
        this.basicFee = 3000;
        this.extraFee = 1000;
        this.dest = "";
        this.speed = super.speed;
        this.gas = super.gas;
        this.income = 0;

    }

    public void fuel(int x){
        if(this.gas !=0){
            this.gas = this.gas+x;
            System.out.println("remain gas : "+this.gas);
        }
    }

    public void changeStat(){
        if(this.stat == "inService"){
            this.stat = "end";
            if(this.gas==0){
                this.stat ="end";
            }
        }else{
            this.stat = "inService";
        }
    }

    public void boarding(int x){
        if(this.stat == "inService"){
            if(this.maxP<this.nowP+x){
                System.out.println("!! There is no seat !!");
            }else{
                this.nowP = this.nowP+x;
                this.maxP = this.maxP-x;

            }
        }
    }

    public void setDest(String dest, int destDis){
        if(nowP>0){
            this.dest = dest;
            this.destDis=destDis;
        }else{
            System.out.println("There is no Passneger");
        }

    }

    public void arrival(){
        this.maxP = 4;
        this.nowP = 0;
        this.basicDis = 1;
        this.basicFee = 3000;
        this.extraFee = 1000;
        this.dest = "";

        if(this.gas == 0){
            this.stat = "end";
            System.out.println("!!out of gas!!");
        }
        this.income = this.income+this.pay;

    }

    public int totalCost(){
        this.pay = this.basicFee+(this.extraFee*(this.destDis-this.basicDis));
        return this.pay;
    }


    public void showTaxi(){
        System.out.println("now Passenger : "+this.nowP);
        System.out.println("remain seat : "+this.maxP);
        System.out.println("basic fee : "+this.basicFee);
        System.out.println("destination : "+this.dest);
        System.out.println("distance : "+this.destDis+"Km");
        System.out.println("total cost : "+totalCost());
        System.out.println("stat : "+this.stat);
    }

}
