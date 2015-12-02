package test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import test.model.MybatisDemoDMO;

public interface MybatisDemoDAO {

	@Insert({
			"<script>",
			"insert into mybatis_demo (name, age)",
			"values ",
			"<foreach  collection='dmoList' item='dmo' separator=','>",
			"( #{dmo.name,jdbcType=VARCHAR}, #{dmo.age,jdbcType=INTEGER})",
			"</foreach>",
			"</script>"
	})
	int insertBatch(@Param("dmoList") List<MybatisDemoDMO> dmoList);
}