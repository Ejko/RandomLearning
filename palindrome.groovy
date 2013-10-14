//detect if a text input by the user is a palindrome
String str, palindromeCheck, letter
print "Please enter text to check if palindrome: "
str=new String(System.console().readLine())
palindromeCheck=new String(str.substring(0, 1))

for(i=str.length(); i>0; i--) {
	char c=str.charAt(i)
	letter=Character.toString(c)
	palindromeCheck=palindromeCheck+letter
	}
	if (palindromeCheck.equals(str)) {
	print "The text you entered is a palindrome"
	}
else{
	print "The text you entered is not a palindrome, try again"
	}	