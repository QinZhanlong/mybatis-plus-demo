package com.qin.code.station.bean;

public class User {
//			| id                  | name      | age  | email             | manager_id          | create_time         |
//			+---------------------+-----------+------+-------------------+---------------------+---------------------+
//			|   10879822573332456 | 刘禹锡    |   45 | liuyuxi@qq.com    | 1087982257332883453 | 2019-02-23 12:23:09 |
//			| 1087982257332883453 | 大张伟    |   25 | dazahngwei@qq.com | 1087982257332887553 | 2019-01-23 12:23:09 |
//			| 1087982257332887553 | big boss  |   40 | boss@qq.com       |                NULL | 2019-11-23 12:23:09 |
//			+---------------------+-----------+------+-------------------+---------------------+---------------------+
	private long id;
	private String name;
	private int age;
	private String email;
	private String managerId;
	private String createTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				", email='" + email + '\'' +
				", managerId='" + managerId + '\'' +
				", createTime='" + createTime + '\'' +
				'}';
	}
}
