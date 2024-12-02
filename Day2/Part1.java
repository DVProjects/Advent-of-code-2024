import java.util.*;

public class Part1 {
  public static void main(String[] args) {
    String rawData = "74 76 78 79 76\n"
+		"38 40 43 44 44\n"
+		"1 2 4 6 8 9 13\n"
+		"65 68 70 72 75 76 81\n"
+		"89 91 92 95 93 94\n"
+		"15 17 16 18 19 17\n"
+		"46 47 45 48 51 52 52\n"
+		"77 78 79 82 79 83\n"
+		"55 58 59 57 60 61 68\n"
+		"79 82 84 84 85 86\n"
+		"23 24 25 25 23\n"
+		"23 26 27 28 31 31 31\n"
+		"42 43 43 44 48\n"
+		"72 74 74 77 82\n"
+		"85 86 87 88 89 93 94\n"
+		"48 50 51 53 57 59 62 61\n"
+		"29 32 34 38 38\n"
+		"71 73 75 78 82 85 88 92\n"
+		"1 4 7 8 12 18\n"
+		"16 17 20 25 27 30 33\n"
+		"49 52 55 62 63 66 68 67\n"
+		"69 71 74 76 78 80 85 85\n"
+		"34 36 39 42 48 49 53\n"
+		"48 51 52 55 61 67\n"
+		"55 54 57 60 61\n"
+		"34 33 34 37 39 40 43 40\n"
+		"23 20 23 24 26 29 29\n"
+		"22 21 23 26 27 30 31 35\n"
+		"79 76 78 81 82 89\n"
+		"39 38 41 38 39 42\n"
+		"47 45 48 50 51 52 50 48\n"
+		"57 55 58 59 62 60 61 61\n"
+		"94 92 89 91 92 96\n"
+		"67 66 69 70 71 72 71 78\n"
+		"41 39 42 45 45 46\n"
+		"39 38 41 41 44 41\n"
+		"21 20 22 23 26 26 29 29\n"
+		"36 35 36 39 39 43\n"
+		"60 57 58 58 63\n"
+		"12 11 13 17 18\n"
+		"49 46 47 49 52 56 53\n"
+		"30 28 29 31 32 36 36\n"
+		"81 80 82 86 89 91 95\n"
+		"60 59 63 66 71\n"
+		"71 68 69 75 76 78\n"
+		"24 22 25 27 28 30 37 35\n"
+		"6 5 12 14 17 20 20\n"
+		"56 54 60 62 66\n"
+		"82 81 88 89 94\n"
+		"52 52 54 57 60 62 64\n"
+		"3 3 4 6 9 12 10\n"
+		"89 89 92 95 97 97\n"
+		"67 67 69 72 75 78 82\n"
+		"8 8 10 12 19\n"
+		"10 10 12 13 10 11\n"
+		"59 59 60 63 61 64 65 64\n"
+		"68 68 70 71 70 70\n"
+		"31 31 30 31 33 37\n"
+		"63 63 60 63 68\n"
+		"52 52 52 55 58 60 61 64\n"
+		"34 34 37 39 42 42 43 41\n"
+		"35 35 36 39 39 40 40\n"
+		"69 69 69 72 73 74 78\n"
+		"41 41 41 43 50\n"
+		"27 27 30 33 37 40 42\n"
+		"61 61 63 65 69 67\n"
+		"3 3 5 7 11 14 14\n"
+		"58 58 60 62 64 68 69 73\n"
+		"21 21 25 26 29 35\n"
+		"76 76 79 85 88\n"
+		"49 49 50 53 55 60 58\n"
+		"79 79 84 87 87\n"
+		"63 63 64 66 67 72 74 78\n"
+		"68 68 70 72 78 81 82 87\n"
+		"43 47 49 50 53 56 59 61\n"
+		"62 66 68 70 73 74 75 72\n"
+		"21 25 26 29 31 31\n"
+		"16 20 21 23 24 27 31\n"
+		"23 27 30 31 33 40\n"
+		"42 46 47 50 47 50\n"
+		"76 80 81 83 85 84 83\n"
+		"13 17 20 23 26 27 25 25\n"
+		"8 12 9 10 13 14 15 19\n"
+		"18 22 23 26 27 29 27 34\n"
+		"42 46 46 48 49\n"
+		"52 56 59 60 60 62 64 61\n"
+		"77 81 82 82 84 84\n"
+		"76 80 80 82 86\n"
+		"53 57 60 62 63 64 64 70\n"
+		"16 20 24 27 29 32\n"
+		"51 55 57 61 63 65 62\n"
+		"82 86 90 91 91\n"
+		"61 65 66 69 73 77\n"
+		"38 42 44 48 50 53 55 62\n"
+		"13 17 19 25 27 28 31\n"
+		"32 36 41 43 41\n"
+		"63 67 68 71 77 77\n"
+		"23 27 28 31 38 40 44\n"
+		"45 49 50 55 56 58 59 64\n"
+		"71 77 78 81 83\n"
+		"26 33 35 36 37 35\n"
+		"57 64 65 66 66\n"
+		"11 16 18 20 22 24 25 29\n"
+		"35 41 44 47 48 49 50 55\n"
+		"52 59 60 57 60 63\n"
+		"51 58 57 59 61 59\n"
+		"4 10 8 9 12 13 15 15\n"
+		"27 33 35 32 33 35 39\n"
+		"20 26 25 26 27 29 31 38\n"
+		"36 41 43 44 44 47\n"
+		"48 54 57 60 61 61 63 62\n"
+		"40 46 49 50 52 52 52\n"
+		"13 20 22 22 25 29\n"
+		"45 52 52 55 61\n"
+		"73 78 79 82 85 88 92 95\n"
+		"51 57 60 61 65 67 70 67\n"
+		"6 12 16 19 20 22 23 23\n"
+		"12 18 22 25 26 30\n"
+		"56 61 65 66 72\n"
+		"25 30 33 38 41 43\n"
+		"64 70 76 79 77\n"
+		"36 41 48 49 49\n"
+		"59 64 66 68 74 77 81\n"
+		"44 51 57 59 64\n"
+		"87 86 83 82 81 78 77 80\n"
+		"55 52 51 49 49\n"
+		"46 43 41 39 38 37 33\n"
+		"33 31 28 27 26 24 22 17\n"
+		"83 80 78 77 79 76 73\n"
+		"51 49 47 46 48 46 44 46\n"
+		"56 55 52 55 52 52\n"
+		"13 10 9 12 11 7\n"
+		"36 33 31 34 27\n"
+		"77 76 75 75 73 70 68\n"
+		"93 91 91 89 88 86 83 86\n"
+		"92 89 89 86 86\n"
+		"51 48 48 46 42\n"
+		"41 38 38 37 34 29\n"
+		"51 50 48 46 42 40\n"
+		"84 83 79 78 80\n"
+		"19 16 13 11 9 5 5\n"
+		"70 67 66 62 61 57\n"
+		"73 71 70 69 68 64 58\n"
+		"93 92 91 88 81 80 78\n"
+		"56 54 52 50 45 46\n"
+		"51 48 45 43 37 37\n"
+		"82 80 74 71 67\n"
+		"59 56 54 52 50 47 40 35\n"
+		"17 20 19 18 16 13 10 7\n"
+		"74 76 73 72 69 67 65 67\n"
+		"95 96 93 92 92\n"
+		"25 28 26 23 20 17 13\n"
+		"43 45 42 40 38 32\n"
+		"91 92 93 91 88\n"
+		"41 44 42 39 38 39 42\n"
+		"41 43 42 41 42 40 40\n"
+		"63 66 68 67 63\n"
+		"65 66 64 62 64 61 59 53\n"
+		"84 85 82 82 81 78 77 75\n"
+		"23 26 25 24 24 22 23\n"
+		"30 31 29 27 25 25 25\n"
+		"31 32 31 31 29 28 26 22\n"
+		"12 15 15 13 6\n"
+		"13 14 12 9 5 2\n"
+		"10 12 10 6 8\n"
+		"61 64 62 60 58 54 51 51\n"
+		"92 93 89 86 82\n"
+		"69 70 67 66 63 59 54\n"
+		"80 81 79 77 74 68 66\n"
+		"64 67 61 59 56 58\n"
+		"65 67 60 57 56 54 52 52\n"
+		"51 52 51 49 47 40 38 34\n"
+		"51 52 51 49 43 36\n"
+		"87 87 84 82 81 78 75 73\n"
+		"37 37 36 35 33 36\n"
+		"71 71 69 68 65 63 63\n"
+		"16 16 15 13 9\n"
+		"49 49 46 44 38\n"
+		"64 64 67 65 63\n"
+		"7 7 10 8 6 3 5\n"
+		"30 30 27 24 21 19 21 21\n"
+		"57 57 56 58 56 52\n"
+		"79 79 82 79 74\n"
+		"23 23 21 19 16 16 14 13\n"
+		"91 91 91 88 87 84 83 84\n"
+		"98 98 95 94 94 94\n"
+		"93 93 91 88 88 87 83\n"
+		"32 32 31 29 29 28 22\n"
+		"33 33 31 30 28 24 23 22\n"
+		"49 49 46 43 41 37 34 35\n"
+		"65 65 61 58 58\n"
+		"56 56 55 54 50 47 45 41\n"
+		"17 17 16 12 5\n"
+		"63 63 60 59 58 51 50 47\n"
+		"48 48 43 42 41 40 37 39\n"
+		"90 90 84 83 83\n"
+		"48 48 42 40 39 35\n"
+		"50 50 47 44 41 36 34 29\n"
+		"34 30 27 24 23\n"
+		"84 80 79 78 80\n"
+		"79 75 73 71 69 67 64 64\n"
+		"16 12 11 9 8 4\n"
+		"30 26 25 23 22 21 20 15\n"
+		"13 9 11 8 7\n"
+		"26 22 21 20 19 20 21\n"
+		"27 23 25 22 20 18 18\n"
+		"37 33 31 32 29 25\n"
+		"45 41 38 37 34 32 35 28\n"
+		"56 52 50 50 48\n"
+		"19 15 13 10 10 8 11\n"
+		"18 14 14 12 12\n"
+		"81 77 76 76 72\n"
+		"81 77 77 74 68\n"
+		"43 39 38 36 32 31 28 27\n"
+		"98 94 93 89 92\n"
+		"64 60 56 53 52 51 51\n"
+		"93 89 88 85 81 77\n"
+		"31 27 23 21 18 17 16 9\n"
+		"84 80 79 77 75 69 68\n"
+		"80 76 73 68 65 68\n"
+		"97 93 86 83 81 81\n"
+		"47 43 38 36 35 34 33 29\n"
+		"69 65 63 58 53\n"
+		"37 30 27 24 22 19 16\n"
+		"95 88 85 84 83 85\n"
+		"22 17 14 11 11\n"
+		"93 88 87 86 83 81 80 76\n"
+		"86 81 80 77 76 73 66\n"
+		"96 91 89 90 89 87\n"
+		"84 77 75 78 76 73 76\n"
+		"12 7 9 7 7\n"
+		"99 94 92 94 92 90 87 83\n"
+		"32 25 23 20 17 16 17 10\n"
+		"94 89 88 88 86 84 83 80\n"
+		"56 51 51 50 49 47 46 48\n"
+		"89 84 82 80 80 77 77\n"
+		"71 64 63 63 59\n"
+		"71 64 62 62 55\n"
+		"41 35 32 29 25 22 19\n"
+		"76 69 67 65 64 60 58 60\n"
+		"50 44 43 41 40 36 36\n"
+		"43 37 33 32 28\n"
+		"33 27 23 21 18 15 14 9\n"
+		"60 53 47 46 45\n"
+		"52 45 39 37 34 35\n"
+		"20 13 10 8 3 3\n"
+		"47 40 38 32 30 28 26 22\n"
+		"72 65 58 55 50\n"
+		"9 10 11 14 17 19 17\n"
+		"47 49 51 54 57 57\n"
+		"38 40 41 43 45 49\n"
+		"39 40 41 43 44 45 52\n"
+		"18 20 18 21 24 25 27 30\n"
+		"86 89 87 88 90 93 94 91\n"
+		"85 86 88 90 88 90 93 93\n"
+		"51 53 54 56 54 58\n"
+		"27 30 28 31 32 37\n"
+		"57 60 63 63 65\n"
+		"52 54 54 56 55\n"
+		"25 27 30 30 30\n"
+		"69 70 73 74 74 76 80\n"
+		"15 16 18 18 19 21 28\n"
+		"23 24 27 31 33\n"
+		"24 27 30 34 36 37 35\n"
+		"50 52 54 56 59 63 66 66\n"
+		"78 79 83 84 87 88 92\n"
+		"17 18 20 21 25 31\n"
+		"39 42 44 51 54 56 58\n"
+		"10 13 20 23 20\n"
+		"8 9 10 15 18 18\n"
+		"49 50 56 58 60 62 65 69\n"
+		"11 14 21 22 29\n"
+		"88 87 90 93 94 96\n"
+		"90 87 88 90 87\n"
+		"48 45 47 48 48\n"
+		"37 36 39 41 42 45 46 50\n"
+		"3 1 2 3 4 10\n"
+		"77 76 75 78 81 82\n"
+		"38 35 33 34 31\n"
+		"41 38 41 44 42 42\n"
+		"13 12 10 12 16\n"
+		"19 17 14 15 16 22\n"
+		"14 12 14 15 15 18 20 22\n"
+		"29 27 30 30 31 30\n"
+		"60 57 59 59 59\n"
+		"78 76 77 80 80 82 86\n"
+		"57 54 57 57 63\n"
+		"36 35 37 40 44 46\n"
+		"42 40 41 44 48 45\n"
+		"74 72 74 77 78 82 82\n"
+		"12 11 12 16 20\n"
+		"79 77 78 81 83 86 90 95\n"
+		"39 37 43 46 48\n"
+		"53 51 57 58 59 58\n"
+		"23 20 21 26 26\n"
+		"77 74 81 84 87 91\n"
+		"66 63 69 72 79\n"
+		"27 27 30 31 33 35 36 38\n"
+		"30 30 33 34 36 38 41 40\n"
+		"56 56 57 58 58\n"
+		"75 75 76 79 83\n"
+		"33 33 34 35 38 40 42 49\n"
+		"8 8 11 14 12 14 16 18\n"
+		"36 36 39 41 42 44 42 40\n"
+		"48 48 50 51 50 52 52\n"
+		"20 20 18 19 22 25 29\n"
+		"54 54 53 56 62\n"
+		"68 68 68 70 72 74 76 78\n"
+		"22 22 22 24 25 28 27\n"
+		"93 93 93 95 95\n"
+		"70 70 70 72 74 77 79 83\n"
+		"79 79 80 82 82 83 85 92\n"
+		"52 52 56 59 61\n"
+		"1 1 4 7 10 12 16 15\n"
+		"41 41 43 47 47\n"
+		"39 39 43 44 46 48 49 53\n"
+		"38 38 41 45 50\n"
+		"71 71 72 75 81 83 84 87\n"
+		"79 79 85 87 88 86\n"
+		"29 29 31 37 37\n"
+		"41 41 43 46 48 51 57 61\n"
+		"62 62 63 65 70 71 74 79\n"
+		"39 43 46 49 50 52\n"
+		"37 41 42 45 48 47\n"
+		"4 8 9 12 14 14\n"
+		"26 30 31 34 36 37 39 43\n"
+		"1 5 7 9 12 14 15 20\n"
+		"18 22 25 27 24 26 28\n"
+		"35 39 40 42 43 41 44 43\n"
+		"69 73 71 73 74 76 76\n"
+		"6 10 12 13 12 14 16 20\n"
+		"77 81 82 81 84 89\n"
+		"37 41 41 44 46 48 49 50\n"
+		"47 51 52 53 53 56 54\n"
+		"7 11 12 13 15 15 16 16\n"
+		"51 55 56 58 61 63 63 67\n"
+		"55 59 59 60 62 64 66 71\n"
+		"47 51 52 55 57 58 62 64\n"
+		"23 27 31 32 34 36 34\n"
+		"75 79 83 84 87 87\n"
+		"20 24 25 27 31 35\n"
+		"62 66 70 72 78\n"
+		"4 8 9 11 18 20 23\n"
+		"65 69 71 76 77 79 78\n"
+		"43 47 48 53 56 57 59 59\n"
+		"36 40 43 46 51 55\n"
+		"14 18 21 24 29 34\n"
+		"44 50 51 54 56\n"
+		"1 6 9 10 11 14 13\n"
+		"24 30 31 34 37 38 41 41\n"
+		"11 18 21 22 26\n"
+		"50 56 59 60 62 68\n"
+		"21 26 25 27 30\n"
+		"37 44 41 44 41\n"
+		"61 66 67 70 68 68\n"
+		"89 94 91 92 94 95 99\n"
+		"53 60 63 61 62 68\n"
+		"8 15 16 16 17 18\n"
+		"64 70 70 73 76 75\n"
+		"74 81 81 83 83\n"
+		"10 16 19 19 22 26\n"
+		"57 63 63 64 70\n"
+		"53 59 62 63 66 70 73\n"
+		"6 13 17 19 17\n"
+		"16 22 24 28 29 31 31\n"
+		"65 70 72 76 80\n"
+		"56 63 64 67 71 73 80\n"
+		"65 72 74 76 78 84 87\n"
+		"37 42 47 49 50 48\n"
+		"63 69 72 77 78 79 79\n"
+		"67 73 76 83 87\n"
+		"59 66 68 73 79\n"
+		"35 33 32 29 31\n"
+		"29 26 25 24 22 20 20\n"
+		"53 52 51 48 44\n"
+		"42 39 37 34 33 31 26\n"
+		"14 12 9 8 5 3 4 1\n"
+		"89 87 89 88 86 88\n"
+		"50 47 48 45 42 40 39 39\n"
+		"22 20 17 20 17 13\n"
+		"86 84 87 85 82 75\n"
+		"86 84 82 81 80 80 78\n"
+		"20 19 17 15 13 10 10 13\n"
+		"14 13 12 12 12\n"
+		"85 82 82 79 77 74 71 67\n"
+		"77 74 74 72 65\n"
+		"21 18 15 12 10 6 5\n"
+		"22 20 19 17 13 10 7 9\n"
+		"61 60 57 56 52 52\n"
+		"74 72 69 65 63 60 59 55\n"
+		"74 73 71 70 66 63 61 55\n"
+		"79 78 75 68 66 65 63\n"
+		"21 19 16 13 6 7\n"
+		"91 89 82 81 78 77 74 74\n"
+		"57 55 54 52 47 43\n"
+		"82 79 78 75 68 66 60\n"
+		"79 82 80 78 76\n"
+		"89 91 90 89 88 89\n"
+		"22 23 21 20 20\n"
+		"90 92 90 89 85\n"
+		"86 89 86 85 84 79\n"
+		"80 83 85 82 80\n"
+		"59 60 58 55 57 59\n"
+		"59 60 61 59 58 57 57\n"
+		"28 30 28 29 27 23\n"
+		"5 7 5 8 1\n"
+		"12 14 14 11 9 7\n"
+		"17 20 17 17 18\n"
+		"27 30 30 27 24 24\n"
+		"24 27 26 26 24 22 18\n"
+		"21 23 21 18 15 15 8\n"
+		"33 35 31 28 27 24 21\n"
+		"60 62 58 57 58\n"
+		"9 11 8 7 5 1 1\n"
+		"51 54 50 47 43\n"
+		"61 63 60 58 56 52 50 45\n"
+		"90 91 88 81 79 78 77\n"
+		"53 56 55 48 45 48\n"
+		"31 32 31 26 24 21 18 18\n"
+		"31 34 32 25 23 19\n"
+		"17 18 11 8 3\n"
+		"95 95 93 90 87 84 81 80\n"
+		"92 92 91 89 87 85 87\n"
+		"64 64 62 61 58 58\n"
+		"14 14 11 8 6 2\n"
+		"81 81 80 78 72\n"
+		"24 24 22 20 23 20\n"
+		"73 73 70 72 70 73\n"
+		"50 50 49 46 48 48\n"
+		"28 28 26 28 24\n"
+		"81 81 84 81 75\n"
+		"91 91 89 89 87 85 82\n"
+		"32 32 32 30 28 29\n"
+		"33 33 32 29 26 26 26\n"
+		"82 82 82 81 77\n"
+		"56 56 55 52 52 50 47 42\n"
+		"29 29 25 23 22 19 16\n"
+		"55 55 52 49 45 42 44\n"
+		"85 85 81 78 78\n"
+		"19 19 16 13 9 8 5 1\n"
+		"29 29 26 24 20 19 14\n"
+		"99 99 96 90 87 84\n"
+		"27 27 21 18 15 18\n"
+		"50 50 43 40 40\n"
+		"65 65 63 62 61 56 52\n"
+		"37 37 30 29 23\n"
+		"82 78 77 76 73 72 71\n"
+		"58 54 52 51 48 47 44 47\n"
+		"29 25 22 21 18 17 15 15\n"
+		"67 63 62 61 59 56 52\n"
+		"38 34 32 29 22\n"
+		"86 82 81 79 81 80 78 76\n"
+		"49 45 46 44 46\n"
+		"94 90 92 89 88 88\n"
+		"39 35 36 35 34 31 30 26\n"
+		"84 80 77 76 79 78 76 71\n"
+		"16 12 9 9 8 5\n"
+		"57 53 51 51 52\n"
+		"26 22 22 19 16 14 13 13\n"
+		"62 58 57 57 56 53 49\n"
+		"54 50 48 45 45 42 35\n"
+		"70 66 62 60 58 55 53\n"
+		"45 41 37 36 33 32 34\n"
+		"39 35 32 28 26 23 23\n"
+		"94 90 86 83 82 79 75\n"
+		"73 69 65 63 62 55\n"
+		"98 94 93 90 83 80\n"
+		"80 76 74 73 71 66 65 66\n"
+		"75 71 68 65 58 55 55\n"
+		"21 17 15 14 9 8 5 1\n"
+		"72 68 62 59 58 56 50\n"
+		"89 83 81 79 78 77 75\n"
+		"67 60 57 54 52 50 49 51\n"
+		"74 68 67 64 61 61\n"
+		"99 94 91 90 89 85\n"
+		"68 63 62 61 60 57 54 47\n"
+		"71 65 63 60 61 58 56 53\n"
+		"43 36 33 32 33 35\n"
+		"20 15 14 16 16\n"
+		"23 18 20 18 17 13\n"
+		"32 27 24 23 26 25 19\n"
+		"69 64 64 61 60 57 54 51\n"
+		"27 20 17 17 19\n"
+		"80 75 75 72 69 66 66\n"
+		"99 92 91 90 90 89 85\n"
+		"74 68 68 65 63 56\n"
+		"64 59 56 53 52 49 45 44\n"
+		"94 89 86 84 80 83\n"
+		"34 27 23 20 19 18 18\n"
+		"41 34 32 28 27 26 24 20\n"
+		"70 65 64 63 61 57 51\n"
+		"50 43 42 40 39 34 33 32\n"
+		"79 72 67 65 66\n"
+		"76 70 68 67 62 59 59\n"
+		"19 12 7 6 2\n"
+		"35 29 26 25 18 13\n"
+		"32 30 29 28 25 25\n"
+		"65 68 70 73 75 77 80 84\n"
+		"80 80 77 80 82\n"
+		"88 90 88 86 83 80 80 76\n"
+		"70 72 75 73 74\n"
+		"14 10 9 6 4 3 2 1\n"
+		"84 85 84 82 79 79 78\n"
+		"62 60 61 63 64 63 64 66\n"
+		"85 89 91 94 94 96\n"
+		"22 22 26 27 28 28\n"
+		"46 46 44 43 39 37 32\n"
+		"43 49 50 53 52 54 58\n"
+		"65 66 65 61 56\n"
+		"31 35 41 42 39\n"
+		"32 29 26 24 21 20 16 16\n"
+		"19 14 11 10 9 5\n"
+		"16 20 23 30 30\n"
+		"1 1 3 7 10\n"
+		"24 22 20 23 20 16\n"
+		"15 14 16 19 20 21 20\n"
+		"53 53 49 48 51\n"
+		"57 57 54 51 48 50\n"
+		"89 85 85 84 80\n"
+		"57 55 50 47 46 42\n"
+		"26 29 28 25 25 23 17\n"
+		"16 18 16 11 10\n"
+		"6 13 13 16 21\n"
+		"88 88 90 91 93 93 95 92\n"
+		"20 16 13 11 7\n"
+		"26 33 35 36 37 40 39\n"
+		"30 25 23 21 19 17 19 13\n"
+		"26 26 29 32 33 40 42 46\n"
+		"69 63 59 57 55 50\n"
+		"90 93 90 89 86 86\n"
+		"74 78 81 84 88\n"
+		"39 40 40 42 46\n"
+		"87 84 84 83 81 79\n"
+		"77 72 68 65 64 62\n"
+		"41 41 39 42 44\n"
+		"82 82 85 92 98\n"
+		"11 11 8 6 4 4\n"
+		"89 83 82 84 83 80\n"
+		"5 3 7 8 11 8\n"
+		"36 41 44 44 48\n"
+		"26 19 17 15 13 12 10 7\n"
+		"52 49 50 49 48 47\n"
+		"26 32 32 33 33\n"
+		"38 42 45 46 46 46\n"
+		"66 69 66 63 64\n"
+		"37 42 43 44 47 48 51\n"
+		"75 75 73 70 66 62\n"
+		"97 93 86 85 85\n"
+		"63 63 66 69 71 73 75 82\n"
+		"20 16 15 13 13\n"
+		"77 77 76 73 73 71 70\n"
+		"12 16 17 15 16 21\n"
+		"68 65 58 57 57\n"
+		"56 56 60 63 60\n"
+		"16 16 19 16 14 13 10 7\n"
+		"59 55 54 50 53\n"
+		"43 39 33 31 30\n"
+		"79 80 78 78 79\n"
+		"49 47 46 44 41 41 41\n"
+		"23 25 23 21 20 17 19 19\n"
+		"28 35 38 41 42 42 44\n"
+		"56 60 62 60 64\n"
+		"18 18 20 19 19\n"
+		"75 74 78 79 80 83 83\n"
+		"58 55 53 47 44 45\n"
+		"24 24 23 21 17 16 16\n"
+		"27 20 19 15 12 11 8 9\n"
+		"59 56 53 51 49 47 43 39\n"
+		"64 64 62 61 54 52 55\n"
+		"66 66 71 74 75 77 78 75\n"
+		"77 77 76 69 66 64 57\n"
+		"30 28 29 32 38 40\n"
+		"72 71 72 73 75 76 77 77\n"
+		"81 80 83 81 83\n"
+		"40 40 39 37 36 35 34 32\n"
+		"52 52 55 54 56 59 65\n"
+		"18 15 18 19 21 28\n"
+		"48 46 49 47 48 48\n"
+		"51 47 45 43 45\n"
+		"16 19 19 20 22 25 27 29\n"
+		"8 12 11 14 17 20\n"
+		"77 82 85 86 85 88 94\n"
+		"47 44 49 52 53 57\n"
+		"64 60 55 53 46\n"
+		"93 92 89 87 85 81 79 80\n"
+		"95 92 93 96 94 97 95\n"
+		"93 91 91 90 86\n"
+		"21 15 13 11 12 14\n"
+		"25 26 25 22 21 18 14\n"
+		"41 41 39 38 33 29\n"
+		"18 22 26 29 27\n"
+		"88 86 89 91 91 98\n"
+		"55 55 55 53 51 49 49\n"
+		"32 35 32 33 30\n"
+		"61 60 60 57 56 51\n"
+		"12 11 14 13 15 19\n"
+		"68 64 64 62 61 61\n"
+		"20 27 30 36 39 41\n"
+		"17 17 19 23 24 26 33\n"
+		"51 49 50 51 55 56 60\n"
+		"21 16 15 12 11 8 11\n"
+		"36 35 38 43 44 44\n"
+		"18 18 20 26 26\n"
+		"24 29 31 34 34 36 33\n"
+		"75 76 74 72 71 71 71\n"
+		"88 88 87 85 80 78\n"
+		"74 73 72 68 67 65 64 57\n"
+		"74 67 67 64 63 58\n"
+		"71 70 73 74 77\n"
+		"69 63 60 57 55 50\n"
+		"3 5 11 12 14 19\n"
+		"64 68 70 71 69\n"
+		"40 36 35 38 36 34\n"
+		"38 39 35 32 31 30 27 24\n"
+		"59 58 60 63 67 68 75\n"
+		"80 78 77 76 77 77\n"
+		"72 79 81 82 84 90 92 91\n"
+		"46 39 39 37 38\n"
+		"10 17 18 19 21 21\n"
+		"67 73 74 73 74 72\n"
+		"57 57 55 58 54\n"
+		"57 59 61 61 63 66 65\n"
+		"6 10 10 11 14 19\n"
+		"6 7 10 11 15 16 19 19\n"
+		"60 62 63 66 73\n"
+		"26 19 19 16 14 14\n"
+		"28 32 39 42 44 46\n"
+		"78 84 85 92 96\n"
+		"52 52 56 58 60 64\n"
+		"46 44 50 53 59\n"
+		"56 52 49 47 46 42 39 36\n"
+		"32 32 34 35 36 38 41 38\n"
+		"38 32 29 23 21\n"
+		"70 71 76 79 80 82 83 87\n"
+		"40 36 35 32 34 31 32\n"
+		"51 57 60 64 65 67 70\n"
+		"31 31 32 33 32 33 33\n"
+		"37 38 36 30 26\n"
+		"71 67 65 60 58 55 51\n"
+		"84 80 80 77 74 75\n"
+		"32 38 35 36 39 42\n"
+		"60 60 62 63 63 66 73\n"
+		"42 42 43 46 49\n"
+		"58 59 56 53 52 50 47\n"
+		"67 67 64 58 56 53 52 52\n"
+		"42 48 50 54 58\n"
+		"80 83 78 77 76 75 73 67\n"
+		"77 78 74 71 72\n"
+		"48 50 52 54 61 63 65 66\n"
+		"46 50 51 54 54 56 54\n"
+		"20 24 25 28 31 38\n"
+		"46 48 49 50 53 53\n"
+		"21 18 20 21 25 26 29\n"
+		"54 60 64 67 69 71 71\n"
+		"67 60 53 51 50 49 48 48\n"
+		"44 45 45 46 47 48 50 57\n"
+		"55 58 61 61 62 64 65 65\n"
+		"49 48 48 51 52 54 55 59\n"
+		"38 34 32 28 24\n"
+		"78 82 85 87 89 92 94 95\n"
+		"35 31 29 28 31 27\n"
+		"71 72 73 70 70\n"
+		"54 50 46 44 43 37\n"
+		"29 22 17 16 17\n"
+		"58 59 60 64 67 71\n"
+		"21 25 26 27 27\n"
+		"19 23 25 28 29 26 29 27\n"
+		"77 77 79 81 81 82 82\n"
+		"34 34 32 29 27 25 21 20\n"
+		"22 29 31 33 36 34 37 37\n"
+		"14 20 23 26 33\n"
+		"40 37 34 30 29\n"
+		"85 89 91 90 92 92\n"
+		"65 64 67 68 70 72 73 77\n"
+		"63 63 66 71 72 73\n"
+		"15 13 16 16 19 22\n"
+		"11 13 9 7 7\n"
+		"88 88 88 89 90 93 94\n"
+		"89 89 88 88 86 85 84 87\n"
+		"2 1 2 3 3 5 5\n"
+		"61 63 70 72 73 73\n"
+		"53 48 47 50 48 47 46 42\n"
+		"37 41 44 48 53\n"
+		"47 50 48 44 43 40 36\n"
+		"19 24 25 31 37\n"
+		"70 70 69 67 65 65 61\n"
+		"38 44 45 48 54 57 58 58\n"
+		"54 49 46 44 42 38 38\n"
+		"81 82 84 86 91 92 91\n"
+		"15 13 12 10 9 6 2\n"
+		"51 56 59 60 61 65\n"
+		"44 45 44 41 34\n"
+		"75 77 74 75 77 76\n"
+		"51 45 44 41 39 37 37\n"
+		"19 23 27 29 30 30\n"
+		"89 85 83 81 80 79 73\n"
+		"18 19 12 10 9 7 5 6\n"
+		"41 40 34 32 29 28\n"
+		"88 84 80 78 77 76 76\n"
+		"86 89 86 85 83 85 83 79\n"
+		"43 43 44 43 44 45 48 52\n"
+		"74 68 62 61 60 57 55 49\n"
+		"60 60 63 63 67\n"
+		"13 17 19 21 27 31\n"
+		"41 41 39 39 36 29\n"
+		"85 85 82 79 72\n"
+		"61 59 57 54 53 55\n"
+		"59 55 54 54 53 50\n"
+		"80 79 79 77 74 76\n"
+		"24 21 23 29 28\n"
+		"1 7 8 10 14 13\n"
+		"95 95 94 97 94 89\n"
+		"79 77 75 74 67 64 58\n"
+		"5 6 8 5 7 8 10 16\n"
+		"44 41 39 37 36 35 28\n"
+		"64 67 71 74 75 78 77\n"
+		"49 49 48 47 45 42 38\n"
+		"63 59 58 58 56 51\n"
+		"26 26 25 28 30 29\n"
+		"77 77 79 82 82\n"
+		"11 18 19 23 30\n"
+		"17 14 11 13 8\n"
+		"98 92 91 90 87 85 81 77\n"
+		"65 62 65 63 65 72\n"
+		"11 15 16 21 28\n"
+		"95 93 95 95 96 98 97\n"
+		"87 80 79 76 75 75 72\n"
+		"66 67 66 59 58 55 55\n"
+		"24 19 13 10 9 6 5 1\n"
+		"4 8 8 11 15\n"
+		"72 73 76 74 73 68\n"
+		"95 91 89 87 90 90\n"
+		"1 2 5 3 4 7\n"
+		"60 55 52 52 49 45\n"
+		"62 55 54 51 52 52\n"
+		"7 11 13 15 17 21 25\n"
+		"2 4 5 7 11 12 14\n"
+		"60 62 63 64 67 68 72 79\n"
+		"8 8 9 10 11 13 17\n"
+		"83 79 77 78 75 70\n"
+		"73 69 62 61 59 57 60\n"
+		"75 77 80 83 82\n"
+		"47 50 51 52 51 55\n"
+		"95 93 91 89 86 85 84 81\n"
+		"96 95 92 91 88 85 82\n"
+		"14 15 16 17 20 21 23\n"
+		"3 4 7 8 10 11 13 15\n"
+		"43 45 48 51 53 56 59 62\n"
+		"67 66 65 64 63 62\n"
+		"34 31 30 28 25\n"
+		"64 61 60 59 58 56 55\n"
+		"2 5 8 9 11 13 15\n"
+		"48 51 52 54 55 58 60 61\n"
+		"33 34 35 36 38\n"
+		"12 14 17 20 23 24 25\n"
+		"4 7 9 11 13 16 19 22\n"
+		"34 32 31 28 26 24 21 19\n"
+		"58 57 56 55 54 53\n"
+		"72 73 76 78 81 84 85\n"
+		"66 68 70 73 75 76 79\n"
+		"40 42 44 46 47\n"
+		"13 15 18 21 22 25\n"
+		"49 51 52 55 56 57\n"
+		"49 50 52 53 54 57 59\n"
+		"24 27 28 30 31\n"
+		"4 5 7 10 12 13 14 15\n"
+		"59 58 56 55 54\n"
+		"18 16 14 13 12\n"
+		"1 4 6 9 12 15 16\n"
+		"66 64 63 62 59 57 54 53\n"
+		"90 88 86 85 83 82 80\n"
+		"67 70 72 74 76 79 82 85\n"
+		"57 56 54 52 49 48\n"
+		"11 14 16 18 20 23 25\n"
+		"50 53 55 57 59 62 64\n"
+		"77 78 81 82 84 86\n"
+		"67 70 72 74 76 79 81 84\n"
+		"70 69 67 65 64 62 60 58\n"
+		"6 9 12 14 17 18 21 23\n"
+		"72 74 76 77 78 81 83 86\n"
+		"43 40 39 36 34 32 29\n"
+		"49 47 46 44 43 40\n"
+		"65 62 60 57 56\n"
+		"71 73 76 79 80\n"
+		"74 71 69 68 66\n"
+		"21 22 25 28 31\n"
+		"85 84 82 81 78\n"
+		"42 44 46 47 48 50 51 54\n"
+		"54 53 51 50 48 47 44 42\n"
+		"95 92 90 89 86\n"
+		"80 81 82 84 85 86\n"
+		"59 58 55 54 51\n"
+		"58 57 56 55 52\n"
+		"32 35 36 38 41\n"
+		"30 28 26 23 22 19\n"
+		"36 33 31 30 29 26 25 23\n"
+		"53 55 56 58 59 61 62\n"
+		"40 42 44 47 49\n"
+		"49 52 54 57 58\n"
+		"71 74 77 78 81 83\n"
+		"18 16 14 12 10 8 7 4\n"
+		"28 31 34 37 38 41\n"
+		"5 8 11 14 16 19\n"
+		"10 13 16 19 22 24\n"
+		"77 79 82 83 85 86 88 90\n"
+		"49 46 43 40 38 37\n"
+		"7 8 10 12 13 15 18 19\n"
+		"69 70 71 72 73 76\n"
+		"52 51 48 47 45 42 40 39\n"
+		"19 21 23 24 27\n"
+		"47 44 42 39 36 34\n"
+		"35 36 37 38 40 42 44 46\n"
+		"70 73 75 78 79 82 84 85\n"
+		"33 34 35 36 39 40 42\n"
+		"71 73 76 78 80 83 85\n"
+		"77 75 74 73 71 68\n"
+		"84 82 81 78 76 75\n"
+		"32 31 29 28 26 23 22\n"
+		"34 31 30 28 26\n"
+		"83 82 81 80 77 74 72\n"
+		"81 79 78 77 75 74 71\n"
+		"9 12 14 16 18 19 21\n"
+		"30 29 28 25 24\n"
+		"46 47 48 50 52 54 57 59\n"
+		"27 25 22 19 16 14\n"
+		"50 48 47 44 42\n"
+		"27 24 22 21 19 18 17 15\n"
+		"24 25 27 30 32 35\n"
+		"54 57 59 62 65 67 69\n"
+		"90 88 85 83 82 81 79 76\n"
+		"52 50 47 44 43 42 40 39\n"
+		"53 56 59 61 63 65 68 70\n"
+		"75 74 72 70 69\n"
+		"71 74 75 77 78 79 82\n"
+		"11 14 15 17 20 22 25 26\n"
+		"23 21 19 17 16 14 12\n"
+		"83 84 86 89 92 93\n"
+		"83 80 78 77 74 71 68 67\n"
+		"51 52 55 57 60 63 64 66\n"
+		"60 62 64 65 68\n"
+		"70 68 65 63 62 60 58\n"
+		"82 83 85 86 89 90 92 93\n"
+		"62 65 68 70 72 75 76 79\n"
+		"55 57 60 63 66 67 70 71\n"
+		"23 26 29 31 34 35 36\n"
+		"46 48 49 52 53 56\n"
+		"44 41 38 35 33 31 28\n"
+		"74 75 77 80 82 83\n"
+		"27 30 32 33 36 39 40 43\n"
+		"39 42 43 46 49 52 55 58\n"
+		"29 27 25 22 19\n"
+		"31 34 35 38 39 40\n"
+		"57 56 53 51 50 47\n"
+		"36 34 33 31 29\n"
+		"76 77 78 79 80 83 84 86\n"
+		"69 70 73 76 79 82 84\n"
+		"84 87 90 92 93 94\n"
+		"79 78 77 74 71 68 67\n"
+		"50 51 53 55 57 60\n"
+		"43 46 49 52 53\n"
+		"87 86 84 83 82 79 76 74\n"
+		"18 15 12 11 8 7 6 4\n"
+		"87 85 84 83 82\n"
+		"30 33 35 38 39\n"
+		"76 74 72 71 68 67 64\n"
+		"56 57 59 62 63 65\n"
+		"47 49 52 53 55 56 58 61\n"
+		"63 66 67 69 70\n"
+		"51 52 54 56 58 61\n"
+		"73 75 78 81 82 84 86 89\n"
+		"50 51 54 57 58 60 62\n"
+		"92 89 86 84 82 79\n"
+		"45 48 51 54 57 60\n"
+		"9 12 13 15 17 18\n"
+		"13 12 9 6 5 4 2 1\n"
+		"26 24 22 21 18\n"
+		"57 59 61 64 67\n"
+		"2 5 7 9 10 12\n"
+		"11 10 8 7 6 3\n"
+		"45 46 48 51 53 55 56 57\n"
+		"27 28 30 33 35 36 37\n"
+		"23 22 21 18 15 13 10\n"
+		"72 74 75 78 81 84 86 89\n"
+		"38 40 42 45 47\n"
+		"1 4 7 8 10 11 14 16\n"
+		"71 73 74 75 78 80 83 85\n"
+		"16 19 20 23 26 29\n"
+		"65 64 62 61 60 59 58 56\n"
+		"51 49 48 45 44 42 41\n"
+		"80 81 84 87 88 90 93\n"
+		"37 35 34 32 31 29\n"
+		"89 90 91 93 94 95 96\n"
+		"62 64 66 69 70 72 75 78\n"
+		"85 86 89 90 91 93\n"
+		"54 52 50 47 44 42 41 39\n"
+		"79 80 81 83 84 86 89\n"
+		"15 18 21 22 25 27 30 31\n"
+		"68 65 64 62 60 58\n"
+		"80 81 83 84 85 87 90\n"
+		"53 54 55 57 58\n"
+		"20 21 24 25 28 30 33 35\n"
+		"78 79 82 85 86\n"
+		"12 15 17 19 21 24 26\n"
+		"36 33 32 30 28 26 25\n"
+		"68 70 73 75 78 81 82\n"
+		"33 32 30 27 24 23 20\n"
+		"32 31 30 29 26\n"
+		"82 79 76 75 74 72 71\n"
+		"37 34 31 28 25 24\n"
+		"55 58 59 62 64 65 68 69\n"
+		"27 28 31 33 36 38 41\n"
+		"60 59 58 56 55 53 52\n"
+		"81 78 76 74 72 69\n"
+		"72 70 68 65 64 63 60\n"
+		"43 41 40 37 34 31\n"
+		"66 69 70 73 76\n"
+		"24 25 28 31 32 34\n"
+		"69 70 72 75 78 81\n"
+		"26 27 29 31 33 34\n"
+		"7 8 10 12 15 16\n"
+		"61 64 65 66 67 68 71\n"
+		"65 62 60 58 57 55\n"
+		"15 18 21 23 24 26 28 31\n"
+		"89 90 92 93 94 96 97\n"
+		"17 20 22 24 27\n"
+		"45 44 41 39 37\n"
+		"53 55 58 60 62 64\n"
+		"18 17 16 15 14 11 9\n"
+		"60 61 64 66 69 72\n"
+		"90 88 87 86 84 81 79 77\n"
+		"49 52 53 56 58 61 63\n"
+		"84 82 81 80 78 76\n"
+		"15 13 12 11 9 8 5\n"
+		"11 13 15 17 19 22 24 27\n"
+		"85 82 80 77 75 72 70\n"
+		"51 54 57 59 62 65\n"
+		"86 83 82 81 79 78 77\n"
+		"25 22 20 18 16\n"
+		"69 67 64 61 58 55 52\n"
+		"61 59 58 57 55\n"
+		"97 95 94 91 88 85 84 83\n"
+		"73 72 69 68 65 62\n"
+		"56 58 61 62 63 64 65 67\n"
+		"31 34 36 37 39 41\n"
+		"95 94 91 89 88 87\n"
+		"71 72 73 76 77 79 82 85\n"
+		"44 47 49 52 55\n"
+		"69 70 72 75 77\n"
+		"65 68 69 72 75 77 79\n"
+		"33 32 29 28 27 26\n"
+		"78 77 75 73 71 70 69 68\n"
+		"44 46 48 49 52 53 54\n"
+		"56 53 51 48 47 46\n"
+		"50 52 53 55 58 60 63 66\n"
+		"35 36 37 40 43 46 48 51\n"
+		"32 35 37 39 42\n"
+		"17 14 13 10 7 6\n"
+		"50 53 55 57 58 59 60 63\n"
+		"26 29 32 33 35\n"
+		"62 63 65 66 67 70 72 73\n"
+		"65 66 69 72 73 75\n"
+		"41 39 37 36 35 34 32 29\n"
+		"77 74 72 70 67 66 65 62\n"
+		"89 91 92 95 96 98 99\n"
+		"21 19 17 15 13 10\n"
+		"75 78 79 80 83 85 88 91\n"
+		"12 13 14 15 17 18 19 22\n"
+		"23 20 19 17 14\n"
+		"55 52 49 47 45 44\n"
+		"33 30 29 27 24 22 20\n"
+		"92 91 90 87 84 81 78\n"
+		"54 55 58 61 64 66 69 71\n"
+		"66 68 70 72 75 77\n"
+		"37 34 31 28 26\n"
+		"74 76 79 81 82 85\n"
+		"39 36 35 32 31 29 26 25\n"
+		"55 54 51 48 46 45\n"
+		"20 19 17 14 12 9\n"
+		"71 70 69 66 64\n"
+		"11 9 6 5 4 2 1\n"
+		"66 63 62 59 57 55 54\n"
+		"59 56 53 52 49 46 43 42\n"
+		"66 67 70 71 74 76 79\n"
+		"23 22 21 20 18 17\n"
+		"86 83 81 78 77 75\n"
+		"38 39 40 41 42\n"
+		"42 41 39 37 34\n"
+		"62 60 58 56 54\n"
+		"92 91 89 86 84 83 81\n"
+		"31 33 36 37 40 42 43 44\n"
+		"35 32 31 28 26 25\n"
+		"62 61 60 59 57 56 53\n"
+		"65 64 62 61 60 57 55\n"
+		"78 76 75 73 71\n"
+		"95 94 92 89 88 86\n"
+		"54 51 50 47 46 44 43\n"
+		"58 61 62 65 67 70 73\n"
+		"40 37 34 33 32 31\n"
+		"47 50 53 54 57 58 60 61\n"
+		"59 58 55 53 52\n";
    String[] reports = rawData.split("\n");
    int safeReports = 0;
    for (String report : reports) {
      String[] levels = report.split(" ");
      boolean safe = true;
      boolean levelsIncreasing = Integer.parseInt(levels[0]) < Integer.parseInt(levels[1]);
      for (int i = 0; i < levels.length -1; i++) {
        int level1 = Integer.parseInt(levels[i]);
        int level2 =  Integer.parseInt(levels[i +1]);
        if ((level1 > level2 && levelsIncreasing) || (level1 < level2 && !levelsIncreasing) ||
            level1 - level2 > 3 || level2 - level1 > 3 || level1 == level2) safe = false;
      }
      if (safe) safeReports++;
    }
    System.out.println("Safe reports: " + safeReports);
  }
}
