package com.deepanshu.Model;

import java.util.UUID;

public class Resource {
    private UUID id;
    private String name;

    public Resource(String resourceName) {
        setName(resourceName);
        setId(UUID.randomUUID());
    }

    public UUID getId() {
        return id;
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
