package test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;
import test.model.IndexLearnDMO;

public interface IndexLearnDAO {
    /**
     * This method corresponds to the database table index_learn
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    @Delete({
        "delete from index_learn",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table index_learn
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    @Insert({
        "insert into index_learn (id, name, ",
        "date, datestr, ",
        "datelong, content)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{date,jdbcType=TIMESTAMP}, #{datestr,jdbcType=VARCHAR}, ",
        "#{datelong,jdbcType=BIGINT}, #{content,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=true, resultType=Integer.class)
    int insert(IndexLearnDMO record);

    /**
     * This method corresponds to the database table index_learn
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    @Select({
        "select",
        "id, name, date, datestr, datelong, content",
        "from index_learn",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="date", property="date", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="datestr", property="datestr", jdbcType=JdbcType.VARCHAR),
        @Result(column="datelong", property="datelong", jdbcType=JdbcType.BIGINT),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    IndexLearnDMO selectByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table index_learn
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    @Select({
        "select",
        "id, name, date, datestr, datelong, content",
        "from index_learn"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="date", property="date", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="datestr", property="datestr", jdbcType=JdbcType.VARCHAR),
        @Result(column="datelong", property="datelong", jdbcType=JdbcType.BIGINT),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<IndexLearnDMO> selectAll();

    /**
     * This method corresponds to the database table index_learn
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    @Update({
        "update index_learn",
        "set name = #{name,jdbcType=VARCHAR},",
          "date = #{date,jdbcType=TIMESTAMP},",
          "datestr = #{datestr,jdbcType=VARCHAR},",
          "datelong = #{datelong,jdbcType=BIGINT},",
          "content = #{content,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(IndexLearnDMO record);
}