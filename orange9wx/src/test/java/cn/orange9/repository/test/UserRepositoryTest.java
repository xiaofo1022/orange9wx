package cn.orange9.repository.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.orange9.Orange9wxApplication;
import cn.orange9.entity.User;
import cn.orange9.repository.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Orange9wxApplication.class)
@WebAppConfiguration
public class UserRepositoryTest {

  @Autowired
  private UserRepository userRepository;
  
  @Test
  public void crudTest() {
    User user = userRepository.findOne(1L);
    Assert.assertNotNull(user);
  }
}
