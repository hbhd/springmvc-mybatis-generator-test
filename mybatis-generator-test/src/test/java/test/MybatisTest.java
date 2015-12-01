package test;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import test.dao.MybatisDemoDAO;
import test.model.MybatisDemoDMO;

public class MybatisTest {
	private static SqlSessionFactory sqlSessionFactory;

	@BeforeClass
	public static void setUp() throws Exception
	{
		// create a SqlSessionFactory
		Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		reader.close();

		// populate in-memory database
//		SqlSession session = sqlSessionFactory.openSession();
//		Connection conn = session.getConnection();
//		reader = Resources.getResourceAsReader("config/mybatis/files/hqlbd.sql");
//		ScriptRunner runner = new ScriptRunner(conn);
//		runner.setLogWriter(null);
//		runner.runScript(reader);
//		reader.close();
//		session.close();
	}

	@Test
	public void insertBathTest(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			MybatisDemoDAO mapper = sqlSession.getMapper(MybatisDemoDAO.class);
			List<MybatisDemoDMO> dmoList = new ArrayList<>();
			dmoList.add(new MybatisDemoDMO( "joe", 13));
			dmoList.add(new MybatisDemoDMO( "mao",12 ));
			int r=mapper.insertBatch(dmoList);
			System.out.println(r);
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.commit();
			sqlSession.close();
		}
	}
}
