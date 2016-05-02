package cn.orange9.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {

  @Id
  @GeneratedValue
  @Column(name="ID")
  private Long id;
  @Column(name="NAME", nullable=true)
  private String name;
  @Column(name="ROLE_ID", nullable=true)
  private Long roleId;
  @Column(name="BOSS_ID", nullable=true)
  private Long bossId;
  @Column(name="ACCOUNT")
  private String account;
  @Column(name="PASSWORD")
  private String password;
  @Column(name="SALARY", nullable=true)
  private Double salary;
  @Column(name="PERFORMANCE_PAY", nullable=true)
  private Double performancePay;
  @Column(name="HEADER", nullable=true)
  private String header;
  @Column(name="INSERT_DATETIME", nullable=true)
  private Date insertDatetime;
  @Column(name="UPDATE_DATETIME", nullable=true)
  private Date updateDatetime;
  @Column(name="PHONE", nullable=true)
  private String phone;
  @Column(name="IS_ADMIN")
  private Integer isAdmin;
  @Column(name="ACTIVE")
  private Integer active;
  
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Long getRoleId() {
    return roleId;
  }
  public void setRoleId(Long roleId) {
    this.roleId = roleId;
  }
  public Long getBossId() {
    return bossId;
  }
  public void setBossId(Long bossId) {
    this.bossId = bossId;
  }
  public String getAccount() {
    return account;
  }
  public void setAccount(String account) {
    this.account = account;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public Double getSalary() {
    return salary;
  }
  public void setSalary(Double salary) {
    this.salary = salary;
  }
  public Double getPerformancePay() {
    return performancePay;
  }
  public void setPerformancePay(Double performancePay) {
    this.performancePay = performancePay;
  }
  public String getHeader() {
    return header;
  }
  public void setHeader(String header) {
    this.header = header;
  }
  public Date getInsertDatetime() {
    return insertDatetime;
  }
  public void setInsertDatetime(Date insertDatetime) {
    this.insertDatetime = insertDatetime;
  }
  public Date getUpdateDatetime() {
    return updateDatetime;
  }
  public void setUpdateDatetime(Date updateDatetime) {
    this.updateDatetime = updateDatetime;
  }
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }
  public Integer getIsAdmin() {
    return isAdmin;
  }
  public void setIsAdmin(Integer isAdmin) {
    this.isAdmin = isAdmin;
  }
  public Integer getActive() {
    return active;
  }
  public void setActive(Integer active) {
    this.active = active;
  }
}
