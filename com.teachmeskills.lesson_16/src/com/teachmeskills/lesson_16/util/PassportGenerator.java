package com.teachmeskills.lesson_16.util;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class PassportGenerator {
    public static Set<String> GeneratePassportNumbers() {
        Set<String> passport = new HashSet<>();
        Random rand = new Random();
        String[] passportPrefix = {"MP", "KN", "AB", "CD", "EF", "GH"};

        while (passport.size() < 16) {
            String prefix = passportPrefix[rand.nextInt(passportPrefix.length)]; // загуглил способ
            StringBuilder sb = new StringBuilder(prefix);

            for (int i = 0; i < 7; i++) {
                sb.append(rand.nextInt(10));
            }
            passport.add(sb.toString());
        }
        return passport;
    }
}