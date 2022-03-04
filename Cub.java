package b1;

 abstract class Lion {  // parent, superclass
	protected String brand = "Ford";        // Vehicle attribute
	  public void roar() {                    // Vehicle method
	    System.out.println("big sound");
	  }
	  
	  public abstract void sample();  
	 
}

public class Cub extends Lion{  // child , subclass

	 private String modelName = "Mustang";
		// TODO Auto-generated method stub
		public static void main(String[] args) {

			
			
		    // Create a myCar object
			Cub myCar = new Cub();

		    // Call the honk() method (from the Vehicle class) on the myCar object
		  myCar.roar();

		    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
		    System.out.println(myCar.brand + " " + myCar.modelName);
		  }
	      public void roar(){
			   System.out.println("small kr kr sound");
		   }
	      void add(){
	    	System.out.println("add with no parameter"); 
	      }
		@Override
		public void sample() {
			// TODO Auto-generated method stub
			
		}
	    
	      
	      
}

