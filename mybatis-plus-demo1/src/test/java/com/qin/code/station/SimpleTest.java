package com.qin.code.station;

import com.qin.code.station.bean.User;
import com.qin.code.station.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleTest {
	@Autowired
	private UserMapper userMapper;

	@Test
	public void selectAll() {
		List<User> users = userMapper.selectList(null);
		users.forEach(System.out :: println);
	}
}
