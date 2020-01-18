package animal;

public class AnimalTest {

    public static void main(String[] args) {

        Factory f = new Factory() {

            @Override
            public Animal createAnimal() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        // 依賴抽象 (變數用抽象型別宣告)
        Animal a = f.createAnimal(); // 透過工廠得到 Animal

        // 執行吃東西
        a.eat();
    }

}
