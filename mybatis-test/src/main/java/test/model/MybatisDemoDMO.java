package test.model;

import java.util.Date;

public class MybatisDemoDMO {
    /**
     * 
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    private Long id;

    /**
     * 姓名
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    private String name;

    /**
     * 年龄
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    private Integer age;

    /**
     * 生日
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    private Date birthday;

    /**
     * 
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    private byte[] context;

	public MybatisDemoDMO(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	/**
     * id
     *
     *
     * @return the value of mybatis_demo.id
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * This method sets the value of the database column mybatis_demo.id
     *
     * @param id the value for mybatis_demo.id
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * name
     *姓名
     *
     * @return the value of mybatis_demo.name
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * 姓名
     * This method sets the value of the database column mybatis_demo.name
     *
     * @param name the value for mybatis_demo.name
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * age
     *年龄
     *
     * @return the value of mybatis_demo.age
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 年龄
     * This method sets the value of the database column mybatis_demo.age
     *
     * @param age the value for mybatis_demo.age
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * birthday
     *生日
     *
     * @return the value of mybatis_demo.birthday
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 生日
     * This method sets the value of the database column mybatis_demo.birthday
     *
     * @param birthday the value for mybatis_demo.birthday
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * context
     *
     *
     * @return the value of mybatis_demo.context
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    public byte[] getContext() {
        return context;
    }

    /**
     * 
     * This method sets the value of the database column mybatis_demo.context
     *
     * @param context the value for mybatis_demo.context
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    public void setContext(byte[] context) {
        this.context = context;
    }
}