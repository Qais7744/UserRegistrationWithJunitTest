package com.uservalidation;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserValidator {
    public boolean passwordTest(String password) {
        boolean matchesString = Pattern.matches("^[A-Z{1,}a-z]{8,}$", password);
        return matchesString;
    }
}
