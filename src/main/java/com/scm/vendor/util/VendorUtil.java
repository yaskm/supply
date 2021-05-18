package com.scm.vendor.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.scm.model.Vendor;

public class VendorUtil {
	public static List<Vendor> listOfVendors = new ArrayList<Vendor>();
	
	public static List<Vendor> VenodrConverter(ResultSet rs) throws SQLException {
		while(rs.next()) {
			Vendor VendorDetails = new Vendor();
			VendorDetails.setVrndorID(rs.getInt("VrndorID"));
			VendorDetails.setVendorName(rs.getString("VendorName"));
			VendorDetails.setVendorPassword(rs.getString("VendorPassword"));
			VendorDetails.setVendorCity(rs.getString("VendorCity"));
			listOfVendors.add(VendorDetails);
		}
		return listOfVendors;
	}
	public static String searchByVendorName(String s)  {
	   
		return s;
	}
	public static String searchByVendorId(int  i)  {
		   
		return "";
	}
	public static  Vendor searchByVendorNamev1(String s)  {
		   
		return null;
	}
	public static Vendor searchByVendorNamev1(int s)  {
		   
		return null;
	}


}
