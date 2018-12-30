package com.Aidan;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many lines of Pascal's Triangle would you like to see?");
        int g = scanner.nextInt();
        int n = 0;

        while(n<g) {

            ArrayList<Integer> nArrayList = new ArrayList<>();

            for (int i = 0; i <= n; i++) {
                int tempCombo = (int) nCr(n, i);
                nArrayList.add(tempCombo);
            }
            System.out.println(nArrayList);
            System.out.println(" ");
            n++;
        }
    }
    static double nCr(int n, int r){
        int rfact=1, nfact=1, nrfact=1,temp1 = n-r ,temp2 = r;
        if(r>n-r)
        {
            temp1 =r;
            temp2 =n-r;
        }
        for(int i=1;i<=n;i++)
        {
            if(i<=temp2)
            {
                rfact *= i;
                nrfact *= i;
            }
            else if(i<=temp1)
            {
                nrfact *= i;
            }
            nfact *= i;
        }
        return (nfact/(double)(rfact*nrfact));
    }
}
