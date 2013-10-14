//line to column
String str
println "Please enter some text: "
str=new String(System.console().readLine())
for(int i=0; i<str.length();i++){
	char c=str.charAt(i)
	println c
	}
