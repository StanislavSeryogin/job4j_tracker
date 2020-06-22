package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(
                Profile::getAddress
        ).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Profiles profiles = new Profiles();
        List<Profile> profile = List.of(
                new Profile(new Address("Moscow", "First", 11, 111)),
                new Profile(new Address("Kiev", "Second", 22, 222)),
                new Profile(new Address("Minsk", "Third", 33, 333))
        );
        profiles.collect(profile).forEach(System.out::println);
    }
}
