class Car{
    protected int gas;

    public Car() {
        gas = 10;
    }

    public void displayGasLevel() {
        System.out.println("The gas level is: " + gas);
    }
    public void gameOver(){
        if(gas<=0){
            System.out.println("game over");
        }
    }

}