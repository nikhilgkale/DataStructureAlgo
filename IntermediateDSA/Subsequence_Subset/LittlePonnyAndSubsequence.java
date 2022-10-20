package Subsequence_Subset;

import java.util.Arrays;

public class LittlePonnyAndSubsequence {

    public static void main(String[] args) {
        System.out.println("Hello World");
        
        System.out.println(solve("zxdfoxxxzsszzshhhxhhdxxodhodffxxxxshhozzofhzhdhfoddohzofdsxhddszhhofdxdsfsdszsdxzzfodzoshsdxdsfssoxsofxhszzfffozsfzxzxhsdsxdzoosdofoxdzxhozfdzfhofzhddzfsdfzhxoxohxddhxfxhszfhdsfhfxzzhozxdoshzsfszshdfxsfffxfsososxoshxszzzdzxzdhdxxosfxzxodhdhhsoxoxfxfsdxhzfzhozxzxfhdsofxzffhzzdzdsoxhfzxzzofdfffohzdfszhdhhzdzhzoooxxfhfshofddhxdhfzfhozsfzsszodzzfdfssdxxfxoszzfxdsfzxzofsofosxhsohohszxxodfhhsozshxzsfzdddhhdhfxhfszohdozzosfozxxzoxoxdshxxfsszzodfzdsohfzodzoxoosdhosfxhsxxhzozddffhdodfosdzdxxdfdxhsdszszdofzfdoszzffdshdsxsdsfosoxdzdzzfxxdhdzxzdozhsdzofhfszxoxhzhhhzzfoxsc"));  
    }

    public static String solve(String A) {

        char minChar  = 'z';
        char minChar1 = 'z';
        int idx       = 0;

        for(int i=0;i<A.length()-1;i++){
            if(A.charAt(i) < minChar){
                minChar = A.charAt(i);  
                idx = i;
            }
        }

        for(int i=idx+1;i<A.length();i++){
            if(A.charAt(i) < minChar1){
                minChar1 = A.charAt(i); 
            }
        }

        return Character.toString(minChar)+Character.toString(minChar1);
    }
}
