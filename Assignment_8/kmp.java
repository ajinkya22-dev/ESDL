import java.util.*;
public class kmp {
    public static void LPS(String pattern,int[] lps){
        int len=0;
        lps[0]=0;
        int i=1;
        while(i<pattern.length()){
            if(pattern.charAt(i)==pattern.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0){
                    len=lps[len-1];
                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
    }

    public static void KMPSearch(String pattern,String txt){
        int m=pattern.length();
        int n=txt.length();
        int[] lps=new int[m];
        LPS(pattern,lps);
        int i=0;
        int j=0;
        int ct=0;
        while(i<n){
            if(pattern.charAt(j)==txt.charAt(i)){
                i++;
                j++;
            }
            if(j==m){
                System.out.println("Found pattern at index "+(i-j));
                ct++;
                j=lps[j-1];
            }
            else if(i<n && pattern.charAt(j)!=txt.charAt(i)){
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }
        if(ct==0){
            System.out.println("Patter not found anywhere");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String txt=sc.next();
        System.out.println("Enter pattern to search:");
        String pattern=sc.next();
        sc.close();
        KMPSearch(pattern,txt);
    }
}
