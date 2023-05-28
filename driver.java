 class driver extends Car {
    
    
    
    public void drive() {
        gas -= 1;
        System.out.print("Driving ");
        displayGasLevel();
        gameOver();
    }

    public void boosters() {
        if(gas>=3){
        gas -= 3;
        System.out.print("Boosting  ");
        displayGasLevel();}
        else {
            gameOver();
        }
    }

    public void refuel() {
        if(gas<=8){
        gas += 2;
        System.out.print("Boosting  ");
        displayGasLevel();}
        else{
            gameOver();
        }
    }







}
