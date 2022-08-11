public class Bus extends Transport{

    int maxP;  // 남은좌석
    int nowP;  // 현재 탑승객
    int cost;
    String busNum;
    int gas;
    int speed;
    String stat; // InService : 운행중,   end : 차고지
    

    public Bus(String busNum){
        this.busNum = busNum;
        this.stat = "inService";
        this.maxP = 30;
        this.nowP = 0;
        this.gas = super.gas;
        this.speed = super.speed;
        this.cost = 0;

    }

    public void fuel(int x){
        this.gas = this.gas+x;
        System.out.println("remain gas : "+this.gas);
        if(this.gas < 10){
            this.changeStat();
        }
    }

    public void changeStat(){
        if(this.stat == "inService"){
            this.stat = "end";
            this.maxP = 30;
            this.nowP = 0;
            this.cost = 0;
            if(this.gas<10){
                System.out.println("!! require more gas !!");
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
                this.cost = this.cost+(x*1000);
            }
        }
    }


    public void showBus(){
        System.out.println("now Passenger : "+this.nowP);
        System.out.println("remain seat : "+this.maxP);
        System.out.println("now cost : "+this.cost);
    }



}
