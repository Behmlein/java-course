class RandomNumberGreaterTen {

    RandomNumber rand = new RandomNumber();
    int Number = 0;
    
    int greaterTen(){
        do {
        Number = rand.giveNumber();
        } while(Number < 11);
        
        System.out.println("Eine Zahl die größer als 10 ist: " + Number);
        return Number;
    }
}
