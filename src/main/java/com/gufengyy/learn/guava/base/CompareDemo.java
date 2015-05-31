package com.gufengyy.learn.guava.base;

import java.util.Set;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;

/**
 * 
 * @author gufengyy
 * @see http://ifeve.com/google-guava-commonobjectutilities/
 */
public class CompareDemo {

    public static void main(String[] args) {
        Set<Person> set = Sets.newTreeSet();
        set.add(new Person("lei", "zhang", 473409));
        set.add(new Person(null, "zhang", 473418));
        set.forEach(System.out::println);
    }

    static class Person implements Comparable<Person> {
        private String lastName;
        private String firstName;
        private int zipCode;

        public Person(String lastName, String firstName, int zipCode) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.zipCode = zipCode;
        }

        public int compareTo(Person that) {
            return ComparisonChain
                    .start()
                    .compare(this.firstName, that.firstName)
                    .compare(this.lastName, that.lastName,
                            Ordering.natural().nullsLast())
                    .compare(this.zipCode, that.zipCode).result();
        }

        @Override
        public String toString() {
            return MoreObjects.toStringHelper(this.getClass())
                    .add("firstName", firstName).add("lastName", this.lastName)
                    .add("zipCode", this.zipCode).toString();
        }

    }
}
