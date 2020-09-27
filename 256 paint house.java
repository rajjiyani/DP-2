class Solution {// time of O(no. of houses)
    // space constant in case for this case 
    // O(total no. of colors)
public int minCost(int[][] costs) {

if(costs== null || costs.length == 0)
return 0;
// int n_houses = costs.length ;
int lastR = costs[0][0];
int lastB = costs[0][1];
int lastG = costs[0][2];
int currR,currB,currG ;
for(int i = 1; i< costs.length ; i++ ){
currR = costs[i][0] + Math.min(lastB,lastG);
currB = costs[i][1] + Math.min(lastR,lastG);
currG = costs[i][2] + Math.min(lastR,lastB);
lastR = currR;
lastB = currB;
lastG = currG;
}
//  return Math.min(Math.min(lastR,lastB),lastG);
return Math.min(Math.min(lastR,lastB),lastG);
}
}