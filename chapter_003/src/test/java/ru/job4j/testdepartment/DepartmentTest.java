package ru.job4j.testdepartment;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;

/**
 * Package for class .
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 08.09.2018
 */
public class DepartmentTest {
    /**
     * Восстановление и сортировка по возрастанию
     */
    @Test
    public void whenSortAscThenSortsAscAndRecovers() {
        List<String> sourceArray = new ArrayList<>();

        sourceArray.add("K1\\SK1");
        sourceArray.add("K1\\SK2");
        sourceArray.add("K1\\SK1\\SSK1");
        sourceArray.add("K1\\SK1\\SSK2");
        sourceArray.add("K2");
        sourceArray.add("K2\\SK1\\SSK1");
        sourceArray.add("K2\\SK1\\SSK2");

        Department departments = new Department();
        List<String> result = departments.sortAsc(sourceArray);
        List<String> expected = new ArrayList<>();
        expected.add("K1");
        expected.add("K1\\SK1");
        expected.add("K1\\SK1\\SSK1");
        expected.add("K1\\SK1\\SSK2");
        expected.add("K1\\SK2");
        expected.add("K2");
        expected.add("K2\\SK1");
        expected.add("K2\\SK1\\SSK1");
        expected.add("K2\\SK1\\SSK2");

        Assert.assertThat(result, is(expected));
    }
    /**
     * Восстановление и сортировка по убыванию
     */
    @Test
    public void whenSortDescThenSortsDescAndRecovers() {
        List<String> sourceArray = new ArrayList<>();

        sourceArray.add("K1\\SK1");
        sourceArray.add("K1\\SK2");
        sourceArray.add("K1\\SK1\\SSK1");
        sourceArray.add("K1\\SK1\\SSK2");
        sourceArray.add("K2");
        sourceArray.add("K2\\SK1\\SSK1");
        sourceArray.add("K2\\SK1\\SSK2");

        Department departments = new Department();
        List<String> result = departments.sortDesc(sourceArray);
        List<String> expected = new ArrayList<>();

        expected.add("K2");
        expected.add("K2\\SK1");
        expected.add("K2\\SK1\\SSK2");
        expected.add("K2\\SK1\\SSK1");
        expected.add("K1");
        expected.add("K1\\SK2");
        expected.add("K1\\SK1");
        expected.add("K1\\SK1\\SSK2");
        expected.add("K1\\SK1\\SSK1");

        Assert.assertThat(result, is(expected));
    }
}
