public class Platypus {
	
      private String name;
      

      Platypus(String NM){
    	  System.out.println("hi");
    	  name = NM;
      }
      
      
      	void sayHi(){
            	System.out.println("The platypus " + name + " is smarter than your average platypus.");
      	}
      	
      	
      	
      	
      	
      	
      	
      	public static void main(String[] args) {
		Platypus a = new Platypus("is bad and");
		Platypus b = new Platypus("is good and");
		a.sayHi();
		b.sayHi();
		
	}
}