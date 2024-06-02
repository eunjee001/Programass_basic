package com.kkyume.android.programass_basic;

public class no_19 {
        public int solution(int[][] sizes) {
            int maxWidth = 0;
            int maxHeight = 0;

            for (int i = 0; i < sizes.length; i++) {
                int width = sizes[i][0];
                int height = sizes[i][1];

                // 가로와 세로를 비교하여 큰 값을 가로로, 작은 값을 세로로 설정
                if (width < height) {
                    int temp = width;
                    width = height;
                    height = temp;
                }

                // 최대 가로와 최대 세로 길이를 구함
                if (width > maxWidth) {
                    maxWidth = width;
                }
                if (height > maxHeight) {
                    maxHeight = height;
                }
            }

            // 최종 최소 직사각형 넓이 계산
            return maxWidth * maxHeight;
        }
}
