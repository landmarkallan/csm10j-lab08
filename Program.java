/**
* Lab 08 CSM10J
* Abtract Classes, Inheritance
* super methods
*
* @author johnr
*/

public class Program
{
	public static void TestPartA()
	{
		System.out.println("Part A");
		partA.Car car = new partA.Car();
		car.TurnOn();
		System.out.println();
		car.TurnOff();
		System.out.println();
	}
	public static void TestPartB()
	{
		System.out.println("Part B");
		partB.Car car = new partB.Car("Cadillac");
		System.out.println("Car is a " + car.getName());
	}
	public static void TestPartC()
	{
		System.out.println("Part C");
		partC.Convertible mercedes = new partC.Convertible("SL550", false);
		mercedes.TurnOff();
	}
	public static void main(String[] args)
	{
		System.out.println();
		TestPartA();
		System.out.println();
		TestPartB();
		System.out.println();
		TestPartC();
		System.out.println();
	}
}
