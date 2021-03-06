package com.example.demo.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table hs_advert_data
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class HsAdvertData implements Serializable {
    /**
     * Database Column Remarks:
     *   广告ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hs_advert_data.ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   语言版本（0：中文，1：英文）默认为0
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hs_advert_data.LANGUAGE_VERSION
     *
     * @mbg.generated
     */
    private Integer languageVersion;

    /**
     * Database Column Remarks:
     *   广告长标题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hs_advert_data.AD_FULL_TITLE
     *
     * @mbg.generated
     */
    private String adFullTitle;

    /**
     * Database Column Remarks:
     *   广告短标题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hs_advert_data.AD_SHORT_TITLE
     *
     * @mbg.generated
     */
    private String adShortTitle;

    /**
     * Database Column Remarks:
     *   广告类型(1:图片类型, 2:文字类型)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hs_advert_data.AD_TYPE
     *
     * @mbg.generated
     */
    private Integer adType;

    /**
     * Database Column Remarks:
     *   广告图片上传名称(当ad_type=1有效)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hs_advert_data.AD_IMG_URL
     *
     * @mbg.generated
     */
    private String adImgUrl;

    /**
     * Database Column Remarks:
     *   广告文字内容(当ad_type=2有效)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hs_advert_data.AD_CONTENT
     *
     * @mbg.generated
     */
    private String adContent;

    /**
     * Database Column Remarks:
     *   排序序号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hs_advert_data.AD_SN
     *
     * @mbg.generated
     */
    private Integer adSn;

    /**
     * Database Column Remarks:
     *   点击次数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hs_advert_data.AD_C_COUNT
     *
     * @mbg.generated
     */
    private Integer adCCount;

    /**
     * Database Column Remarks:
     *   关注次数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hs_advert_data.AD_F_COUNT
     *
     * @mbg.generated
     */
    private Integer adFCount;

    /**
     * Database Column Remarks:
     *   广告内容的备注描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hs_advert_data.AD_DESC
     *
     * @mbg.generated
     */
    private String adDesc;

    /**
     * Database Column Remarks:
     *   广告内容点击链接的URL地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hs_advert_data.AD_LINK
     *
     * @mbg.generated
     */
    private String adLink;

    /**
     * Database Column Remarks:
     *   状态(0:未启用 1:启用)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hs_advert_data.AD_STATE
     *
     * @mbg.generated
     */
    private Integer adState;

    /**
     * Database Column Remarks:
     *   是否删除0:不删除，1：删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hs_advert_data.IS_DEL
     *
     * @mbg.generated
     */
    private Integer isDel;

    /**
     * Database Column Remarks:
     *   创建人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hs_advert_data.CREATE_BY
     *
     * @mbg.generated
     */
    private Integer createBy;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hs_advert_data.CREATE_TIME
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   更新人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hs_advert_data.UPDATE_BY
     *
     * @mbg.generated
     */
    private Integer updateBy;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hs_advert_data.UPDATE_TIME
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   所对应的hs_business主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hs_advert_data.BID
     *
     * @mbg.generated
     */
    private Integer bid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hs_advert_data.STANDBY1
     *
     * @mbg.generated
     */
    private String standby1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hs_advert_data.STANDBY2
     *
     * @mbg.generated
     */
    private String standby2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hs_advert_data.STANDBY3
     *
     * @mbg.generated
     */
    private String standby3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hs_advert_data.STANDBY4
     *
     * @mbg.generated
     */
    private String standby4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hs_advert_data.STANDBY5
     *
     * @mbg.generated
     */
    private String standby5;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hs_advert_data.ID
     *
     * @return the value of hs_advert_data.ID
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hs_advert_data.ID
     *
     * @param id the value for hs_advert_data.ID
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hs_advert_data.LANGUAGE_VERSION
     *
     * @return the value of hs_advert_data.LANGUAGE_VERSION
     *
     * @mbg.generated
     */
    public Integer getLanguageVersion() {
        return languageVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hs_advert_data.LANGUAGE_VERSION
     *
     * @param languageVersion the value for hs_advert_data.LANGUAGE_VERSION
     *
     * @mbg.generated
     */
    public void setLanguageVersion(Integer languageVersion) {
        this.languageVersion = languageVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hs_advert_data.AD_FULL_TITLE
     *
     * @return the value of hs_advert_data.AD_FULL_TITLE
     *
     * @mbg.generated
     */
    public String getAdFullTitle() {
        return adFullTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hs_advert_data.AD_FULL_TITLE
     *
     * @param adFullTitle the value for hs_advert_data.AD_FULL_TITLE
     *
     * @mbg.generated
     */
    public void setAdFullTitle(String adFullTitle) {
        this.adFullTitle = adFullTitle == null ? null : adFullTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hs_advert_data.AD_SHORT_TITLE
     *
     * @return the value of hs_advert_data.AD_SHORT_TITLE
     *
     * @mbg.generated
     */
    public String getAdShortTitle() {
        return adShortTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hs_advert_data.AD_SHORT_TITLE
     *
     * @param adShortTitle the value for hs_advert_data.AD_SHORT_TITLE
     *
     * @mbg.generated
     */
    public void setAdShortTitle(String adShortTitle) {
        this.adShortTitle = adShortTitle == null ? null : adShortTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hs_advert_data.AD_TYPE
     *
     * @return the value of hs_advert_data.AD_TYPE
     *
     * @mbg.generated
     */
    public Integer getAdType() {
        return adType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hs_advert_data.AD_TYPE
     *
     * @param adType the value for hs_advert_data.AD_TYPE
     *
     * @mbg.generated
     */
    public void setAdType(Integer adType) {
        this.adType = adType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hs_advert_data.AD_IMG_URL
     *
     * @return the value of hs_advert_data.AD_IMG_URL
     *
     * @mbg.generated
     */
    public String getAdImgUrl() {
        return adImgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hs_advert_data.AD_IMG_URL
     *
     * @param adImgUrl the value for hs_advert_data.AD_IMG_URL
     *
     * @mbg.generated
     */
    public void setAdImgUrl(String adImgUrl) {
        this.adImgUrl = adImgUrl == null ? null : adImgUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hs_advert_data.AD_CONTENT
     *
     * @return the value of hs_advert_data.AD_CONTENT
     *
     * @mbg.generated
     */
    public String getAdContent() {
        return adContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hs_advert_data.AD_CONTENT
     *
     * @param adContent the value for hs_advert_data.AD_CONTENT
     *
     * @mbg.generated
     */
    public void setAdContent(String adContent) {
        this.adContent = adContent == null ? null : adContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hs_advert_data.AD_SN
     *
     * @return the value of hs_advert_data.AD_SN
     *
     * @mbg.generated
     */
    public Integer getAdSn() {
        return adSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hs_advert_data.AD_SN
     *
     * @param adSn the value for hs_advert_data.AD_SN
     *
     * @mbg.generated
     */
    public void setAdSn(Integer adSn) {
        this.adSn = adSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hs_advert_data.AD_C_COUNT
     *
     * @return the value of hs_advert_data.AD_C_COUNT
     *
     * @mbg.generated
     */
    public Integer getAdCCount() {
        return adCCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hs_advert_data.AD_C_COUNT
     *
     * @param adCCount the value for hs_advert_data.AD_C_COUNT
     *
     * @mbg.generated
     */
    public void setAdCCount(Integer adCCount) {
        this.adCCount = adCCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hs_advert_data.AD_F_COUNT
     *
     * @return the value of hs_advert_data.AD_F_COUNT
     *
     * @mbg.generated
     */
    public Integer getAdFCount() {
        return adFCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hs_advert_data.AD_F_COUNT
     *
     * @param adFCount the value for hs_advert_data.AD_F_COUNT
     *
     * @mbg.generated
     */
    public void setAdFCount(Integer adFCount) {
        this.adFCount = adFCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hs_advert_data.AD_DESC
     *
     * @return the value of hs_advert_data.AD_DESC
     *
     * @mbg.generated
     */
    public String getAdDesc() {
        return adDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hs_advert_data.AD_DESC
     *
     * @param adDesc the value for hs_advert_data.AD_DESC
     *
     * @mbg.generated
     */
    public void setAdDesc(String adDesc) {
        this.adDesc = adDesc == null ? null : adDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hs_advert_data.AD_LINK
     *
     * @return the value of hs_advert_data.AD_LINK
     *
     * @mbg.generated
     */
    public String getAdLink() {
        return adLink;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hs_advert_data.AD_LINK
     *
     * @param adLink the value for hs_advert_data.AD_LINK
     *
     * @mbg.generated
     */
    public void setAdLink(String adLink) {
        this.adLink = adLink == null ? null : adLink.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hs_advert_data.AD_STATE
     *
     * @return the value of hs_advert_data.AD_STATE
     *
     * @mbg.generated
     */
    public Integer getAdState() {
        return adState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hs_advert_data.AD_STATE
     *
     * @param adState the value for hs_advert_data.AD_STATE
     *
     * @mbg.generated
     */
    public void setAdState(Integer adState) {
        this.adState = adState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hs_advert_data.IS_DEL
     *
     * @return the value of hs_advert_data.IS_DEL
     *
     * @mbg.generated
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hs_advert_data.IS_DEL
     *
     * @param isDel the value for hs_advert_data.IS_DEL
     *
     * @mbg.generated
     */
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hs_advert_data.CREATE_BY
     *
     * @return the value of hs_advert_data.CREATE_BY
     *
     * @mbg.generated
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hs_advert_data.CREATE_BY
     *
     * @param createBy the value for hs_advert_data.CREATE_BY
     *
     * @mbg.generated
     */
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hs_advert_data.CREATE_TIME
     *
     * @return the value of hs_advert_data.CREATE_TIME
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hs_advert_data.CREATE_TIME
     *
     * @param createTime the value for hs_advert_data.CREATE_TIME
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hs_advert_data.UPDATE_BY
     *
     * @return the value of hs_advert_data.UPDATE_BY
     *
     * @mbg.generated
     */
    public Integer getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hs_advert_data.UPDATE_BY
     *
     * @param updateBy the value for hs_advert_data.UPDATE_BY
     *
     * @mbg.generated
     */
    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hs_advert_data.UPDATE_TIME
     *
     * @return the value of hs_advert_data.UPDATE_TIME
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hs_advert_data.UPDATE_TIME
     *
     * @param updateTime the value for hs_advert_data.UPDATE_TIME
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hs_advert_data.BID
     *
     * @return the value of hs_advert_data.BID
     *
     * @mbg.generated
     */
    public Integer getBid() {
        return bid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hs_advert_data.BID
     *
     * @param bid the value for hs_advert_data.BID
     *
     * @mbg.generated
     */
    public void setBid(Integer bid) {
        this.bid = bid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hs_advert_data.STANDBY1
     *
     * @return the value of hs_advert_data.STANDBY1
     *
     * @mbg.generated
     */
    public String getStandby1() {
        return standby1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hs_advert_data.STANDBY1
     *
     * @param standby1 the value for hs_advert_data.STANDBY1
     *
     * @mbg.generated
     */
    public void setStandby1(String standby1) {
        this.standby1 = standby1 == null ? null : standby1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hs_advert_data.STANDBY2
     *
     * @return the value of hs_advert_data.STANDBY2
     *
     * @mbg.generated
     */
    public String getStandby2() {
        return standby2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hs_advert_data.STANDBY2
     *
     * @param standby2 the value for hs_advert_data.STANDBY2
     *
     * @mbg.generated
     */
    public void setStandby2(String standby2) {
        this.standby2 = standby2 == null ? null : standby2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hs_advert_data.STANDBY3
     *
     * @return the value of hs_advert_data.STANDBY3
     *
     * @mbg.generated
     */
    public String getStandby3() {
        return standby3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hs_advert_data.STANDBY3
     *
     * @param standby3 the value for hs_advert_data.STANDBY3
     *
     * @mbg.generated
     */
    public void setStandby3(String standby3) {
        this.standby3 = standby3 == null ? null : standby3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hs_advert_data.STANDBY4
     *
     * @return the value of hs_advert_data.STANDBY4
     *
     * @mbg.generated
     */
    public String getStandby4() {
        return standby4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hs_advert_data.STANDBY4
     *
     * @param standby4 the value for hs_advert_data.STANDBY4
     *
     * @mbg.generated
     */
    public void setStandby4(String standby4) {
        this.standby4 = standby4 == null ? null : standby4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hs_advert_data.STANDBY5
     *
     * @return the value of hs_advert_data.STANDBY5
     *
     * @mbg.generated
     */
    public String getStandby5() {
        return standby5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hs_advert_data.STANDBY5
     *
     * @param standby5 the value for hs_advert_data.STANDBY5
     *
     * @mbg.generated
     */
    public void setStandby5(String standby5) {
        this.standby5 = standby5 == null ? null : standby5.trim();
    }
}