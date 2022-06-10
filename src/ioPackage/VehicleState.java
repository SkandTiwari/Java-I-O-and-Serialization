package ioPackage;
import java.io.Serializable;
import java.util.*;
public class VehicleState implements Serializable{
	int fuelLevel;
	String vehicleName;
	String locationCrdnts;
	VehicleState(int f, String n, String coor){
		fuelLevel = f;
		vehicleName = n;
		locationCrdnts = coor;
	}
}
