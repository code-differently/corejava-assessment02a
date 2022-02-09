# Assessment 02a

Complete the functions in both :

* StringUtilsPart3

Make sure all unit test pass.

## reverseAndMagicLetterShift

A magic letter in this case is the middle letter in a string.

### Problem set 01

```
// Given the following String 
String input = "cat";

// The expected output would be
String expected = "tcA";


```

* input's length is a odd number so the middle letter has to be removed which is `a`
* input is then reversed and you get `tc`
* The middle letter is then Capitalized and added to the end of input and the final result is `tcA`

### Problem set 02

```
// Given the following String 
String input = "race";

// The expected output would be
String expected = "ecar";


```

* input's length is a even number so just reverse the string and return it

## shiftTheOddCharToEvenTest01
### Problem set 01

```
// Given the following String 
String input = "abcde";

// The expected output would be
String expected = "bbddf";

```

* Each letter in a string has a numerical value
* If that numerical value is odd add 1 to that value
* The letter `a` 
	* has a numberical value of 97 which is odd
	* Adding 1 to that value will make it 98 which turns that `a` to a `b`
* The letter `b`
	* has a numerical value of 98 which is even
	* so its value does not change
* The letter `c`
	* Has a numerical value of 99 which is odd
	* Adding 1 to that value will make it 100 which turns that `c` to a `d`  
* The letter `d`
	* has a numerical value of 100 which is even
	* so its value does not change
* The letter `e`
	* Has a numerical value of 101 which is odd
	* Adding 1 to that value will make it 102 which turns that `e` to a `f`    
