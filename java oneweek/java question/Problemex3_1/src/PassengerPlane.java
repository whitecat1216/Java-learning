public class PassengerPlane extends AirPlane {
    
    // コンストラクタでタイプを設定
    public PassengerPlane() {
        this.type = "旅客機";
    }
    
    // flyメソッドを具象化
    @Override
    public void fly() {
        System.out.println("乗客を乗せて目的地まで飛行します。");
    }
    
    // 乗客を運ぶ
    public void carryPassengers() {
        System.out.println("乗客を目的地まで運びます。");
    }
}
