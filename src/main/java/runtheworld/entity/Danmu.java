package runtheworld.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 弹幕实体类
 *
 * @author evans 2018/5/6 14:15
 */

public class Danmu implements Serializable {

	private static final long serialVersionUID = -7898194272883238670L;

    private Long id;

    /**
     * 发送者id
     */
    private Long userId;

    /**
     * 场景id
     */
    private Long viewId;

	/**
	 * 弹幕内容
	 */
	private String contents;

    /**
     * x,y坐标
     */
    private Double x;

    private Double y;

    /**
     * 弹幕颜色
     */
    private String color;

    /**
     * 点赞次数
     */
    private Integer zanTimes;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 是否已删除
     */
    private Byte isDeleted;


    public Danmu() {
    }

    public Danmu(long userId, long viewId, String contents, Date time, String color) {
        this.userId = userId;
        this.viewId = viewId;
        this.contents = contents;
        this.gmtCreate = time;
        this.color = color;
    }

    public Danmu(long userId, long viewId, String contents, Date time) {
        this.userId = userId;
        this.viewId = viewId;
        this.contents = contents;
        this.gmtCreate = time;
        this.color = "#FFFFFF";
    }

    public Danmu(long userId, long viewId, String contents, Date time, String color, double x, double y) {
        this.userId = userId;
        this.viewId = viewId;
        this.contents = contents;
        this.gmtCreate = time;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column danmu.id
     *
     * @return the value of danmu.id
     *
     * @mbggenerated Tue May 22 12:44:23 GMT+08:00 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column danmu.id
     *
     * @param id the value for danmu.id
     *
     * @mbggenerated Tue May 22 12:44:23 GMT+08:00 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column danmu.user_id
     *
     * @return the value of danmu.user_id
     *
     * @mbggenerated Tue May 22 12:44:23 GMT+08:00 2018
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column danmu.user_id
     *
     * @param userId the value for danmu.user_id
     *
     * @mbggenerated Tue May 22 12:44:23 GMT+08:00 2018
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column danmu.view_id
     *
     * @return the value of danmu.view_id
     *
     * @mbggenerated Tue May 22 12:44:23 GMT+08:00 2018
     */
    public Long getViewId() {
        return viewId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column danmu.view_id
     *
     * @param viewId the value for danmu.view_id
     *
     * @mbggenerated Tue May 22 12:44:23 GMT+08:00 2018
     */
    public void setViewId(Long viewId) {
        this.viewId = viewId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column danmu.contents
     *
     * @return the value of danmu.contents
     *
     * @mbggenerated Tue May 22 12:44:23 GMT+08:00 2018
     */
    public String getContents() {
        return contents;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column danmu.contents
     *
     * @param contents the value for danmu.contents
     *
     * @mbggenerated Tue May 22 12:44:23 GMT+08:00 2018
     */
    public void setContents(String contents) {
        this.contents = contents == null ? null : contents.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column danmu.x
     *
     * @return the value of danmu.x
     *
     * @mbggenerated Tue May 22 12:44:23 GMT+08:00 2018
     */
    public Double getX() {
        return x;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column danmu.x
     *
     * @param x the value for danmu.x
     *
     * @mbggenerated Tue May 22 12:44:23 GMT+08:00 2018
     */
    public void setX(Double x) {
        this.x = x;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column danmu.y
     *
     * @return the value of danmu.y
     *
     * @mbggenerated Tue May 22 12:44:23 GMT+08:00 2018
     */
    public Double getY() {
        return y;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column danmu.y
     *
     * @param y the value for danmu.y
     *
     * @mbggenerated Tue May 22 12:44:23 GMT+08:00 2018
     */
    public void setY(Double y) {
        this.y = y;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column danmu.color
     *
     * @return the value of danmu.color
     *
     * @mbggenerated Tue May 22 12:44:23 GMT+08:00 2018
     */
    public String getColor() {
        return color;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column danmu.color
     *
     * @param color the value for danmu.color
     *
     * @mbggenerated Tue May 22 12:44:23 GMT+08:00 2018
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column danmu.zan_times
     *
     * @return the value of danmu.zan_times
     *
     * @mbggenerated Tue May 22 12:44:23 GMT+08:00 2018
     */
    public Integer getZanTimes() {
        return zanTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column danmu.zan_times
     *
     * @param zanTimes the value for danmu.zan_times
     *
     * @mbggenerated Tue May 22 12:44:23 GMT+08:00 2018
     */
    public void setZanTimes(Integer zanTimes) {
        this.zanTimes = zanTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column danmu.gmt_create
     *
     * @return the value of danmu.gmt_create
     *
     * @mbggenerated Tue May 22 12:44:23 GMT+08:00 2018
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column danmu.gmt_create
     *
     * @param gmtCreate the value for danmu.gmt_create
     *
     * @mbggenerated Tue May 22 12:44:23 GMT+08:00 2018
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column danmu.gmt_modified
     *
     * @return the value of danmu.gmt_modified
     *
     * @mbggenerated Tue May 22 12:44:23 GMT+08:00 2018
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column danmu.gmt_modified
     *
     * @param gmtModified the value for danmu.gmt_modified
     *
     * @mbggenerated Tue May 22 12:44:23 GMT+08:00 2018
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column danmu.is_deleted
     *
     * @return the value of danmu.is_deleted
     *
     * @mbggenerated Tue May 22 12:44:23 GMT+08:00 2018
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column danmu.is_deleted
     *
     * @param isDeleted the value for danmu.is_deleted
     *
     * @mbggenerated Tue May 22 12:44:23 GMT+08:00 2018
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }
}