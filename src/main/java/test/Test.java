package test;

import com.southwind.controller.UserController;
import com.southwind.repository.UserRepository;
import com.southwind.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        UserController userController=(UserController)applicationContext.getBean("test");
        System.out.println(userController.findById(1));
        UserService userService=(UserService)applicationContext.getBean("userServiceImpl");
        UserRepository userRepository=(UserRepository)applicationContext.getBean("userRepositoryImpl");
     System.out.println(userRepository);
    }
}
