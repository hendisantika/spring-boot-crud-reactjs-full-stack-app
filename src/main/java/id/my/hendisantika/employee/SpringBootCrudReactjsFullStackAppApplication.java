package id.my.hendisantika.employee;

import id.my.hendisantika.employee.model.Employee;
import id.my.hendisantika.employee.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootCrudReactjsFullStackAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCrudReactjsFullStackAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(EmployeeRepository employeeRepository) {
        return (args) -> {
            employeeRepository.save(new Employee(1L, "Uzumaki", "Naruto", "naruto@yopmail.com"));
            employeeRepository.save(new Employee(2L, "Uchiha", "Sasuke", "sasuke@yopmail.com"));
            employeeRepository.save(new Employee(3L, "Haruno", "Sakura", "sakura@yopmail.com"));
            employeeRepository.save(new Employee(4L, "Hatake", "Kakashi", "kakashi@yopmail.com"));
            employeeRepository.save(new Employee(5L, "Itadori", "Yuji", "yuji@yopmail.com"));
        };
    }
}
