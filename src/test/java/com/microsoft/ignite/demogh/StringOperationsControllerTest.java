package com.microsoft.ignite.demogh;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get; // Import the necessary class for the get() method.
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content; // Import the necessary class for the content() method.
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status; // Import the necessary class for the status() method.

@WebMvcTest(StringOperationsController.class)
public class StringOperationsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testConcat() throws Exception {
        String str1 = "Hello";
        String str2 = "World";
        String expected = "HelloWorld";

        mockMvc.perform(get("/concat")
                .param("str1", str1)
                .param("str2", str2))
                .andExpect(status().isOk())
                .andExpect(content().string(expected));
    }

    // test para validar parametro vacio
    @Test
    public void testConcatEmpty() throws Exception {
        String str1 = "";
        String str2 = "World";
        String expected = "Los parámetros no pueden ser nulos o vacíos";

        mockMvc.perform(get("/concat")
                .param("str1", str1)
                .param("str2", str2))
                .andExpect(status().isBadRequest())
                .andExpect(content().string(expected));
    }

    @Test
    public void testSubstring() throws Exception {
        String str = "HelloWorld";
        int beginIndex = 2;
        int endIndex = 7;
        String expected = "lloWo";

        mockMvc.perform(get("/substring")
                .param("str", str)
                .param("beginIndex", String.valueOf(beginIndex))
                .param("endIndex", String.valueOf(endIndex)))
                .andExpect(status().isOk())
                .andExpect(content().string(expected));
    }

    @Test
    public void testContains() throws Exception {
        String str = "HelloWorld";
        String substr = "World";
        boolean expected = true;

        mockMvc.perform(get("/contains")
                .param("str", str)
                .param("substr", substr))
                .andExpect(status().isOk())
                .andExpect(content().string(String.valueOf(expected)));
    }

    @Test
    public void testReplace() throws Exception {
        String str = "HelloWorld";
        String oldStr = "World";
        String newStr = "Universe";
        String expected = "HelloUniverse";

        mockMvc.perform(get("/replace")
                .param("str", str)
                .param("oldStr", oldStr)
                .param("newStr", newStr))
                .andExpect(status().isOk())
                .andExpect(content().string(expected));
    }
}