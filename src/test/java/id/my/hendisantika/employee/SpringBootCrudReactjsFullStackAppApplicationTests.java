package id.my.hendisantika.employee;

import id.my.hendisantika.employee.repository.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@Testcontainers
@SpringBootTest(
        properties = {
                "management.endpoint.health.show-details=always",
                "spring.datasource.url=jdbc:tc:mysql:9.1.0:///employeeDB"
        },
        webEnvironment = RANDOM_PORT
)
class SpringBootCrudReactjsFullStackAppApplicationTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    @BeforeEach
    void deleteAll() {
        employeeRepository.deleteAll();
    }

}
