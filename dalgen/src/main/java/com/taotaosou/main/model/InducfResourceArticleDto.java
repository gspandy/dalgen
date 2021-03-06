/*
 * Copyright (c) 2014 All Rights Reserved.
 */
package com.taotaosou.main.model;
import java.io.Serializable;
// auto generated imports
import java.util.Date;

/**
 * A data object class directly models database table <tt>inducf_resource_article</tt>.
 *
 * This file is generated by <tt>ibatis-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>ibatis</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/inducf_resource_article.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>ibatis-dalgen</tt> 
 * to generate this file.
 *
 * @author dalgen
 */
public class InducfResourceArticleDto implements Serializable{
    private static final long serialVersionUID = 741231858441822688L;

    //========== properties ==========

	/**
	 * This property corresponds to db column <tt>id</tt>.
	 */

	private Integer id;


	/**
	 * This property corresponds to db column <tt>article_type_id</tt>.
	 */

	private Integer articleTypeId;


	/**
	 * This property corresponds to db column <tt>source</tt>.
	 */

	private String source;


	/**
	 * This property corresponds to db column <tt>title</tt>.
	 */

	private String title;


	/**
	 * This property corresponds to db column <tt>subtitle</tt>.
	 */

	private String subtitle;


	/**
	 * This property corresponds to db column <tt>cover</tt>.
	 */

	private String cover;


	/**
	 * This property corresponds to db column <tt>cover_desc</tt>.
	 */

	private String coverDesc;


	/**
	 * This property corresponds to db column <tt>video</tt>.
	 */

	private String video;


	/**
	 * This property corresponds to db column <tt>tag_ids</tt>.
	 */

	private String tagIds;


	/**
	 * This property corresponds to db column <tt>category</tt>.
	 */

	private String category;


	/**
	 * This property corresponds to db column <tt>visible</tt>.
	 */

	private Boolean visible;


	/**
	 * This property corresponds to db column <tt>update_uid</tt>.
	 */

	private Integer updateUid;


	/**
	 * This property corresponds to db column <tt>update_time</tt>.
	 */

	private Date updateTime;


	/**
	 * This property corresponds to db column <tt>create_uid</tt>.
	 */

	private Integer createUid;


	/**
	 * This property corresponds to db column <tt>create_time</tt>.
	 */

	private Date createTime;


    //========== getters and setters ==========

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
	public Integer getId() {
		return id;
	}
	
	/**
	 * Setter method for property <tt>id</tt>.
	 * 
	 * @param id value to be assigned to property id
     */
	public void setId(Integer id) {
		this.id = id;
	}

    /**
     * Getter method for property <tt>articleTypeId</tt>.
     *
     * @return property value of articleTypeId
     */
	public Integer getArticleTypeId() {
		return articleTypeId;
	}
	
	/**
	 * Setter method for property <tt>articleTypeId</tt>.
	 * 
	 * @param articleTypeId value to be assigned to property articleTypeId
     */
	public void setArticleTypeId(Integer articleTypeId) {
		this.articleTypeId = articleTypeId;
	}

    /**
     * Getter method for property <tt>source</tt>.
     *
     * @return property value of source
     */
	public String getSource() {
		return source;
	}
	
	/**
	 * Setter method for property <tt>source</tt>.
	 * 
	 * @param source value to be assigned to property source
     */
	public void setSource(String source) {
		this.source = source;
	}

    /**
     * Getter method for property <tt>title</tt>.
     *
     * @return property value of title
     */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Setter method for property <tt>title</tt>.
	 * 
	 * @param title value to be assigned to property title
     */
	public void setTitle(String title) {
		this.title = title;
	}

    /**
     * Getter method for property <tt>subtitle</tt>.
     *
     * @return property value of subtitle
     */
	public String getSubtitle() {
		return subtitle;
	}
	
	/**
	 * Setter method for property <tt>subtitle</tt>.
	 * 
	 * @param subtitle value to be assigned to property subtitle
     */
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

    /**
     * Getter method for property <tt>cover</tt>.
     *
     * @return property value of cover
     */
	public String getCover() {
		return cover;
	}
	
	/**
	 * Setter method for property <tt>cover</tt>.
	 * 
	 * @param cover value to be assigned to property cover
     */
	public void setCover(String cover) {
		this.cover = cover;
	}

    /**
     * Getter method for property <tt>coverDesc</tt>.
     *
     * @return property value of coverDesc
     */
	public String getCoverDesc() {
		return coverDesc;
	}
	
	/**
	 * Setter method for property <tt>coverDesc</tt>.
	 * 
	 * @param coverDesc value to be assigned to property coverDesc
     */
	public void setCoverDesc(String coverDesc) {
		this.coverDesc = coverDesc;
	}

    /**
     * Getter method for property <tt>video</tt>.
     *
     * @return property value of video
     */
	public String getVideo() {
		return video;
	}
	
	/**
	 * Setter method for property <tt>video</tt>.
	 * 
	 * @param video value to be assigned to property video
     */
	public void setVideo(String video) {
		this.video = video;
	}

    /**
     * Getter method for property <tt>tagIds</tt>.
     *
     * @return property value of tagIds
     */
	public String getTagIds() {
		return tagIds;
	}
	
	/**
	 * Setter method for property <tt>tagIds</tt>.
	 * 
	 * @param tagIds value to be assigned to property tagIds
     */
	public void setTagIds(String tagIds) {
		this.tagIds = tagIds;
	}

    /**
     * Getter method for property <tt>category</tt>.
     *
     * @return property value of category
     */
	public String getCategory() {
		return category;
	}
	
	/**
	 * Setter method for property <tt>category</tt>.
	 * 
	 * @param category value to be assigned to property category
     */
	public void setCategory(String category) {
		this.category = category;
	}

    /**
     * Getter method for property <tt>visible</tt>.
     *
     * @return property value of visible
     */
	public Boolean getVisible() {
		return visible;
	}
	
	/**
	 * Setter method for property <tt>visible</tt>.
	 * 
	 * @param visible value to be assigned to property visible
     */
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

    /**
     * Getter method for property <tt>updateUid</tt>.
     *
     * @return property value of updateUid
     */
	public Integer getUpdateUid() {
		return updateUid;
	}
	
	/**
	 * Setter method for property <tt>updateUid</tt>.
	 * 
	 * @param updateUid value to be assigned to property updateUid
     */
	public void setUpdateUid(Integer updateUid) {
		this.updateUid = updateUid;
	}

    /**
     * Getter method for property <tt>updateTime</tt>.
     *
     * @return property value of updateTime
     */
	public Date getUpdateTime() {
		return updateTime;
	}
	
	/**
	 * Setter method for property <tt>updateTime</tt>.
	 * 
	 * @param updateTime value to be assigned to property updateTime
     */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

    /**
     * Getter method for property <tt>createUid</tt>.
     *
     * @return property value of createUid
     */
	public Integer getCreateUid() {
		return createUid;
	}
	
	/**
	 * Setter method for property <tt>createUid</tt>.
	 * 
	 * @param createUid value to be assigned to property createUid
     */
	public void setCreateUid(Integer createUid) {
		this.createUid = createUid;
	}

    /**
     * Getter method for property <tt>createTime</tt>.
     *
     * @return property value of createTime
     */
	public Date getCreateTime() {
		return createTime;
	}
	
	/**
	 * Setter method for property <tt>createTime</tt>.
	 * 
	 * @param createTime value to be assigned to property createTime
     */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
