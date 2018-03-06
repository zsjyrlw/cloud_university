package com.chinasoft.system.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by zhangyan on 2017/10/25.
 */
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","operations","roles","menus"})
@Entity
@Table(name = "vercode")
public class VerCode {

    /** 验证码ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** 手机号码 */
    @Column(name = "endpoint",nullable=false)
    private String endpoint;

    /** 短信信息 */
    @Column(name = "message",nullable=false)
    private String message;

    /** 验证码 */
    @Column(name = "vercode")
    private String vercode;

    /** 类型 */
    @Column(name = "type")
    private String type;

    /** 创建时间 */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createdate")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdate;

    public String getVercode() {
        return vercode;
    }

    public void setVercode(String vercode) {
        this.vercode = vercode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    @Override
    public String toString() {
        return "VerCode{" +
                "id=" + id +
                ", endpoint='" + endpoint + '\'' +
                ", massage='" + message + '\'' +
                ", createdate=" + createdate +
                '}';
    }
}
