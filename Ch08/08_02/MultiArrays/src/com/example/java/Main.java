package com.example.java;

public class Main {

    public static void main(String[] args) {

        String[][] states = new String[3][2];
        // 3: outer array (row, i, x)
        // 2: each item within outer array (column, j, y)
        states[0][0] = "California";
        // first sub-item in the first outer item in the array
        
        states[0][1] = "Sacramento";
        states[1][0] = "Oregon";
        states[1][1] = "Salem";
        states[2][0] = "Washington";
        states[2][1] = "Olympia";
        // each item in the outer array is a state
        // each item in the inner array is either a state or its capital
        
        // length property refers to outer array
        for (int i = 0; i < states.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("The capitol of ")
                    .append(states[i][0])
                    .append(" is ")
                    .append(states[i][1])
                    .append(".");
            // String sb = "The capitol of " + states[i][0] + " is " + states[i][1] ;
            System.out.println(sb);
        }

    }

}
/*
The capitol of California is Sacramento.
The capitol of Oregon is Salem.
The capitol of Washington is Olympia. 
 */
