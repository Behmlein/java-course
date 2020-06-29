class Robot {
	int i = 0;
	int k = 0;
	void identifyIP(){
	    Email email = new Email();
	    String[][] array = email.ipaddress;
	    
	    
	    for(i = 0; i <= 2;i++)
	    {
	     for(k= 0; k <= 2; k++)
	     {
	         System.out.print(array[i][k]);
	     }
	     System.out.println();
	    }
	}
	
}
