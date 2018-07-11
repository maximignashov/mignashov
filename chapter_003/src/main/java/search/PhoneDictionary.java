package search;

import java.util.ArrayList;

/**
 * Package for class PhoneDictionary.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 08.07.2018
 */
public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }
    /**
     * Добавляет найденного персонажа в результирующий список.
     * @param person найденный персонаж.
     * @param result результирующий список.
     */
    public void addResult(Person person, ArrayList<Person> result) {
        for (int i = 0; i < this.persons.size(); i++) {
            result.add(i, person);
        }
    }
    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();

        for (Person p : this.persons) {
            if (p.getName() != null && p.getName().contains(key)
                    || p.getSurname() != null && p.getSurname().contains(key)
                    || p.getAddress() != null && p.getAddress().contains(key)
                    || p.getPhone() != null && p.getPhone().contains(key)) {
                addResult(p, result);
            }
        }
        return result;
    }
}
