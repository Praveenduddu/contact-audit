package de.zeroco.contact;

import java.util.Map;

public class Service {

	public static Contact getObjectUsingParameters(String name, String email) {
		return new Contact(name, email);
	}
	
	public static Contact getObjectUsingParameters(Integer id, String name, String email) {
		return new Contact(id, name, email);
	}
	
	public static int getGeneratedKey(Contact contact) {
		return Dao.getGeneratedKey(contact);
	}
	
	public static int update(Contact contact) {
		return Dao.update(contact);
	}
	
	public static Map<String, Object> get(int id) {
		return Dao.get("pk_id", id);
	}
	
	public static int delete(int id) {
		return Dao.delete(id);
	}
	
	public static String status(int number) {
		return number > 0 ? "Successfully Completed" : "Not Completed";
	}
}
