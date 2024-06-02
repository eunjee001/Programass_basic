package com.kkyume.android.programass_basic;

public class no_18 {

    public String solution(String phone_number) {
        if (phone_number == null || phone_number.length() <= 4) {
            return phone_number; // 문자열이 null이거나 길이가 4 이하인 경우 그대로 반환
        }

        int lengthToMask = phone_number.length() - 4;
        StringBuilder masked = new StringBuilder();

        // 앞부분을 *로 채우기
        for (int i = 0; i < lengthToMask; i++) {
            masked.append('*');
        }

        // 마지막 4자리 붙이기
        masked.append(phone_number.substring(lengthToMask));

        return masked.toString();
    }
}
