package test.model;

import java.util.Date;

public class IndexLearnDMO {
    /**
     * 主键
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    private Integer id;

    /**
     * 姓名
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    private String name;

    /**
     * 日期
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    private Date date;

    /**
     * 日期字符串
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    private String datestr;

    /**
     * 
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    private Long datelong;

    /**
     * 
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    private String content;

    /**
     * id
     *主键
     *
     * @return the value of index_learn.id
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * This method sets the value of the database column index_learn.id
     *
     * @param id the value for index_learn.id
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * name
     *姓名
     *
     * @return the value of index_learn.name
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * 姓名
     * This method sets the value of the database column index_learn.name
     *
     * @param name the value for index_learn.name
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * date
     *日期
     *
     * @return the value of index_learn.date
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    public Date getDate() {
        return date;
    }

    /**
     * 日期
     * This method sets the value of the database column index_learn.date
     *
     * @param date the value for index_learn.date
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * datestr
     *日期字符串
     *
     * @return the value of index_learn.datestr
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    public String getDatestr() {
        return datestr;
    }

    /**
     * 日期字符串
     * This method sets the value of the database column index_learn.datestr
     *
     * @param datestr the value for index_learn.datestr
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    public void setDatestr(String datestr) {
        this.datestr = datestr == null ? null : datestr.trim();
    }

    /**
     * datelong
     *
     *
     * @return the value of index_learn.datelong
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    public Long getDatelong() {
        return datelong;
    }

    /**
     * 
     * This method sets the value of the database column index_learn.datelong
     *
     * @param datelong the value for index_learn.datelong
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    public void setDatelong(Long datelong) {
        this.datelong = datelong;
    }

    /**
     * content
     *
     *
     * @return the value of index_learn.content
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    public String getContent() {
        return content;
    }

    /**
     * 
     * This method sets the value of the database column index_learn.content
     *
     * @param content the value for index_learn.content
     *
     *  Wed Dec 02 00:07:42 CST 2015
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}