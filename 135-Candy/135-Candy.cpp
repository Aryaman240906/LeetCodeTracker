// Last updated: 11/07/2026, 00:06:01
class Solution {
public:
    int candy(vector<int>& ratings) {
        int n = ratings.size(); // this is to decide the no.of children we have based on the no.of rating given that is no.of ratings = no.of children 
        vector<int>candies(n , 1); // We want every child to have atleast 1 candy and hence we initialized the vector with 1
        for(int i=1 ; i<n ;i++){
            if(ratings[i-1]<ratings[i]){
                candies[i] = candies[i-1] + 1;
            }
        }// Basically hum pehle left to right check karenge ki kya kisi child ki rating ussey prev child ki rating se zyada hai , if yes then hum usko 1 candy extra de denge uske prev adj child ke pass jo no.of candies hai ussey 
        for(int i=n-2; i>=0 ; i--){ // n-2 isliye cuz hum n-2 and n-1 1st comparison hoga and n is the size of the vector and since cpp is 0- based indexing the nth child has an index of n-1 so had we taken i as n-1 we would have gone out of bounds in the 1st comparison made
            if(ratings[i]>ratings[i+1]){
                candies[i] = max(candies[i], candies[i+1]+1);//Similar logic iss baar right to left traverse karenge and we will ensure that in case the rating of ith child is more than that of i+1th child then it atleast has 1 more than it and if already does then we dont need to give ith 1 more candy as our purpose of fair distribution has been solved and we need to utilize min no.of candies 
            }
        }
    return accumulate(candies.begin(), candies.end(), 0); 
    //accumulate above works similar to this ==> int total = 0; for (int x : candies) total += x;
    }
};