
public class 帳戶 {

    private 日期 開戶日期;
    private int id;
    private static int count; // 統計物件數量 (靜態資料只有一份)
    private String 名稱;
    private int 餘額;

    // 建構子
    public 帳戶(日期 開戶日期, String 名稱, int 餘額) {
        
        int 年 = 開戶日期.get年();
        int 月 = 開戶日期.get月();
        int 日 = 開戶日期.get日();
        
        this.開戶日期 = new 日期(年, 月, 日);// 建立帳戶自己的日期物件
        this.名稱 = 名稱;
        this.餘額 = 餘額;

    }

    private void 計算id() {
        id = ++count; // count 加完1 複製給 id
    }

    public void 設定名稱(String 名稱) {
        // this 內建的遙控器，代表執行目前動作的物件
        this.名稱 = 名稱;
    }

    public void 存款(int 金額) {
        if (金額 <= 0) {
            System.out.println("存款失敗，錯誤的金額: " + 金額);
            return; // 結束存款動作
        }
        餘額 += 金額;
        System.out.println("存款成功: " + 金額);
    }

    public void 提款(int 金額) {
        if (金額 <= 0) {
            System.out.println("提款失敗，錯誤的金額: " + 金額);
            return; // 結束提款動作
        }
        if (金額 > 餘額) {
            System.out.println("餘額不足，提款失敗: " + 金額);
            return; // 結束提款動作
        }
        餘額 -= 金額;
        System.out.println("提款成功: " + 金額);
    }

    public void 顯示資料() {
        開戶日期.顯示資料();
        System.out.println("id\t" + id);
        System.out.println("名稱\t" + 名稱);
        System.out.println("餘額\t" + 餘額);
        System.out.println(); // 空一行
    }
}
