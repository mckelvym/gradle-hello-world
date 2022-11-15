package com.linkedinlearning.reverser;

public class StringReverser {
    public String reverse(String in) {
        if (in == null || "".equals(in)) {
            return in;
        }

        StringBuilder out = new StringBuilder();
        int length = in.length();

        for (int i = length - 1; i >= 0; i--) {
            out.append(in.charAt(i));
        }

        return out.toString();
    }
}