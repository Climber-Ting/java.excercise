public class Demo1 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            for(int j=0;j<20;j++){
                if(j>10){
                    System.out.println(j);
                    break;//只是跳出当前循环
                }
            }
        }
    }
}
