package com.mrtrain.mrtrainsch;

import android.widget.TextView;


//All global Variables array accessed as the Global.VariableName
//All array are made from 0 to 23 hundred
//以下の時刻は現在の時刻ではありません。

public class Global {
    public static String strTime="";

    public static TextView nishikasaiToNakanotv;
    public static TextView nihonbashiToShibuyatv;
    public static TextView shinbashiToOofunatv;
    public static TextView musashikosugiToToukyoutv;
    public static TextView shinbashiToAsakusatv;
    public static TextView nihonbashiToNishiFunabashitv;

    public static final int[][] nishikasaiToNakano = new int[][] {
            {},
            {},
            {},
            {},
            {},
            {17,22,35,44,52},
            {3,10,18,21,29,34,39,40,48,51,56,58},
            {3,6,10,14,19,21,26,28,31,36,40,45,51,54,57},
            {1,3,8,10,15,18,24,26,31,34,39,41,46,49,54,56},
            {1,5,11,16,21,27,31,36,39,43,50,54,58},
            {6,11,20,22,34,41,50,56},
            {6,17,20,22,38,42,50,56},
            {6,12,20,22,34,41,50,56},
            {6,12,20,22,34,41,50,55},
            {6,12,20,22,34,41,50,55},
            {6,12,20,22,34,41,50,55},
            {3,7,10,19,26,33,39,47,54},
            {2,5,15,19,22,30,36,42,45,49,57},//17
            {1,10,14,22,26,30,37,42,48,51,56},
            {4,8,14,19,26,31,37,42,46,52,54,57},
            {3,6,12,17,23,30,33,39,45,48,55,58},
            {4,10,14,18,25,30,34,41,46,51,59},
            {5,10,19,25,31,39,47,53},
            {5,14,25,35,48},
            {2,11,21}};


    //to Nakano Shukujitsu
    public static final int[][] nishikasaiToNakanoH = new int[][] {
            {},
            {},
            {},
            {},
            {},
            {7,20,32,44,53},
            {3,10,19,28,36,43,49,55},
            {1,7,12,17,22,26,31,36,41,46,50,54,59},
            {6,10,15,20,25,30,36,41,46,51,55},
            {1,6,12,18,23,28,36,43,51,58},
            {6,13,21,28,35,43,51,58},
            {5,13,20,28,35,43,50,58},
            {5,13,19,28,34,43,51,58},
            {5,13,20,28,35,43,50,58},
            {5,13,20,28,35,43,50,58},
            {5,13,20,28,35,43,50,58},
            {5,13,20,28,35,41,48,58},
            {5,13,20,25,30,39,43,51,58},
            {4,12,20,28,35,44,51,58},
            {4,12,20,28,35,44,51,58},
            {4,12,20,28,35,44,51,59},
            {4,12,20,28,35,44,51,55,59},
            {6,13,22,28,36,45,52},
            {3,14,25,36,48,59},
            {9,20}};

    //Nihonbashi
    public static final int[][] nihonbashiToNishiFunabashi = new int[][] {
            {},
            {},
            {},
            {},
            {},
            {21,33,44,54},
            {3,14,20,26,32,39,47,54,59},
            {5,10,15,19,22,25,28,31,34,36,39,42,45,48,51,54,57,59},
            {3,6,8,11,14,16,19,21,24,26,29,31,34,37,39,42,44,47,49,52,54,57,59},
            {2,4,7,9,11,15,17,18,22,25,27,30,32,35,38,41,44,47,50,52,54,56,59},
            {1,3,6,8,11,14,16,19,22,26,29,32,37,40,46,49,52,55,58},
            {2,5,10,14,19,24,29,34,39,44,49,54,59},
            {4,9,16,19,24,29,34,38,44,49,54,58},//12
            {4,9,16,19,24,29,34,38,44,49,54,58},
            {4,9,16,19,24,29,34,38,44,49,54,58},
            {4,9,16,19,24,29,34,38,44,49,54,58},
            {4,9,16,19,24,29,34,38,44,49,54,58},
            {1,5,9,13,16,20,25,28,31,35,38,40,44,47,51,54,58},
            {1,4,7,10,12,15,18,22,24,27,30,33,36,39,43,46,49,53,56,59},
            {2,4,7,11,14,17,21,24,27,31,34,36,40,43,47,51,54,58},
            {1,4,8,11,16,19,23,27,30,34,38,41,45,49,53,57},
            {1,5,9,14,18,22,26,30,34,38,42,46,49,53,57},
            {1,5,9,13,16,21,25,30,34,38,42,46,50,55},
            {0,5,8,14,19,24,29,35,41,47,53,58},
            {2,5,10,22}};

    public static final int[][] nihonbashiToNakano = new int[][] {
            {},
            {},
            {},
            {},
            {},
            {7,17,28,35,43,47,53,59},
            {5,12,19,24,28,32,37,40,44,48,50,54,57},
            {0,2,6,9,11,14,17,19,22,24,27,29,32,35,38,40,43,46,48,51,54,56,59},
            {1,4,6,9,11,13,16,18,20,23,25,27,28,30,34,36,38,41,43,45,47,50,52,54,57,59},
            {2,4,7,9,12,14,17,19,22,24,26,28,30,36,39,43,46,49,52,55,58},
            {1,4,8,12,16,19,23,28,32,37,42,47,52,57},
            {3,7,12,17,22,27,30,37,43,47,52,57},
            {3,7,12,17,22,27,30,37,43,47,52,57},
            {3,7,12,17,22,27,30,37,43,47,52,57},
            {3,7,12,17,22,27,30,37,43,47,52,57},
            {3,7,12,17,22,27,30,37,43,47,52,57},
            {2,6,11,15,18,23,25,29,32,35,39,43,47,51,56},
            {0,3,7,10,15,18,21,24,26,29,32,34,36,40,44,47,50,53,56,58},
            {0,3,7,10,15,18,21,24,26,29,32,34,36,40,44,47,50,58},
            {3,7,10,14,18,22,26,29,33,36,41,44,48,52,56},
            {0,4,7,10,14,19,22,25,29,32,36,40,44,47,51,55,58},
            {2,6,9,13,16,20,25,28,32,36,39,43,47,51,55,59},
            {3,7,12,16,21,28,31,36,41,46,52,57},
            {2,8,16,20,26,34,46,56},
            {9,20}};

    public static final int[][] nihonbashiToNishiFunabashiH = new int[][] {
            {},
            {},
            {},
            {},
            {},
            {21,33,40,54},
            {4,14,20,26,35,43,52,59},
            {8,15,22,28,35,42,48,53,59},
            {6,12,17,20,29,32,37,41,46,51,55},
            {0,5,8,13,18,22,26,31,36,40,44,49,55},
            {0,5,12,14,19,24,29,34,39,44,49,54,59},
            {4,8,14,19,24,30,34,39,44,49,54,59},
            {4,8,14,19,24,30,34,39,44,49,54,59},
            {4,8,14,19,24,30,34,39,44,49,54,59},
            {4,8,14,19,24,30,34,39,44,49,54,59},
            {4,8,14,19,24,30,34,39,44,49,54,59},
            {4,9,14,19,25,30,35,40,45,50,56},
            {4,9,14,19,25,30,35,40,45,50,56},
            {4,9,14,19,25,30,35,40,45,50,56,59},
            {4,9,14,19,25,30,35,40,45,50,56,59},
            {2,7,13,18,24,29,35,41,47,53,59},
            {4,10,16,21,27,33,40,46,51,54},
            {4,10,16,21,27,33,40,46,51},
            {3,10,18,25,32,40,47,56},
            {2,11,20}
            };

    public static final int[][] nihonbashiToNakanoH = new int[][] {
            {},
            {},
            {},
            {},
            {},
            {7,17,28,34,41,47,53,59},
            {5,14,24,31,40,51,57},
            {4,10,16,22,28,33,38,43,47,52,57},
            {2,6,10,15,19,22,27,31,35,38,42,46,50,53,58},
            {3,7,11,15,19,23,27,32,37,42,47,52,57},
            {2,7,12,17,22,27,32,37,42,47,52,57},
            {2,7,12,17,22,26,32,37,40,47,50,57},
            {2,7,12,17,22,26,32,37,40,47,50,57},
            {2,7,12,17,22,26,32,37,40,47,50,57},
            {2,7,12,17,22,26,32,37,40,47,50,57},
            {2,7,12,17,22,26,32,37,40,47,50,57},
            {0,7,12,17,22,26,32,37,40,47,50,57},
            {0,7,12,17,22,26,32,37,40,47,50,57},
            {0,7,12,17,22,26,32,37,40,47,50,57},
            {7,8,13,19,24,30,35,41,46,52,58},
            {7,8,13,19,24,30,35,41,46,52,58},
            {7,8,13,19,24,30,35,41,46,52,56},
            {7,8,13,19,24,30,35,41,52},
            {6,15,24,35,46,56},
            {9}};

    public static final int[][] nihonbashiToShibuya = new int[][] {
            {},
            {},
            {},
            {},
            {},
            {15,29,37,46,54},
            {2,8,15,21,27,33,39,44,49,52,55,59},
            {2,5,8,10,13,15,18,20,23,25,28,30,33,35,38,40,42,44,46,48,50,52,54,56,58},
            {0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,52,54,56,58},
            {0,3,5,7,9,12,14,17,19,22,24,27,29,32,34,37,40,42,45,48,51,54,57},
            {0,3,6,9,12,15,18,21,24,27,30,33,37,40,42,45,48,51,54,57},
            {0,3,6,9,12,15,18,21,24,27,30,33,36,39,42,45,48,51,54,57},
            {0,3,6,9,12,15,18,21,24,27,30,33,36,39,42,45,48,51,54,57},
            {0,3,6,9,12,15,18,21,24,27,30,33,36,39,42,45,48,51,54,57},
            {0,3,6,9,12,15,18,21,24,27,30,33,36,39,42,45,48,51,54,57},
            {0,3,6,9,12,15,18,21,24,27,30,33,36,39,42,45,48,51,54,57},
            {0,3,6,9,12,15,18,21,24,27,29,32,34,37,39,42,44,47,49,51,54,56,58},
            {1,3,5,7,10,12,14,16,19,21,23,25,28,30,32,34,37,39,41,43,46,48,50,52,55,57,59},
            {1,4,6,8,10,13,15,17,19,22,24,26,28,31,33,35,37,40,42,44,46,49,51,53,55,58},
            {0,2,5,7,10,12,15,17,20,22,25,28,31,34,37,39,42,45,49,52,56,59},
            {3,6,9,12,16,20,23,27,31,35,39,43,47,51,55},
            {0,4,9,14,18,23,28,32,37,41,46,50,55,59},
            {4,8,13,17,21,26,30,35,39,44,48,52,57},
            {2,6,11,16,20,25,30,34,39,44,48,54,59},
            {9,19}};
    public static final int[][] nihonbashiToAsakusa = new int[][] {
            {},
            {},
            {},
            {},
            {},
            {20,31,42,51,59},
            {6,14,18,21,27,34,37,42,47,53,58},
            {3,8,13,17,21,25,29,32,35,38,42,45,48,51,54,57,59},
            {2,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49,51,53,55,57,59},
            {1,3,5,7,9,11,13,15,17,19,21,24,26,28,30,33,35,38,40,43,45,48,50,53,56,58},
            {0,3,7,10,12,15,18,21,24,27,30,33,36,39,42,46,48,51,54,58},
            {0,3,7,10,12,15,18,21,24,27,30,33,36,39,42,46,48,51,54,58},
            {0,3,7,10,12,15,18,21,24,27,30,33,36,39,42,46,48,51,54,58},
            {0,3,7,10,12,15,18,21,24,27,30,33,36,39,42,46,48,51,54,58},
            {0,3,7,10,12,15,18,21,24,27,30,33,36,39,42,46,48,51,54,58},
            {0,3,7,10,12,15,18,21,24,27,30,33,36,39,42,46,48,51,54,58},
            {0,3,6,9,12,15,18,21,24,27,29,32,33,35,39,42,44,47,49,52,54,57,59},
            {0,3,6,9,12,15,18,21,24,27,29,32,33,35,39,42,44,47,49,52,54,57,59},
            {0,3,6,9,12,15,18,21,24,27,29,32,33,35,39,42,44,47,49,52,54,57,59},
            {0,3,6,9,12,15,18,21,24,27,29,32,33,35,39,42,44,47,49,52,54,57,59},
            {0,3,6,9,12,15,18,21,24,27,29,32,33,35,39,42,44,47,49,52,54,59},
            {0,2,8,12,17,21,26,30,35,39,44,48,53,56},
            {0,2,8,12,17,21,26,30,35,39,44,48,53,56},
            {0,2,8,12,17,21,26,30,35,39,44,48,53,56},
            {3,10,16,21,26,31}};

    public static final int[][] nihonbashiToAsakusaH = new int[][] {
            {},
            {},
            {},
            {},
            {},
            {20,30,42,51},
            {0,8,17,25,29,33,41,48,55},
            {1,7,13,19,26,31,37,43,49,55},
            {1,7,12,15,22,27,32,37,42,47,52,57},
            {2,7,12,17,22,27,32,36,41,44,48,51,54,57},
            {0,3,6,8,12,15,18,20,23,27,30,33,36,39,42,45,48,51,54,57},
            {0,3,6,8,12,15,18,20,23,27,30,33,36,39,42,45,48,51,54,57},
            {0,3,6,8,12,15,18,20,23,27,30,33,36,39,42,45,48,51,54,57},
            {0,3,6,8,12,15,18,20,23,27,30,33,36,39,42,45,48,51,54,57},
            {0,3,6,8,12,15,18,20,23,27,30,33,36,39,42,45,48,51,54,57},
            {0,3,6,8,12,15,18,20,23,27,30,33,36,39,42,45,48,51,54,56},
            {0,3,6,8,12,15,18,20,23,27,30,33,36,39,42,45,48,51,54,56},
            {0,3,6,8,12,15,18,20,23,27,30,33,36,39,42,45,48,51,54,56},
            {0,3,6,8,12,15,18,20,23,27,30,33,36,39,42,45,48,51,54,56},
            {0,3,6,8,12,15,18,20,23,27,30,33,36,39,42,45,48,51,54},
            {0,3,6,8,12,15,18,20,23,27,30,33,36,39,42,45,48,51},
            {3,7,12,17,22,27,30,37,42,47,52,56},
            {3,7,12,17,22,27,30,37,47,52,56},
            {1,6,13,20,27,35,41,48,58},
            {7,26,35}};

    public static final int[][] nihonbashiToShibuyaH = new int[][] {
            {},
            {},
            {},
            {},
            {},
            {15,29,37,47,54},
            {2,8,16,23,30,36,42,48,54},
            {0,7,12,18,24,30,36,42,48,53,58},
            {3,8,13,18,23,25,33,38,43,48,53,56},
            {3,7,12,15,19,22,26,29,33,36,39,42,45,48,51,54,57},
            {0,3,6,9,12,15,19,21,25,27,31,33,36,39,43,45,48,51,54,57},
            {0,3,6,9,12,15,19,21,25,27,31,33,36,39,43,45,48,51,54,57},
            {0,3,6,9,12,15,19,21,25,27,31,33,36,39,43,45,48,51,54,57},
            {0,3,6,9,12,15,19,21,25,27,31,33,36,39,43,45,48,51,54,57},
            {0,3,6,9,12,15,18,21,24,27,30,33,36,39,42,45,48,51,54,57},
            {0,3,6,9,12,15,19,21,25,27,31,33,36,39,43,45,48,51,54,57},
            {0,3,6,9,12,15,19,21,25,27,31,33,36,39,43,45,48,51,54,57},
            {0,3,6,9,12,15,19,21,25,27,31,33,36,39,43,45,48,51,54,57},
            {0,3,6,9,12,15,19,21,25,27,31,33,36,39,43,45,48,51,54,57},
            {0,3,6,9,12,15,19,21,25,27,31,33,36,39,43,45,48,51,54,57},
            {0,4,8,12,16,20,25,29,31,38,43,48,53,59},
            {0,4,8,12,16,20,25,29,31,38,43,48,53,59},
            {0,4,8,12,16,20,25,29,31,38,43,48,53},
            {0,4,8,12,16,20,25,38,44,59},
            {11}};
//Nihonbashi end

    //Shinbashi Start
    public static final int[][] shinbashiToShibuya = new int[][] {
            {},
            {},
            {},
            {},
            {},
            {20,34,42,51,58},
            {7,13,20,26,32,38,44,50,54,57},
            {1,4,7,10,13,17,18,21,23,26,28,31,33,36,38,41,43,45,47,49,51,53,55,57,59},
            {1,4,7,10,13,17,18,21,23,26,28,31,33,36,38,41,43,45,47,49,51,53,55,57,59},
            {1,4,7,10,13,17,18,21,23,26,28,31,33,36,38,41,43,45,47,49,51,53,55,57,59},
            {1,4,7,10,13,17,18,21,23,26,28,31,33,36,38,41,43,45,47,49,51,53,55,57,59},
            {1,4,7,10,13,17,18,21,23,26,28,31,33,36,38,41,43,45,47,49,51,53,55,57,59},
            {1,4,7,10,13,17,18,21,23,26,28,31,33,36,38,41,43,45,47,49,51,53,55,57,59},
            {1,4,7,10,13,17,18,21,23,26,28,31,33,38,41,43,45,49,51,53,55,57,59},
            {2,5,8,11,14,17,20,23,26,29,32,35,38,41,44,47,50,53,56},
            {2,5,8,11,14,17,20,23,26,29,32,35,38,41,44,47,50,53,56,59},
            {2,5,8,11,14,17,21,24,27,30,32,34,37,41,42,45,47,50,52,54,57,59},
            {2,4,6,9,11,13,15,17,19,22,24,26,28,31,33,35,37,40,42,44,46,49,51,53,55,58},
            {2,4,6,9,11,13,15,17,19,22,24,26,28,31,33,35,37,40,42,44,46,49,51,53,55,58},
            {2,4,6,9,11,13,15,17,19,22,24,26,28,31,33,35,37,40,42,44,46,49,51,53,55,58},
            {2,4,6,9,11,13,15,17,19,22,24,26,28,31,33,35,37,40,42,44,46,49,51,53,55,58},
            {1,5,10,14,19,24,28,33,36,42,46,51,55},
            {0,4,9,13,18,22,27,31,36,40,44,49,53,58},
            {2,7,12,16,21,26,30,35,40,44,49,54,59},
            {4,15,28}};

    public static final int[][] shinbashiToAsakusa = new int[][] {
            {},
            {},
            {},
            {},
            {},
            {15,26,36,46,54},
            {1,9,13,17,22,29,33,37,42,48,53,58},
            {2,7,11,15,19,23,27,30,33,36,40,43,46,49,51,54,57,59},
            {1,3,5,7,9,11,13,16,18,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49,51,53,55,57,59},
            {1,3,6,8,10,12,14,16,18,21,23,25,28,30,33,35,38,40,43,45,48,51,53,56,59},
            {2,5,8,11,13,16,19,22,26,28,31,34,36,41,43,46,49,52,55,58},
            {2,5,8,11,13,16,19,22,26,28,31,34,36,41,43,46,49,52,55,58},
            {2,5,8,11,13,16,19,22,26,28,31,34,36,41,43,46,49,52,55,58},
            {2,5,8,11,13,16,19,22,26,28,31,34,36,41,43,46,49,52,55,58},
            {2,5,8,11,13,16,19,22,26,28,31,34,36,41,43,46,49,52,55,58},
            {2,5,8,11,13,16,19,22,26,28,31,34,36,41,43,46,49,52,55,58},
            {1,4,7,10,13,16,19,22,24,27,29,32,34,37,39,42,44,47,49,52,54,57},
            {0,2,4,7,9,11,13,16,18,20,22,25,27,29,31,34,36,38,40,43,45,47,49,52,54,56,58},
            {1,3,5,7,10,12,14,16,19,21,23,25,28,30,32,34,37,39,41,43,46,48,50,52,55,57,59},
            {1,4,6,8,11,13,16,19,22,25,28,31,34,37,40,43,46,49,52,55,59},
            {1,6,8,11,13,19,22,25,28,31,34,37,40,43,46,49,52,55,59},
            {1,6,8,11,13,28,31,34,37,55,59},
            {1,6,8,11,13,28,31,55,59},
            {4,8,13,18,22,27,32,38,43,49,53,57},
            {5,11,16,21,26}};
    public static final int[][] shinbashiToAsakusaH = new int[][] {
            {},
            {},
            {},
            {},
            {},
            {15,25,37,46,55},
            {3,12,20,24,28,36,43,50,56},
            {2,8,14,21,26,32,38,44,50,56},
            {2,7,12,17,22,27,32,37,42,47,52,57},
            {2,7,12,17,22,27,31,36,39,42,46,49,52,55,58},
            {1,4,7,10,13,16,19,22,25,28,31,34,37,40,43,46,49,52,55,58},
            {1,4,7,10,13,16,19,22,25,28,31,34,37,40,43,46,49,52,55,58},
            {1,4,7,10,13,16,19,21,26,28,31,34,37,41,43,46,49,52,55,58},
            {1,4,7,10,13,16,19,21,26,28,31,34,37,41,43,46,49,52,55,58},
            {1,4,7,10,13,16,19,21,26,28,31,34,37,41,43,46,49,52,55,58},
            {1,4,7,10,13,16,19,21,26,28,31,34,37,41,43,46,49,52,55,58},
            {1,4,7,10,13,16,19,21,26,28,31,34,37,41,43,46,49,52,55,58},
            {1,4,7,10,13,16,19,21,26,28,31,34,37,41,43,46,49,52,55,58},
            {1,4,7,10,13,16,19,21,26,28,31,34,37,41,43,46,49,52,55,58},
            {1,4,7,10,13,16,19,21,28,31,34,37,41,43,46,49,52,55},
            {1,4,7,10,13,16,19,21,28,31,34,37,41,43,46,49,52,55},
            {1,4,7,10,13,16,19,21,28,31,37,41,43,46,52},
            {2,7,13,18,24,30,36,42,46,55},
            {1,8,15,22,30,36,43,58},
            {2,11,21}};
    public static final int[][] shinbashiToShibuyaH = new int[][] {
            {},
            {},
            {},
            {},
            {},
            {20,34,42,51,58},
            {7,13,20,26,32,38,44,50,54,57},
            {1,4,7,10,13,17,18,21,23,26,28,31,33,36,38,41,43,45,47,49,51,53,55,57,59},
            {1,4,7,10,13,17,18,21,23,26,28,31,33,36,38,41,43,45,47,49,51,53,55,57,59},
            {1,4,7,10,13,17,18,21,23,26,28,31,33,36,38,41,43,45,47,49,51,53,55,57,59},
            {1,4,7,10,13,17,18,21,23,26,28,31,33,36,38,41,43,45,47,49,51,53,55,57,59},
            {1,4,7,10,13,17,18,21,23,26,28,31,33,36,38,41,43,45,47,49,51,53,55,57,59},
            {1,4,7,10,13,17,18,21,23,26,28,31,33,36,38,41,43,45,47,49,51,53,55,57,59},
            {1,4,7,10,13,17,18,21,23,26,28,31,33,38,41,43,45,49,51,53,55,57,59},
            {2,5,8,11,14,17,20,23,26,29,32,35,38,41,44,47,50,53,56},
            {2,5,8,11,14,17,20,23,26,29,32,35,38,41,44,47,50,53,56,59},
            {2,5,8,11,14,17,21,24,27,30,32,34,37,41,42,45,47,50,52,54,57,59},
            {2,4,6,9,11,13,15,17,19,22,24,26,28,31,33,35,37,40,42,44,46,49,51,53,55,58},
            {2,4,6,9,11,13,15,17,19,22,24,26,28,31,33,35,37,40,42,44,46,49,51,53,55,58},
            {2,4,6,9,11,13,15,17,19,22,24,26,28,31,33,35,37,40,42,44,46,49,51,53,55,58},
            {2,4,6,9,11,13,15,17,19,22,24,26,28,31,33,35,37,40,42,44,46,49,51,53,55,58},
            {1,5,10,14,19,24,28,33,36,42,46,51,55},
            {0,4,9,13,18,22,27,31,36,40,44,49,53,58},
            {2,7,12,16,21,26,30,35,40,44,49,54,59},
            {4,15,28}};



    public static final int[][] shinbashiToOofuna = new int[][] {
            {},
            {},
            {},
            {},
            {58},
            {27,48},
            {4,18,36,47,57},
            {15,28,38,45,48,53,58},
            {6,12,15,19,25,29,35,40,46,54,58},
            {4,15,26,39,46,53},
            {5,13,28,40,56},
            {11,26,42,56},
            {11,26,42,56},//12
            {11,26,42,56},
            {11,26,42,56},
            {11,26,42,56},
            {5,13,26,37,43,56},
            {6,16,28,40,44,56},
            {6,14,18,29,42,45,57},
            {6,14,18,29,42,45,57},
            {6,14,18,29,42,45,57},
            {3,15,27,36,42},
            {0,13,23,33,51},
            {7,25,38,53}};
    public static final int[][] shinbashiToToukyou = new int[][] {
            {},
            {},
            {},
            {},
            {49},
            {6,31,44,59},
            {13,20,30,36,42,49},
            {0,4,8,11,17,20,27,30,33,37,43,49},
            {0,5,10,17,21,29,34,41,46,51},
            {3,8,16,32,37,41,51},
            {8,20,36,50},
            {8,20,36,50},
            {8,20,36,50},
            {8,20,36,50},
            {8,20,36,50},
            {8,20,36,50},
            {4,13,21,39,45,51},
            {2,6,6,14,21,34,38,38,47},
            {5,14,23,36,44,51},
            {5,15,25,34,48},
            {1,9,20,28,34,42,51},
            {2,12,21,33,49},
            {0,12,33,57},
            {10}};
    public static final int[][] shinbashiToToukyouH = new int[][] {
            {},
            {},
            {},
            {},
            {49},
            {6,31,44,59},
            {13,20,30,36,42,49},
            {0,4,8,11,17,20,27,30,33,37,43,49},
            {0,5,10,17,21,29,34,41,46,51},
            {3,8,16,32,37,41,51},
            {8,20,36,50},
            {8,20,36,50},
            {8,20,36,50},
            {8,20,36,50},
            {8,20,36,50},
            {8,20,36,50},
            {4,13,21,39,45,51},
            {2,6,6,14,21,34,38,38,47},
            {5,14,23,36,44,51},
            {5,15,25,34,48},
            {1,9,20,28,34,42,51},
            {2,12,21,33,49},
            {0,12,33,57},
            {10}};
    public static final int[][] shinbashiToOofunaH = new int[][] {
            {},
            {},
            {},
            {},
            {58},
            {27,48},
            {4,18,36,47,57},
            {15,28,38,45,48,53,58},
            {6,12,15,19,25,29,35,40,46,54,58},
            {4,15,26,39,46,53},
            {5,13,28,40,56},
            {11,26,42,56},
            {11,26,42,56},//12
            {11,26,42,56},
            {11,26,42,56},
            {11,26,42,56},
            {5,13,26,37,43,56},
            {6,16,28,40,44,56},
            {6,14,18,29,42,45,57},
            {6,14,18,29,42,45,57},
            {6,14,18,29,42,45,57},
            {3,15,27,36,42},
            {0,13,23,33,51},
            {7,25,38,53}};
//Shinbashi End

    //musashikosugi Start
    public static final int[][] musashikosugiToOofuna = new int[][] {
            {},
            {},
            {},
            {},
            {35},
            {9,37,58},
            {14,28,46,57},
            {7,25,38,48,55,58},
            {4,9,17,25,29,35,41,45,51,58},
            {4,15,28,36,52,56},
            {3,17,24,38,50},
            {6,21,37,51},
            {6,21,37,51},
            {6,21,37,51},
            {6,21,37,51},
            {6,22,37,51},
            {6,16,24,36,47,53},
            {6,17,27,39,51},
            {7,18,25,29,40,51,56},
            {8,17,27,38,43,50},
            {1,10,18,31,39,50},
            {1,13,25,37,47,54},
            {10,23,33,43},
            {0,17,35,48},
            {3}};

    public static final int[][] musashikosugiToToukyou = new int[][] {
            {},
            {},
            {},
            {},
            {39,56},
            {20,34,50},
            {3,10,20,26,39,49,54},
            {2,5,10,17,23,31,38,49,59},
            {9,19,25,28,34,42,52,56},
            {7,21,27,32,42,59},
            {11,29,41,59},
            {11,26,41,59},
            {11,29,41,59},
            {11,29,41,59},
            {11,29,41,58},
            {11,23,39,54},
            {3,11,27,36,42,57},
            {4,11,25,28,28,38,55},
            {4,13,26,33,42,55},
            {4,12,23,36,51,59},
            {10,18,24,32,39,53},
            {1,10,23,40,51},
            {2,24,48},
            {1,22}};
    public static final int[][] musashikosugiToToukyouH = new int[][] {
            {},
            {},
            {},
            {},
            {39,56},
            {19,34,52},
            {3,10,19,29,35,49,56},
            {5,20,28,36,47,57},
            {4,12,19,25,33,42,55},
            {7,21,32,42},
            {0,11,17,29,41,59},
            {11,23,30,38,59},
            {11,29,41},
            {0,11,29,41,59},
            {11,29,40,58},
            {11,23,29,41,54},
            {1,11,26,35,41,53,57},
            {4,11,23,28,28,38,59},
            {15,27,32,42,58},
            {4,17,33,45,58},
            {11,19,32,42,51},
            {2,11,25,38,51},
            {3,24,47},
            {0,22}};
    public static final int[][] musashikosugiToOofunaH = new int[][] {
            {},
            {},
            {},
            {},
            {35},
            {9,37,58},
            {15,30,47},
            {0,14,26,38,44,56},
            {1,9,18,25,34,45,55},
            {2,17,27,35,51},
            {3,17,27,39,50,53},
            {6,21,37,48},
            {6,21,37,51},
            {6,21,37,51},
            {6,20,37,51},
            {6,16,26,37,47,52},
            {6,16,24,36,48},
            {6,16,27,40,49},
            {7,14,22,28,47,56},
            {9,21,27,39,48,56},
            {11,16,24,39,48},
            {1,13,23,34,44,54},
            {10,23,23,33,43},
            {0,17,35,48},
            {3}};
//musashikosugi End

}
