package partC;

abstract class MotorVehicle
{
	// members:
	
	private String name;
	
	// methods:
	
	public abstract void TurnOn();
	public abstract void TurnOff();
	
		// accessors:
	
	public String getName()
	{
		return this.name;
	}
	
		// constructors:
		
	public MotorVehicle(String name)
	{
		this.name = name;
	}
}

class Car extends MotorVehicle
{
	// methods:
	
	@Override
	public void TurnOn()
	{
		System.out.print(this.getName() + " is starting");
	}
	@Override
	public void TurnOff()
	{
		System.out.print(this.getName() + " is stopping");
	}
	
		// constructor methods:
		
	public Car(String name)
	{
		super(name);
	}
}

public class Convertible extends Car
{
	// members:
	
	private boolean topUp;
	
	// methods:
	
	@Override
	public void TurnOff()
	{
		this.putTopUp();
		super.TurnOff();
	}
	
	public void putTopUp()
	{
		this.topUp = true;
		System.out.println("Putting top up");
	}
	
		// constructor methods:
		
	public Convertible(String name, boolean topUp)
	{
		super(name);
		this.topUp = topUp;
	}
}
