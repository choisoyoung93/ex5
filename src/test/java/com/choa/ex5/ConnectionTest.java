package com.choa.ex5;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.choa.ex5.MyAbstractTest;

public class ConnectionTest extends MyAbstractTest{
	private SqlSession SqlSession;
	@Test
	public void test() {
		assertNull(SqlSession);
	}
}
