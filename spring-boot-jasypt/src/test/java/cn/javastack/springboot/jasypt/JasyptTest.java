package cn.javastack.springboot.jasypt;

import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 来源微信公众号：Java技术栈
 * 作者：栈长
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class JasyptTest {

    @Autowired
    private StringEncryptor stringEncryptor;

    /**
     * 来源微信公众号：Java技术栈
     * 作者：栈长
     */
    @Test
    public void encrypt() {
        String usernameEnc = stringEncryptor.encrypt("test");
        String passwordEnc = stringEncryptor.encrypt("mark.com");

        log.info("test username encrypt is {}", usernameEnc);
        log.info("test password encrypt is {}", passwordEnc);

        log.info("test username is {}", stringEncryptor.decrypt(usernameEnc));
        log.info("test password is {}", stringEncryptor.decrypt(passwordEnc));
    }
}