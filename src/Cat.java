class Cat extends Animal {
    protected boolean swim;
    int jump;
    // количество еды, которое он съедает за один раз
    int appetite;
    // сытость
    boolean satiety = false;

    //конструктор кота
    Cat(String name, int run, boolean swim, int jump, int appetite) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
        this.appetite = appetite;
    }

    /**
     * метод получения еды
     * @param bowl
     */
    public void getFood(Bowl bowl){
        int a = bowl.countFood();
        if (satiety == false) {
            if (a >= appetite) {
                bowl.setFoodInBowl(bowl.getFoodInBowl() - appetite);
                satiety = true;
            }
        }
    }
}