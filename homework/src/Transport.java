public class Transport {
    String num;
    int gas;
    int speed;
    int maxP;
    int nowP;

    public Transport(){
        this.gas = 100;
        this.speed = 0;
    }

    public void fuel(int x){
        this.gas = this.gas-x;
    }

    public void changeStat(){

    }
    public void boarding(int x){
        this.nowP = this.nowP+x;
        this.maxP = this.maxP-x;
    }



}
