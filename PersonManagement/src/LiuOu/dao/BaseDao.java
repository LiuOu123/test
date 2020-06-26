package LiuOu.dao;

import javax.sql.DataSource;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class BaseDao {
private static DataSource ds=new ComboPooledDataSource();

public static DataSource getDs() {
	System.out.println("连接成功");
	return ds;
}

@Test
public void Test01(){
	System.out.println(getDs());
}

}
