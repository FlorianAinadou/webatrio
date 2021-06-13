package web.atrio.demo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/person")
public class PersonController {
    
    @Autowired
    private PersonService personService;
    
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person creatPerson(@RequestBody Person person) 
    {
        return personService.create(person);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> getAllPersons(){
        List<Person> personList = personService.read();
        if (personList.size() > 0) {
            Collections.sort(personList, new Comparator<Person>() {
                @Override
                public int compare(final Person object1, final Person object2) {
                    return object1.getName().compareTo(object2.getName());
                }
            });
          }
        return personList;
    }


}
 