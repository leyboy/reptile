package com.reptile.util.db;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import com.reptile.util.constants.ReptileConstants;

/**
 * @author LiuEnYuan
 * @version 1.1 datasource util
 **/
public final class DataSourceUtil {

	/**
	 * get data source
	 **/
	public static DataSource getDataSource() throws Exception {
		Properties properties = new Properties();
		properties.load(new FileInputStream(ReptileConstants.JDBC_PROPERTIES_POSITION));
		System.out.println(properties.get("password"));
		DataSource dataSource = BasicDataSourceFactory.createDataSource(properties);
		return dataSource;
	}

	/**
	 * release connection
	 **/
	public static void releaseConnection() throws SQLException, Exception {
		Connection connection = getDataSource().getConnection();
		if (connection != null) {
			connection.close();
		}
	}

}
