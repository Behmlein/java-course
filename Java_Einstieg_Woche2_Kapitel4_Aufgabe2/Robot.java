class Robot {
    String sentence = "Ich kann sprechen!";
    RandomNumber rand = new RandomNumber();
    int Number;
void speakSeveralTimes(int uebergabe){
    while(uebergabe != 0){
        System.out.println(sentence);
        uebergabe--;
    }
}
void speak(){
  
    
    Number = rand.giveNumber();
    this.speakSeveralTimes(Number);
}

}
