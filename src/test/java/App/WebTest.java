package App;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc

@SpringBootTest
public class WebTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void buddy1NameTest() throws Exception {
        this.mockMvc.perform(get("/AddressBook")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Shoaib")));
    }

    @Test
    public void buddy1NameNumber() throws Exception {
        this.mockMvc.perform(get("/AddressBook")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("6138896587")));
    }

    @Test
    public void buddy2NameTest() throws Exception {
        this.mockMvc.perform(get("/AddressBook")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Omar")));
    }

    @Test
    public void buddy1AddressTest() throws Exception {
        this.mockMvc.perform(get("/AddressBook")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("123 water road")));
    }

    @Test
    public void buddy2AddressTest() throws Exception {
        this.mockMvc.perform(get("/AddressBook")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("153 water road")));
    }
}