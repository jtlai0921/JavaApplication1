
public class 日期 {

    private int 年; // private (私有)，其他類別看不到
    private int 月;
    private int 日;
    
    public 日期() {
        
    }
    
    public 日期(int 年, int 月, int 日) {
        set年(年);
        set月(月);
        set日(日);
    }
    
    

    // Setter ( 以 set開頭來命名，負責檢查設定值是否合理 )
    public void set年(int 年) {
        this.年 = 年;
    }

    public void set月(int 月) {
        if (月 < 1 || 月 > 12) {
            System.out.println("錯誤的月份: " + 月);
            return; // 結束
        }
        // 如果已經 return , 這裡不會執行
        this.月 = 月;
    }

    public void set日(int 日) {
        switch (月) {
            case 1:
            case 3:
            case 5:
                // 範例只示範了 1, 3, 5 月份，其他 31 天的月份需自行補上
                if (日 < 1 || 日 > 31) {
                    System.out.println("錯誤的天數: " + 日);
                    return; // 結束
                }
                break;
            case 4:
            case 6:
                if (日 < 1 || 日 > 30) {
                    System.out.println("錯誤的天數: " + 日);
                    return; // 結束
                }
                break;
            case 2:
                if (日 < 1 || 日 > 28) {
                    System.out.println("錯誤的天數: " + 日);
                    return; // 結束
                }
                break;
            default:
                break;
        }
        // 如果已經 return , 這裡不會執行
        this.日 = 日;

    }
    
    //getter

    public int get年() {
        return 年;
    }

    public int get月() {
        return 月;
    }

    public int get日() {
        return 日;
    }
    

    public void 顯示資料() {
        if (年 == 0 || 月 == 0 || 日 == 0) {
            System.out.println("無效的日期");
        } else {
            System.out.println("日期 = " + 年 + "/" + 月 + "/" + 日);
        }
    }

}
