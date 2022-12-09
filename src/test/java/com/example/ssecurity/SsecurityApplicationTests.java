package com.example.ssecurity;

import com.example.ssecurity.Controller.SecurityController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = SsecurityApplication.class)
@RunWith(SpringRunner.class)
class SsecurityApplicationTests {
    @Autowired
    private SecurityController securityController;

    @Test
    void contextLoads() {
        System.out.println(securityController.hello());
    }

}
