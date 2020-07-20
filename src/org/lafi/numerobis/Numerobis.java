package org.lafi.numerobis;

import java.util.Scanner;

public class Numerobis {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = keyboard.nextLine();
        System.out.println("Enter last name: ");
        String lastName = keyboard.nextLine();
        keyboard.close();
        String name = firstName + lastName;
        System.out.println();
        System.out.println(firstName.toUpperCase() + " " + lastName.toUpperCase());

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int n = 0;
        int o = 0;
        int p = 0;
        int q = 0;
        int r = 0;
        int s = 0;
        int t = 0;
        int u = 0;
        int v = 0;
        int w = 0;
        int x = 0;
        int y = 0;
        int z = 0;

        for (int count = 0; count < name.length(); count++) {
            char letter = name.toLowerCase().charAt(count);
            switch (letter) {
                case 'a': {
                    a++;
                }
                break;
                case 'b': {
                    b++;
                }
                break;
                case 'c': {
                    c++;
                }
                break;
                case 'd': {
                    d++;
                }
                break;
                case 'e': {
                    e++;
                }
                break;
                case 'f': {
                    f++;
                }
                break;
                case 'g': {
                    g++;
                }
                break;
                case 'h': {
                    h++;
                }
                break;
                case 'i': {
                    i++;
                }
                break;
                case 'j': {
                    j++;
                }
                break;
                case 'k': {
                    k++;
                }
                break;
                case 'l': {
                    l++;
                }
                break;
                case 'm': {
                    m++;
                }
                break;
                case 'n': {
                    n++;
                }
                break;
                case 'o': {
                    o++;
                }
                break;
                case 'p': {
                    p++;
                }
                break;
                case 'q': {
                    q++;
                }
                break;
                case 'r': {
                    r++;
                }
                break;
                case 's': {
                    s++;
                }
                break;
                case 't': {
                    t++;
                }
                break;
                case 'u': {
                    u++;
                }
                break;
                case 'v': {
                    v++;
                }
                break;
                case 'w': {
                    w++;
                }
                break;
                case 'x': {
                    x++;
                }
                break;
                case 'y': {
                    y++;
                }
                break;
                case 'z': {
                    z++;
                }
                break;
                default:
                    System.out.println("ERROR: invalid letter symbol!");
            }
        }

        int item1 = a + j + s;
        int item2 = b + k + t;
        int item3 = c + l + u;
        int item4 = d + m + v;
        int item5 = e + n + w;
        int item6 = f + o + x;
        int item7 = g + p + y;
        int item8 = h + q + z;
        int item9 = i + r;

        String string0 = "";
        String string1 = string0 + item1;
        String string2 = string0 + item2;
        String string3 = string0 + item3;
        String string4 = string0 + item4;
        String string5 = string0 + item5;
        String string6 = string0 + item6;
        String string7 = string0 + item7;
        String string8 = string0 + item8;
        String string9 = string0 + item9;

        int[] spu = {item1, item2, item3, item4, item5, item6, item7, item8, item9};

        System.out.println("ARIMEVPDG");
        System.out.println(string1 + string2 + string3 + string4 + string5 + string6 + string7 + string8 + string9);

        int min = 0;
        int max = 0;

        for (int count = 0; count < 9; count++) {
            if (spu[count] < min) {
                min = spu[count];
            }
            if (spu[count] > max) {
                max = spu[count];
            }
        }
        boolean empty;
        for (int level = max; (level <= max) && (level >= min); level--) {
            empty = true;
            for (int item = 0; item < 9; item++) {
                if (level == spu[item]) {
                    empty = false;
                    switch (item + 1) {
                        case 1: {
                            System.out.print("A");
                        }
                        break;
                        case 2: {
                            System.out.print("R");
                        }
                        break;
                        case 3: {
                            System.out.print("I");
                        }
                        break;
                        case 4: {
                            System.out.print("M");
                        }
                        break;
                        case 5: {
                            System.out.print("E");
                        }
                        break;
                        case 6: {
                            System.out.print("V");
                        }
                        break;
                        case 7: {
                            System.out.print("P");
                        }
                        break;
                        case 8: {
                            System.out.println("D");
                        }
                        break;
                        case 9: {
                            System.out.print("G");
                        }
                        break;
                        default: {
                            System.out.println("CRITICAL ERROR");
                        }
                        break;
                    }
                }
            }
            if (empty == true) {
                System.out.print("-------");
            }
            System.out.println();
        }
    }
}
