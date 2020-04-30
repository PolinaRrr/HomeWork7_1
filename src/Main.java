import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        Animal animalCat = new Animal("CatsCategory");
        Cat[] catsArray = new Cat[3];
        catsArray[0] = new Cat("Салем", 200, false, 2, 20);
        catsArray[1] = new Cat("Вискерс", 200, false, 2, 30);
        catsArray[2] = new Cat("Живоглот", 200, false, 2, 150);
        animalCat.animalInfo();
        feedCats(catsArray);

    }

    //кормим всех котов и выводим сытость
    private static void feedCats(Cat[] catsArray){
        Bowl someBowl = new Bowl(500);
        someBowl.fillFood(200);
        for (int i = 0; i < catsArray.length; i++) {
            catsArray[i].getFood(someBowl);
            System.out.println("Кот: " + catsArray[0].name + " " + "Сытость: " + catsArray[0].satiety);
        }
        System.out.println("Еды в миске сейчас: " + someBowl.countFood());
    }
}
