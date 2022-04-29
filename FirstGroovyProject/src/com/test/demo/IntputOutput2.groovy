package com.test.demo



//printf  - in printf we use locators. we have %s for string , %d for integers
// %.2f which will take upto two decimal places , \n for next line.

//Example#1
printf "%s | %d | %.2f \n",["Pam",10,36.34]

//Example#2 with padding - padding means adding space to the left or right side
printf "%s| %s | %d | %.2f \n",["Pam","Jim",10,36.34]
printf "%-10s | %10s | %d | %.2f \n",["Pam","roy",10,36.34] 