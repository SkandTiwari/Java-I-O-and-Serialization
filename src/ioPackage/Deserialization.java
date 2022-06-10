package ioPackage;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String arg[]) {
		try {
			FileInputStream fin= new FileInputStream("D://JavaIo.txt");
			ObjectInputStream obs= new ObjectInputStream(fin);
			VehicleState vs = (VehicleState)obs.readObject();
			System.out.println(vs.fuelLevel+" "+vs.vehicleName+" "+vs.locationCrdnts);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
