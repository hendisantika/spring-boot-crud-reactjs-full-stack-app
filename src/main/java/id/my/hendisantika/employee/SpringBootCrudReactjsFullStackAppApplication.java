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
            employeeRepository.deleteAll();
            employeeRepository.save(new Employee("Uzumaki", "Naruto", "naruto@yopmail.com"));
            employeeRepository.save(new Employee("Uchiha", "Sasuke", "sasuke@yopmail.com"));
            employeeRepository.save(new Employee("Haruno", "Sakura", "sakura@yopmail.com"));
            employeeRepository.save(new Employee("Hatake", "Kakashi", "kakashi@yopmail.com"));
            employeeRepository.save(new Employee("Itadori", "Yuji", "yuji@yopmail.com"));
        };
    }
}
