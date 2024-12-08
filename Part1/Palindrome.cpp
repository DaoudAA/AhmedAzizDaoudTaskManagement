#include <bits/stdc++.h>
using namespace std ; 

    bool isPalindrome(string s) {
        int le = s.size()-1;
        int ri = 0;
        while(le > ri){
            while(!isalnum(s[le]) && le > ri) {le--;}
            while(!isalnum(s[ri]) && le > ri) {ri++;}
            if(tolower(s[ri]) != tolower(s[le])){
                return false;}
            le--;ri++;
        }
        return true ; 
    }
int main(){
    string s;
    cin >> s;
    if (isPalindrome(s)){
        cout << "true";
    }else {
        cout << "false";
    }
    return 0;
}
