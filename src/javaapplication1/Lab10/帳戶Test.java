
public class 帳戶Test {

    public static void main(String[] args) {
        
        日期 開戶日期 = new 日期(2018, 1, 1); // 帳戶 a 與 b 共用了這個日期物件

        帳戶 a = new 帳戶(開戶日期, "Tom", 1000);
        a.顯示資料();

        帳戶 b = new 帳戶(開戶日期, "Amy", 2000);
        b.顯示資料();
        
        System.out.println("------------");
        
        開戶日期.set月(8); // 日期修改
        開戶日期.顯示資料();
        
        System.out.println("------------");
        
        a.顯示資料(); // a 與 b 帳戶 顯示的開戶日期也修改了，因為共用了日期物件，帳戶沒有持有自己的日期物件
        b.顯示資料();
        
    }
    
}
