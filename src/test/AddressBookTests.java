import com.example.addressbook.controller.AddressBookController;
import com.example.addressbook.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;


@RunWith(SpringRunner.class)
@WebMvcTest(value = AddressBookController.class, secure = false)
@Profile("h2")
public class AddressBookTests {

    @Autowired
    AddressBookController addressBookController;

    @Test
    public void insertPersonsTest() {
        Person person;
        for (int i=0; i<1000; i++){
            person = new Person(i, "Nombre" + i, "Apellido" + i, "email" + i + "@test.com", String.valueOf(600000000 + i), "Company" + i);
            this.addressBookController.createPerson(person);
        }
    }

    @Test
    public void getAllPersonTest() {
        this.addressBookController.getPersons().forEach(person -> {
            System.out.println("person: " + person.toString());
        });

    }
}
