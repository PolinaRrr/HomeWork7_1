class Bowl {
    int volume;
    private int foodInBowl;

    // конструктор миски
    public Bowl(int volume){
        this.volume = volume;
    }

    public int getFoodInBowl(){
        return this.foodInBowl;
    }

    public void setFoodInBowl(int newFood){
        if(newFood >= 0) {
            this.foodInBowl = newFood;
            if (newFood == 0){
                needFood();
            }
        }
    }

    // наполняем миску едой
    public void fillFood(int x){
        if(x + foodInBowl <= volume){
            // к количеству в миске добавлем порцию еды
            foodInBowl = foodInBowl + x;
        } else {
            // количество еды не можем превышать объема миски
            foodInBowl = volume;
        }
    }
    // узнаем сколько в миске еды на данный момент
    int countFood(){
        return foodInBowl;
    }


    /**
     * метод наполняет миску при нехватке еды
     */
    private void needFood(){
        if(foodInBowl == 0){
            System.out.println("Добавьте корма");
            fillFood(volume - foodInBowl);
        }

    }

}