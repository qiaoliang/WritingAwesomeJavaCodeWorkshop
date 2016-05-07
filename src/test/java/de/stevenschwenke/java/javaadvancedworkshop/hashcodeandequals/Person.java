package de.stevenschwenke.java.javaadvancedworkshop.hashcodeandequals;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * This class represents a person. Each person is identified solely by its name.
 */
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;

        return new EqualsBuilder().append(name, person.name)
            .isEquals();
    }

    @Override public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name)
            .toHashCode();
    }
}