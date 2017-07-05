import com.example.addressbook.controller.AddressBookController;
import com.example.addressbook.model.Person;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@ContextConfiguration(locations = {"classpath:h2-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AddressBookTests {

    @Mock
    AddressBookController addressBookController;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void createPersonsTest() {
        Person person;
        for (int i=0; i<1000; i++){
            person = new Person(i, "Nombre" + i, "Apellido" + i, "email" + i + "@test.com", String.valueOf(600000000 + i), "Company" + i);
            this.addressBookController.createPerson(person);
            System.out.println("Added person " + i);
        }
        System.out.println("sizeeee: " + this.addressBookController.getPersons().size());
    }

    @Test
    public void getAllPersonTest() {
        System.out.println("sizeeee: " + this.addressBookController.getPersons().size());
        this.addressBookController.getPersons().forEach(person -> {
            System.out.println("person: " + person.toString());
        });

    }
}
