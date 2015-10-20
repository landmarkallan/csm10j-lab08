package partB;

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

public class Car extends MotorVehicle
{
	// methods:
	
	@Override
	public void TurnOn()
	{
		System.out.print("Car is starting");
	}
	@Override
	public void TurnOff()
	{
		System.out.print("Car is stopping");
	}
	
		// constructor methods:
		
	public Car(String name)
	{
		super(name);
	}
}
