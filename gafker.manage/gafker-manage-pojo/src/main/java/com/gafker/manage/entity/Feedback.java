package com.gafker.manage.entity;

import java.util.Date;

import javax.validation.constraints.Size;

public class Feedback {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.Id
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.UstringId
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private String ustringid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.Category
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private String category;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.Content
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    @Size(min=6,message="反馈内容不能为空,要大于6字！")
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.ResponseContent
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private String responsecontent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.Title
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.WeChat
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private String wechat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.WeQQ
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private String weqq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.Taobao
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private String taobao;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.Phone
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.Address
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.IpAddress
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private String ipaddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.UserAgent
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private String useragent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.CreateTime
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.ResponseTime
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private Date responsetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.UpdateUser
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private String updateuser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.UpdateTime
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private Date updatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.FeedBackUser
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private String feedbackuser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.IsShow
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private Integer isshow;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.FamilynamesId
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private Long familynamesid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.FamilygenerationId
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private Long familygenerationid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.FamilyId
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private Long familyid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.FromUserId
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private Long fromuserid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.ToUserId
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private Long touserid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.QrCode
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private String qrcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.FeedBackType
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private Integer feedbacktype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.ParentId
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    private Long parentid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.Id
     *
     * @return the value of feedback.Id
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.Id
     *
     * @param id the value for feedback.Id
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.UstringId
     *
     * @return the value of feedback.UstringId
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public String getUstringid() {
        return ustringid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.UstringId
     *
     * @param ustringid the value for feedback.UstringId
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setUstringid(String ustringid) {
        this.ustringid = ustringid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.Category
     *
     * @return the value of feedback.Category
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.Category
     *
     * @param category the value for feedback.Category
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.Content
     *
     * @return the value of feedback.Content
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.Content
     *
     * @param content the value for feedback.Content
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.ResponseContent
     *
     * @return the value of feedback.ResponseContent
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public String getResponsecontent() {
        return responsecontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.ResponseContent
     *
     * @param responsecontent the value for feedback.ResponseContent
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setResponsecontent(String responsecontent) {
        this.responsecontent = responsecontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.Title
     *
     * @return the value of feedback.Title
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.Title
     *
     * @param title the value for feedback.Title
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.WeChat
     *
     * @return the value of feedback.WeChat
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.WeChat
     *
     * @param wechat the value for feedback.WeChat
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.WeQQ
     *
     * @return the value of feedback.WeQQ
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public String getWeqq() {
        return weqq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.WeQQ
     *
     * @param weqq the value for feedback.WeQQ
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setWeqq(String weqq) {
        this.weqq = weqq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.Taobao
     *
     * @return the value of feedback.Taobao
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public String getTaobao() {
        return taobao;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.Taobao
     *
     * @param taobao the value for feedback.Taobao
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setTaobao(String taobao) {
        this.taobao = taobao;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.Phone
     *
     * @return the value of feedback.Phone
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.Phone
     *
     * @param phone the value for feedback.Phone
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.Address
     *
     * @return the value of feedback.Address
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.Address
     *
     * @param address the value for feedback.Address
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.IpAddress
     *
     * @return the value of feedback.IpAddress
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public String getIpaddress() {
        return ipaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.IpAddress
     *
     * @param ipaddress the value for feedback.IpAddress
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.UserAgent
     *
     * @return the value of feedback.UserAgent
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public String getUseragent() {
        return useragent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.UserAgent
     *
     * @param useragent the value for feedback.UserAgent
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setUseragent(String useragent) {
        this.useragent = useragent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.CreateTime
     *
     * @return the value of feedback.CreateTime
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.CreateTime
     *
     * @param createtime the value for feedback.CreateTime
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.ResponseTime
     *
     * @return the value of feedback.ResponseTime
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public Date getResponsetime() {
        return responsetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.ResponseTime
     *
     * @param responsetime the value for feedback.ResponseTime
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setResponsetime(Date responsetime) {
        this.responsetime = responsetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.UpdateUser
     *
     * @return the value of feedback.UpdateUser
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public String getUpdateuser() {
        return updateuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.UpdateUser
     *
     * @param updateuser the value for feedback.UpdateUser
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.UpdateTime
     *
     * @return the value of feedback.UpdateTime
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.UpdateTime
     *
     * @param updatetime the value for feedback.UpdateTime
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.FeedBackUser
     *
     * @return the value of feedback.FeedBackUser
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public String getFeedbackuser() {
        return feedbackuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.FeedBackUser
     *
     * @param feedbackuser the value for feedback.FeedBackUser
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setFeedbackuser(String feedbackuser) {
        this.feedbackuser = feedbackuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.IsShow
     *
     * @return the value of feedback.IsShow
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public Integer getIsshow() {
        return isshow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.IsShow
     *
     * @param isshow the value for feedback.IsShow
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setIsshow(Integer isshow) {
        this.isshow = isshow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.FamilynamesId
     *
     * @return the value of feedback.FamilynamesId
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public Long getFamilynamesid() {
        return familynamesid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.FamilynamesId
     *
     * @param familynamesid the value for feedback.FamilynamesId
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setFamilynamesid(Long familynamesid) {
        this.familynamesid = familynamesid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.FamilygenerationId
     *
     * @return the value of feedback.FamilygenerationId
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public Long getFamilygenerationid() {
        return familygenerationid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.FamilygenerationId
     *
     * @param familygenerationid the value for feedback.FamilygenerationId
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setFamilygenerationid(Long familygenerationid) {
        this.familygenerationid = familygenerationid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.FamilyId
     *
     * @return the value of feedback.FamilyId
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public Long getFamilyid() {
        return familyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.FamilyId
     *
     * @param familyid the value for feedback.FamilyId
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setFamilyid(Long familyid) {
        this.familyid = familyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.FromUserId
     *
     * @return the value of feedback.FromUserId
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public Long getFromuserid() {
        return fromuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.FromUserId
     *
     * @param fromuserid the value for feedback.FromUserId
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setFromuserid(Long fromuserid) {
        this.fromuserid = fromuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.ToUserId
     *
     * @return the value of feedback.ToUserId
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public Long getTouserid() {
        return touserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.ToUserId
     *
     * @param touserid the value for feedback.ToUserId
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setTouserid(Long touserid) {
        this.touserid = touserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.QrCode
     *
     * @return the value of feedback.QrCode
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public String getQrcode() {
        return qrcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.QrCode
     *
     * @param qrcode the value for feedback.QrCode
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.FeedBackType
     *
     * @return the value of feedback.FeedBackType
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public Integer getFeedbacktype() {
        return feedbacktype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.FeedBackType
     *
     * @param feedbacktype the value for feedback.FeedBackType
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setFeedbacktype(Integer feedbacktype) {
        this.feedbacktype = feedbacktype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.ParentId
     *
     * @return the value of feedback.ParentId
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public Long getParentid() {
        return parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.ParentId
     *
     * @param parentid the value for feedback.ParentId
     *
     * @mbg.generated Mon Mar 20 21:13:37 CST 2017
     */
    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }
}