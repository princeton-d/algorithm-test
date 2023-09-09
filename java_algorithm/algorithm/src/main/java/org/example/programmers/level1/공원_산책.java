package org.example.programmers.level1;

public class 공원_산책 {

    public static void main(String[] args) {

    }

    public static int[] solution(String[] park, String[] routes) {
        int[] currentLocation = null;

        for (int i = 0; i < park.length; i++) {
            if (park[i].indexOf("S") != -1) {
                currentLocation = new int[]{i, park[i].indexOf("S")};
                break;
            }
        }


        for (int i = 0; i < routes.length; i++) {
            String direction = routes[i].substring(0, 1);
            int numberOfMove = Integer.parseInt(routes[i].substring(2, 3));

            if (direction.equals("N")) {
                if (currentLocation[0] - numberOfMove >= 0) {
                    currentLocation[0] = currentLocation[0] - numberOfMove;
                    continue;
                }
            }

            if (direction.equals("S")) {
                if (currentLocation[0] + numberOfMove <= park.length - 1) {
                    currentLocation[0] = currentLocation[0] + numberOfMove;
                    continue;
                }
            }

            if (direction.equals("W")) {
                if (currentLocation[1] - numberOfMove >= 0) {
                    currentLocation[1] = currentLocation[1] - numberOfMove;
                    continue;
                }
            }

            if (direction.equals("E")) {
                if (currentLocation[1] + numberOfMove <= park[i].length() - 1) {
                    currentLocation[1] = currentLocation[1] + numberOfMove;
                }
            }
        }

        return currentLocation;
    }

}
