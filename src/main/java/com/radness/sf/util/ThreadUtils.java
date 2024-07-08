package com.radness.sf.util;

import com.radness.sf.account.Account;

import java.util.Map;
import java.util.Optional;

public class ThreadUtils {

    private static final ThreadLocal<Map<String, Object>> threadLocal = new ThreadLocal<>();

    public static Optional<Account> getAccount(String s) {
        return null;
    }
}
