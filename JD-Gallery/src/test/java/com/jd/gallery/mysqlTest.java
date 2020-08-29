package com.jd.gallery;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
   locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
)	
public class mysqlTest {
//	private static final String DRIVER = "com.mysql.jdbc.Driver";
//	 private static final String URL = "jdbc:mysql://59.29.134.60:3306/jd_galley?serverTimezone=UTC"; // jdbc:mysql://127.0.0.1:3306/여러분이 만드신 스키마이름
//	 private static final String USER = "root"; //DB 사용자명
//	 private static final String PW = "513579";   //DB 사용자 비밀번호
	 
	 @Inject
	   private SqlSessionFactory sqlFactory;
	   
	   @Test
	   public void testFactory() {
	       System.out.println("===== sql session factory check start =====");
	       System.out.println(sqlFactory);
	       System.out.println("===== sql session factory check end =====");
	   }
	   
	   @Test
	   public void testSession() throws Exception {
	       
	       try(SqlSession session1 = sqlFactory.openSession();
	           SqlSession session2 = sqlFactory.openSession();) {
	           
	           System.out.println("===== mybatis sql session test start =====");
	           System.out.println(session1);
	           System.out.println(session2);
	           System.out.println("===== mybatis sql session test end =====");
	           
	       } catch(Exception e) {
	           e.printStackTrace();
	       }
	   }
}



