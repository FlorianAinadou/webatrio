package web.atrio.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersoServiceImpl implements PersonService{
    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person create(Person person) {
        
        return personRepository.insert(person);
    }

    @Override
    public List<Person> read() {
        
        return personRepository.findAll();
    }
    
}
