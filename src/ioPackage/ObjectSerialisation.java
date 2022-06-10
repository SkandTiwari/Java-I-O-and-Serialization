package ioPackage;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectSerialisation {
	public static void main(String args[]) {
		try {
		FileOutputStream fout = new FileOutputStream("D:\\JavaIo.txt");
		ObjectOutputStream obs = new ObjectOutputStream(fout);
		VehicleState vs = new VehicleState(23, "XRB-1200", "110E-123S");
		obs.writeObject(vs);
		obs.flush();
		obs.close();
		System.out.println("Success...");
		}catch(Exception e) {
			System.out.print("Error Occured!");
		}
	}
}
