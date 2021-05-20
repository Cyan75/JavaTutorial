* String
    * 상속 계층 구조 보려면 F4 누르기
      * ` String`의 부모는 `Object`
        
      * java에서 extends 쓰지 않고 compile 과정에서 상속할 수 있도록 만들어 놓음
    * 굉장히 많은 생성자 overloaded
    * str.substring(2,4): str의 3,5 번째 떼내어서 새로운 String 만듦
    * str.trim() : 앞뒤 space 잘라냄
    * str.length() : str의 길이

* `Object`는 java의 대장 class라고 할 수 있다
* class 만들면 자동으로 `Object`로부터 상속받음


* `StringBuffer`
  * String은 자신이 가진 문자열사이에 문자열 넣을 수 없음(immutable?)
  * StringBuffer는 가능


* ```int num = 10;```
  * int : standard data type
  * num : variable
  * 10 : literal

* ```String s = " flower";```
    * String :  not a standard data type
    * s : object
    * flower : literal
    

*  변수 작명법
   1. 선언시 이름 중복되면 안됨
    ```int apple  = 10;```
   2. 숫자 넣을 수 있지만 첫글자는 안됨
    ```int apple123 = 10;``` 
   3. ($_)제외한 모든 특수문자 사용 불가
      ```int app_le$ = 10;``` 
   4. 한글 사용할 수 있지만, 하지말 것.
      ```int 사과 = 10;``` 
   5. 한 단어 이상의 조합인 경우 일반적으로 단어의 첫자를 제외하고 대문자를 사용한다.
      ```int appleNumberCount = 10;```
      