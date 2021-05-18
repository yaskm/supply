package com.scm.vendor.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.scm.db.Dbconector;
import com.scm.model.Vendor;

public class VendorProduct {
    static  Connection con =null;
	public static void vendorInsert(Vendor v) throws SQLException {
		con = Dbconector.mydbconnection();
		String str = "INSERT INTO VendorProduct (VendorName ,VendorPassword ,VendorCity)VALUES (?,?,?)";
		PreparedStatement ps = con.prepareStatement(str);
		ps.setString(1, v.getVendorName());
		ps.setString(2, v.getVendorPassword());
		ps.setString(3, v.getVendorCity());
		ps.executeUpdate();
		return;

	}

	public static List<Vendor> vendorDisplay() throws SQLException {
		con = Dbconector.mydbconnection();
		String str = "SELECT * FROM Vendor";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(str);
		List<Vendor> listOfVendor = VendorUtil.VenodrConverter(rs);
		return listOfVendor;
	}

	public static boolean removeVendorById(int UserID) {
		con = Dbconector.mydbconnection();
		String str = "DELETE FROM Vendor WHERE VrndorID = ?";
		return false;
	}

	public static boolean removeVendorByName(int UserID) {
		con = Dbconector.mydbconnection();
		String str = "DELETE FROM Vendor WHERE VendorName= ?";
		return false;
	}
}
