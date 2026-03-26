public class Minmax {
    //最大値の取得
    public int max(int n1,int n2, int n3){
        if(n1>n2){
            return n1;
        }
        else if(n2>n3){
            return n2;
        }
        else{
            return n3;
        }
    }
    //最大値の取得
    public int min(int n1,int n2,int n3){
        if(n1<n2){
            return n1;
        }
        else if(n2<n3){
            return n2;
        }
        else{
            return n3;
        }
        
    }
}
