package com.homework.springhometask.testuserrestcontrollerv1;

import com.homework.springhometask.SpringhometaskApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
public class UserControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void TestLoginUserPage() throws Exception{
       // mockMvc.perform()
    }

}
