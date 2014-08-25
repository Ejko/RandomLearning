 l//detect if a text input by the user is a palindromeRecursion
String str, palindromeCheck, letter
print "Please enter text to check if palindromeRecursion: "
str = new String(System.console().readLine())
palindromeCheck = new String()

for (i = str.length() - 1; i >= 0; i--) {
    char c = str.charAt(i)
    letter = Character.toString(c)
    palindromeCheck = palindromeCheck + letter
}
if (palindromeCheck.equals(str)) {
    println "The text you entered is a palinrome Recursion"
} else {
    println "The text you entered is not a palindromeRecursion, try again"
}