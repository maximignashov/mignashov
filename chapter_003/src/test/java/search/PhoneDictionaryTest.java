package search;

import org.junit.Test;

import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Package for class PhoneDictionaryTest.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 10.07.2018
 */
public class PhoneDictionaryTest {
    /**
     * Test find person by name.
     */
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        phones.add(
                new Person("Maxim", "Ignashov", "654785", "NNovgorod")
        );
        List<Person> persons = phones.find("Petr");
        assertThat(persons.iterator().next().getSurname(), is("Arsentev"));
    }
    /**
     * Test find person by surname.
     */
    @Test
    public void whenFindBySurname() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        phones.add(
                new Person("Maxim", "Ignashov", "654785", "NNovgorod")
        );
        List<Person> persons = phones.find("Igna");
        assertThat(persons.iterator().next().getName(), is("Maxim"));
    }
    /**
     * Test find person by phone.
     */
    @Test
    public void whenFindByPhone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        phones.add(
                new Person("Maxim", "Ignashov", "654785", "NNovgorod")
        );
        List<Person> persons = phones.find("4872");
        assertThat(persons.iterator().next().getName(), is("Petr"));
    }
    /**
     * Test find person by address.
     */
    @Test
    public void whenFindByAddress() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        phones.add(
                new Person("Maxim", "Ignashov", "654785", "NNovgorod")
        );
        List<Person> persons = phones.find("NN");
        assertThat(persons.iterator().next().getName(), is("Maxim"));
    }
}


