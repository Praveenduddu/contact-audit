package de.zeroco.contact;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import de.zeroco.jdbc.DBUtil;
import de.zeroco.util.Utility;

public class Dao {

	public static final String SCHEMA = "zerocode";
	public static final String TABLE_NAME = "contact";
	public static final String[] COLUMNS = {"name", "email"};
	public static final String CONDITION_COLUMN = "pk_id";
	public static final String ASSIGN_OPERATOR = "=";
	
	public static int getGeneratedKey(Contact contact) {
		List<Object> values = getListFromObject(contact);
		int genereatedKey = 0;
		Connection connection = Utility.getConnection(DBUtil.URL, DBUtil.USER, DBUtil.PASSWORD, Dao.SCHEMA);
		genereatedKey = DBUtil.getGeneratedKey(SCHEMA, TABLE_NAME, Arrays.asList(COLUMNS), values, connection);
		Utility.closeConnection(connection);
		return genereatedKey;
	}
	
	public static int update(Contact contact) {
		List<Object> values = getListFromObject(contact);
		int numOfRowsUpdate = 0;
		Connection connection = Utility.getConnection(DBUtil.URL, DBUtil.USER, DBUtil.PASSWORD, SCHEMA);
		numOfRowsUpdate = DBUtil.update(SCHEMA, TABLE_NAME, Arrays.asList(COLUMNS), values, connection);
//		numOfRowsUpdate = DBUtil.update(SCHEMA, TABLE_NAME, Arrays.asList(COLUMNS), values, Dao.CONDITION_COLUMN, contact.getId(), connection);
		Utility.closeConnection(connection);
		return numOfRowsUpdate;
	}
	
	public static int delete(int id) {
		int numOfRowsUpdate = 0;
		Connection connection = Utility.getConnection(DBUtil.URL, DBUtil.USER, DBUtil.PASSWORD, SCHEMA);
		numOfRowsUpdate = DBUtil.delete(SCHEMA, TABLE_NAME, CONDITION_COLUMN, id, connection);
		Utility.closeConnection(connection);
		return numOfRowsUpdate;
	}
	
	public static List<Object> getListFromObject(Contact contact) {
		List<Object> values = new ArrayList<Object>();
		values.add(contact.getName());
		values.add(contact.getEmail());
		return values;
	}
	
	public static Map<String, Object> get(String column, Object value) {
		Map<String, Object> data = new LinkedHashMap<String, Object>();
		Connection connection = Utility.getConnection(DBUtil.URL, DBUtil.USER, DBUtil.PASSWORD, SCHEMA);
		data = DBUtil.get(SCHEMA, TABLE_NAME, Arrays.asList(), column, ASSIGN_OPERATOR, value, connection);
		Utility.closeConnection(connection);
		return data;
	}
	
}
