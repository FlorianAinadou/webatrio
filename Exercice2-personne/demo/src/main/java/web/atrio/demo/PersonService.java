package web.atrio.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface PersonService{
    
    Person create(Person person);

    List<Person> read();
}
