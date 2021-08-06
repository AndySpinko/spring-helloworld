import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat cat = applicationContext.getBean(Cat.class);
        System.out.println(cat.getVoice());

        Cat cat2 = applicationContext.getBean(Cat.class);
        System.out.println(cat2.getVoice());

        System.out.println(bean.equals(bean2));
        System.out.println(cat.equals(cat2));
    }
}