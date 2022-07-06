import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld newHWBean =
                (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(bean == newHWBean);

        Cat catBean =
                (Cat) applicationContext.getBean("cat");

        Cat anotherCatBean =
                (Cat) applicationContext.getBean("cat");

        System.out.println(catBean == anotherCatBean);

    }
}