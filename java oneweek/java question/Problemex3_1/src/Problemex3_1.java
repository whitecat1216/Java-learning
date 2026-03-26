public class Problemex3_1 {
    public static void main(String[] args)  {
        // 戦闘機クラスのインスタンスの生成
        AirPlane fighter = new FighterAiracraft();
        AirPlane airliner = new PassengerPlane();
        
        // 戦闘機クラスの処理
        System.out.println(fighter.getType() + "の処理:");
        fighter.fly();                  // 飛行する
        if (fighter instanceof FighterAiracraft) {
            ((FighterAiracraft) fighter).fight(); // 戦闘する
        }
        
        // 旅客機クラスの処理
        System.out.println(airliner.getType() + "の処理:");
        airliner.fly();                // 飛行する
        if (airliner instanceof PassengerPlane) {
            ((PassengerPlane) airliner).carryPassengers(); // 乗客を運ぶ
        }
    }
}
