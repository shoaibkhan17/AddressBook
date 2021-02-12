package App;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * App.Launcher Class
 * @author Shoaib Khan
 * @studentID 101033582
 * @date 29/01/2020
 */
public class Launcher {
    public void launch() {
        String[] contextPaths = new String[] {"app-context.xml"};
        new ClassPathXmlApplicationContext(contextPaths);
    }

    public static void main(String[] args) {
        Launcher main = new Launcher();
        main.launch();
    }
}