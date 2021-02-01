package com.deepanshu.Model;

import java.util.UUID;

public class Role {
    private UUID id;
    private String name;

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public Role(String roleName) {
        setId(UUID.randomUUID());
        setName(roleName);
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
