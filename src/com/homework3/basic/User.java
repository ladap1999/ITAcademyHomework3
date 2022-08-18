package com.homework3.basic;

import java.util.List;

public class User {
    private String name;
    private Long id;
    private String surname;
    private List<User> friends;

    public User() {
    }

    public User(String name, Long id, String surname) {
        this.name = name;
        this.id = id;
        this.surname = surname;
    }

    public User(String name, Long id, String surname, List<User> friends) {
        this.name = name;
        this.id = id;
        this.surname = surname;
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!name.equals(user.name)) return false;
        if (!id.equals(user.id)) return false;
        if (!surname.equals(user.surname)) return false;
        return friends.equals(user.friends);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + id.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + friends.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", surname='" + surname + '\'' +
                ", friends=" + friends +
                '}';
    }
}

