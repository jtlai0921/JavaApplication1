
public class 日期Test {


    public static void main(String[] args) {
        
        日期 a = new 日期();
//        a.年 = 2018;
        a.set年(2018);
//        a.月 = 15;
        a.set月(15);
//        a.日 = 35;
        a.set日(35);
        a.顯示資料();
        
        // 測試獲取值
        System.out.println("年:" + a.get年());
        System.out.println("月:" + a.get月());
        System.out.println("日:" + a.get日());

        
        
            
    }
    
}
