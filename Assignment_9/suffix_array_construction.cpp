#include<bits/stdc++.h>
using namespace std;

int main(){
    cout<<"Enter a String:\n";
    string s;
    cin>>s;
    int n=s.length();
    vector<int> rank(n);
    for(int i=0;i<n;i++){
        rank[i]=s[i]-'a';
    }
    int k=1;
    while(k<=n){
        vector<vector<int>> pairs;
        for(int i=0;i<n;i++){
            int rank1=rank[i];
            int rank2=(i+k<n) ? rank[i+k] : -1;
            pairs.push_back({rank1,rank2,i});
        }
        sort(pairs.begin(),pairs.end());
        int i=0;    
        int ct=0;
        while(i<n){
            int j=i+1;
            while(j<n && pairs[j][0]==pairs[j-1][0] && pairs[j][1]==pairs[j-1][1]){
                rank[pairs[j][2]]=i;
                j++;
            }
            for(int k=i;k<j;k++)rank[pairs[k][2]]=ct;
            ct++;
            i=j;
        }
        k*=2;
    }
    
    vector<int> suffix(n);
    for(int i=0;i<n;i++){
        suffix[rank[i]]=i;
    }
    for(auto &i:suffix){
        cout<<i<<' ';
    }
    cout<<"\n";
}