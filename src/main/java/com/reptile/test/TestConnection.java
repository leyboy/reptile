package com.reptile.test;

import static org.junit.Assert.*;



import org.junit.Test;

import com.reptile.util.db.DataSourceUtil;

public class TestConnection {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testConnection() throws Exception{
		System.out.print(DataSourceUtil.getDataSource().getConnection());
	}

}
