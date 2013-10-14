String str
print "Please enter some text: "
str=new String(System.console().readLine())
int ecounter=0

for(int i=0; i<str.length(); i++){
	char c=str.charAt(i)
	if(c=="e"){
			ecounter++
	}
}

println "The text you entered contained the letter e "+ ecounter+ " times" 