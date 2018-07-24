package com.example.amibakhai.smartl;

import com.google.android.gms.auth.api.credentials.Credential;



public class Util {

    private static String[][] validCredentials = {
            {"user1", "password1"},
            {"user2", "password2"}
    };

    /**
     * Check whether or not given username and password pair exist
     */
    public static boolean isValidCredential(String username, String password) {
        for (String[] credential :
                validCredentials) {
            if (credential[0].equals(username) && credential[1].equals(password))
                return true;
        }
        return false;
    }

    public static boolean isValidCredential(Credential credential) {
        String username = credential.getId();
        String password = credential.getPassword();
        return isValidCredential(username, password);
    }
}
