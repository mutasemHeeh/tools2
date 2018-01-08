package edu.ppu.runners;

import java.util.Arrays;
import java.util.List;

import edu.ppu.domain.Person;

public class PersonRunner {
	public static void main(String[] args) {
		Person person = new Person("p1", 10);
		List<Person> persons = Arrays.asList(new Person("p2", 10), new Person("p3", 20));
		double avgAge = getAvg(persons);
		System.out.println(avgAge);
		getOldestGuy(persons);
	}

	private static void getOldestGuy(List<Person> persons) {
		Person maxAgePerson = null;
		for (Person person2 : persons) {
			if (maxAgePerson == null || person2.getAge() > maxAgePerson.getAge())
				maxAgePerson = person2;
		}
		System.out.println(maxAgePerson);
	}

	private static double getAvg(List<Person> persons) {
		int sum = 0;
		for (Person p : persons)
			sum += p.getAge();
		return sum / persons.size();
	}
}
