class Person{
        private int pId;
        private String pName;
    
        Person(int pId, String pName){
            this.pId = pId;
            this.pName = pName;
        }
    
	public int  getPId(){return pId;}
	public String getPName(){return pName;}
       public void display(){
           System.out.println("Person Id " + this.pId);
           System.out.println("Person Name " + this.pName);
         }
     }