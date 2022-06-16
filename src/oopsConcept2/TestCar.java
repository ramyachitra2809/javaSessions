package oopsConcept2;

public class TestCar {

	public static void main(String[] args) {
		
		BMWCar obj = new BMWCar();
		obj.start();
		obj.fitSafety();
		obj.stop();
		obj.refill();
		
		//Top Casting
		
		CarClass c = new BMWCar();
		c.start();
		c.refill();
		
		//Down Casting
		
		BMWCar b= (BMWCar) new CarClass();
		b.start();
		//gives run time expection casting casting cannot be done

	}

}
