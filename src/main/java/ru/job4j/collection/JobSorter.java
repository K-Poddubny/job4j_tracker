package ru.job4j.collection;

import java.util.Arrays;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 8),
                new Job("ampl task", 1),
                new Job("Reboot server", 3)
        );
        System.out.println(jobs);
        jobs.sort(new SortDescByNameJob());
        System.out.println(jobs);
    }
}