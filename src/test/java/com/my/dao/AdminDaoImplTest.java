package com.my.dao;

import com.my.config.RootContext;
import com.my.config.ServletContext;
import com.my.controller.HomeController;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitWebConfig({RootContext.class, ServletContext.class})
@Slf4j
@Transactional
class AdminDaoImplTest {
    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private AdminDao adminDao;

    @Test
    @SneakyThrows
    public void countTest() throws Exception {

        int cnt = adminDao.count();
        log.error(String.valueOf(cnt));

        assertTrue(cnt==1);
    }
}