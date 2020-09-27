class Solution {// time and space of O(nk) total coins * total amount to look
    public int change(int amount, int[] coins) {
        
        Integer [][] memo = new Integer[coins.length][amount+1];
        return helper(amount, coins, 0 , memo) ;
    }
    private int helper(int amount, int[] coins, int idx,Integer[][] memo){
        
        // base case 
        if(amount == 0) return 1;
        if(idx>= coins.length ) return 0;
        //memo (have I seen this)
        if(memo[idx][amount]!= null) return memo[idx][amount] ;
        // considering the givn coin
        int ways1 = 0;
        if(amount>= coins[idx]){
            ways1 = helper(amount - coins[idx],coins ,idx, memo);
        }
        // not taking the given coin
        int ways2 = helper(amount,coins, idx+1, memo);
        memo[idx][amount] = ways1+ ways2;
        return ways1 + ways2 ;
    }
}