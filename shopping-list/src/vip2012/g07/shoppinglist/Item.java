/**
 * 
 */
package vip2012.g07.shoppinglist;

import java.util.Date;

/**
 * @author codai2810
 *
 */
public class Item {
	private int id;
	private String name;
	private int priority;
	private float quantity;
	private float price;
	private String unit;
	private int status;
	private String place;
	private Date time;
	
	Item() {
		name = "";
		priority = 0;
		quantity = 0;
		price = 0;
		unit = "";
		status = 0;
		place = "";
		time = null;
	}
	
	Item(String iname) {
		name = iname;
		priority = 0;
		quantity = 0;
		price = 0;
		unit = "";
		status = 0;
		place = "";
		time = null;
	}
	
	Item(String iname, int ipriority) {
		name = iname;
		priority = ipriority;
		quantity = 0;
		price = 0;
		unit = "";
		status = 0;
		place = "";
		time = null;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String iname) {
		name = iname;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPriority(int ipriority) {
		priority = ipriority;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public void setQuantity(float iquantity) {
		quantity = iquantity;
	}
	
	public float getQuantity() {
		return quantity;
	}
	
	public void setPrice(float iprice) {
		price = iprice;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setUnit(String iunit) {
		unit = iunit;
	}
	
	public String getUnit() {
		return unit;
	}
	
	public void setStatus(int istatus) {
		status = istatus;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setPlace(String iplace) {
		place = iplace;
	}
	
	public String getPlace() {
		return place;
	}
	
	public void setTime(Date itime) {
		time = itime;
	}
	
	public Date getTime() {
		return time;
	}
	
	//TODO
	public String toString() {
		return null;
	}
}
