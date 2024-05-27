package beans;

import java.util.Date;

public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String sex;
    private Date brithday;
    private String phone;

    public User() {
    }

    public User(Integer id, String username, String password, Integer age, String sex, Date brithday, String phone) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.brithday = brithday;
        this.phone = phone;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取
     * @return brithday
     */
    public Date getBrithday() {
        return brithday;
    }

    /**
     * 设置
     * @param brithday
     */
    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    /**
     * 获取
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return "User{id = " + id + ", username = " + username + ", password = " + password + ", age = " + age + ", sex = " + sex + ", brithday = " + brithday + ", phone = " + phone + "}";
    }
}
