package partA;

abstract class MotorVehicle
{
	public abstract void TurnOn();
	public abstract void TurnOff();
}

public class Car extends MotorVehicle
{
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
}
