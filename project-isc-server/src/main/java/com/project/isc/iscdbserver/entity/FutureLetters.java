package com.project.isc.iscdbserver.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_futureletters")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class FutureLetters {
    private static final long serialVersionUId = 1L;

    // 信件ID
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 64)
    private String flId;

    // 用户id
    @Column
    private String userId;

    // 用户内容
    @Column
    private String flMessage;

    //创建时间
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    //写入时间
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date writeTime;

    // 寄送到的邮箱
    @Column
    private String flemail;

    //寄送时间
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date sendTime;

    // 状态-是否已写入区块链
    @Column
    private String flStatus;

    // 状态-是否公开
    @Column
    private String flIsPublic;

    // 状态-是否已寄送
    @Column
    private String flIsSendStatus;

    // 写入区块链ID
    @Column
    private String blockChain;

    // 是否加密或者加密方式
    @Column
    private String flEncryption;

    public static long getSerialVersionUId() {
        return serialVersionUId;
    }

    public String getFlId() {
        return flId;
    }

    public void setFlId(String flId) {
        this.flId = flId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFlMessage() {
        return flMessage;
    }

    public void setFlMessage(String flMessage) {
        this.flMessage = flMessage;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(Date writeTime) {
        this.writeTime = writeTime;
    }

    public String getFlStatus() {
        return flStatus;
    }

    public void setFlStatus(String flStatus) {
        this.flStatus = flStatus;
    }

    public String getBlockChain() {
        return blockChain;
    }

    public void setBlockChain(String blockChain) {
        this.blockChain = blockChain;
    }

    public String getFlEncryption() {
        return flEncryption;
    }

    public void setFlEncryption(String flEncryption) {
        this.flEncryption = flEncryption;
    }

    public String getFlemail() {
        return flemail;
    }

    public void setFlemail(String flemail) {
        this.flemail = flemail;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getFlIsPublic() {
        return flIsPublic;
    }

    public void setFlIsPublic(String flIsPublic) {
        this.flIsPublic = flIsPublic;
    }

    public String getFlIsSendStatus() {
        return flIsSendStatus;
    }

    public void setFlIsSendStatus(String flIsSendStatus) {
        this.flIsSendStatus = flIsSendStatus;
    }
}
