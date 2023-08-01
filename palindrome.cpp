#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int n,c,r,sum=0;
	    cin>>n;
	 c=n;
	    
	    while(n>0){
	        r=n%10;
	        sum=r+(sum*10);
	        n=n/10;
	        
	    }
	    	if(c==sum){
	    cout<<"wins"<<endl;
	}
	    else{
	        cout<<"loses"<<endl;
	    }
	    
	

	}
	
	return 0;
}
