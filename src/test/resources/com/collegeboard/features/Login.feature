Feature: Login Feature
@Regression2
Scenario Outline: User tries to login with valid and invalid credentials
	Given the user enters a "<username>" and a "<password>" 
	#int icin sadece numara yazilir 1 gibi 12312 gibi

Examples:
|username |  password |
|papadapu | 12345     |
|canyus   | 223991    |
|kekelek  | C123456   |
|  bosluk       |  123123   |  
|kekelek  |   bosluk        |   
|canyus   | C1234567  |

