package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorAskByName() {
        Job vasya = new Job("Vasya", 4);
        Job alisa = new Job("Alisa", 1);
        Job ben = new Job("Ben", 2);
        List<Job> jobs = new ArrayList<>();
        jobs.add(vasya);
        jobs.add(alisa);
        jobs.add(ben);
        Collections.sort(jobs, new JobAscByName());
        List<Job> expected = Arrays.asList(
                alisa, ben, vasya
        );
        assertIterableEquals(expected, jobs);
    }

    @Test
    public void whenComparatorDescByName() {
        Job vasya = new Job("Vasya", 4);
        Job alisa = new Job("Alisa", 1);
        Job ben = new Job("Ben", 2);
        List<Job> jobs = new ArrayList<>();
        jobs.add(vasya);
        jobs.add(alisa);
        jobs.add(ben);
        Collections.sort(jobs, new JobDescByName());
        List<Job> expected = Arrays.asList(
                vasya, ben, alisa
        );
        assertIterableEquals(expected, jobs);
    }

    @Test
    public void whenComparatorAskByPriority() {
        Job vasya = new Job("Vasya", 2);
        Job alisa = new Job("Alisa", 1);
        Job ben = new Job("Ben", 4);
        List<Job> jobs = new ArrayList<>();
        jobs.add(vasya);
        jobs.add(alisa);
        jobs.add(ben);
        Collections.sort(jobs, new JobAscByPriority());
        List<Job> expected = Arrays.asList(
                alisa, vasya, ben
        );
        assertIterableEquals(expected, jobs);
    }

    @Test
    public void whenComparatorDescByPriority() {
        Job vasya = new Job("Vasya", 2);
        Job alisa = new Job("Alisa", 1);
        Job ben = new Job("Ben", 4);
        List<Job> jobs = new ArrayList<>();
        jobs.add(vasya);
        jobs.add(alisa);
        jobs.add(ben);
        Collections.sort(jobs, new JobDescByPriority());
        List<Job> expected = Arrays.asList(
                ben, vasya, alisa
        );
        assertIterableEquals(expected, jobs);
    }
}