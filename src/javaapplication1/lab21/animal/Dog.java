package animal;

public class Dog implements Animal { // 實作 Animal 功能

    @Override
    public void eat() { // 實作吃
        System.out.println("狗喜歡吃骨頭");
    }

}
