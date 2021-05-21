# Collection :  CRUD위한 8가지 자료구조
   * vector (배열)
   * **LinkedList** : 범용적으로 사용되고 적당히 속도도 있으며 크게 느리지도 않음
   * Set
   * HashTable
   * collection은 forEach사용할 수 있다.
   * 배열도 마찬가지로 forEach쓸 수 있다

# 컨테이너 : 담을 수 있는 상자
  * 한가지 종류만 담을 수 있음 : int 넣으면 int t만 넣을 수 있음
    


* CTRL + SPACE 
*  java에서는 표준 타입에 관해서는 데이터 관리 안해줌. 오직 class만 관리함
*  int 와 동일하게  쓸 수 있는 class `Integer`



* 간략화된 for sentence : forEach
  ```java
  for (Integer item : mm){
       System.out.println(item + " ");   
    }
  ```
* 이렇게는 쓰지 않는다
  ```java
  for (int i = mm.size() - 1; i >= 0; i--){  
    }
  ```