package com.example;

import java.util.HashMap;
import java.util.Map;

public class Passwords {
    private static final Passwords INSTANCE = new Passwords();
    private Passwords(){};
    public static Passwords getInstance() {
        return INSTANCE;
    }

    private Map<Long, String> passwords = new HashMap<Long, String>();
    public void addPassword(Long id, String password) {
        passwords.put(id, password);
    }
    public Map<Long, String> getPasswords() {
        return passwords;
    }
}
