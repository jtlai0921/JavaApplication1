package animal;

public class Factory {

    public Animal createAnimal() {
        return new Dog(); // 可更換為任何 Animal 物件
    }
}
