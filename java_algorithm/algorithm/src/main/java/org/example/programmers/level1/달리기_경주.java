package org.example.programmers.level1;

import java.util.*;

public class 달리기_경주 {

    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> playerMap = new HashMap<>();
        HashMap<Integer, String> lankMap = new HashMap<>();
        String[] result = new String[players.length];

        for (int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i + 1);
            lankMap.put(i + 1, players[i]);
        }

        for (String name : callings) {
            Integer playerLank = playerMap.get(name);
            String playerName = lankMap.get(playerLank);

            String prevPlayerName = lankMap.get(playerLank - 1);
            Integer prevPlayerLank = playerMap.get(prevPlayerName);

            playerMap.put(prevPlayerName, playerLank);
            playerMap.put(playerName, prevPlayerLank);
            lankMap.put(prevPlayerLank, playerName);
            lankMap.put(playerLank, prevPlayerName);
        }

        for (int i = 0; i < players.length; i++) {
            result[i] = lankMap.get(i + 1);
        }

        return result;
    }

}
