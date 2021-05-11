# Java Programming Lecture Note Day1
//6 May 2021


## Java Language
* 여러분이 컴퓨터에게 명령을 내리는 겁니다.
* 그러기위해서는 언어가 필요합니다.
* 컴퓨터는 아프리카출신이고 여러분은 한국사람입니다. 명령 내리기 위해 언어라는것이 필요합니다. 서로 쌍방간의 통신을 위해.
* 컴퓨터와의 소통은 대화가 아니라 명령
* 처음으로 발을 들인곳이 Java입니다.

## History
*  태초의 은으가 있었는데 그것을 assembly 언어라고 함
*  이걸 가지고 컴퓨터 언어를 만듦
*  근데 이걸로 프로그램작성하기가 힘듦
*  사용자 0.01% 정도만 사용가능...
*  30년전 Pascal(수학), Cobol(사무), LISP(인공지능), Basic(기본) 등등 assemby를 쉽게 하자는 의도에서 만들어진 언어 1000여가지 존재: 춘추 전국시대
*  어느날(25년전) C라는 녀석 등장하여 천하통일
*  그로부터 10년 후 pascal, cobol, basic 사라지기 시작함(다들 명맥만 유지)
*  C는 나오자마자 대학교, 관공서, Wall Street 등등 모든곳에 사용, 영어에 해당
*  C를 20% 정도 업그레이드 한거 C++
*  누가 갑자기 등장: 우리 C로 Java 만들었다.
   *  1988년 Java 쓰는 프로그래밍 컨테스트 1위하면 1억줄게(한국인)
   *  이후로 갑자기 C사용자가 Java로 옮겨감 현재 C:Java = 10:90 보다 더 큰 차이


## C, Python과 Java
 * C  
   *  Assembly에서 나온 C가 Assembly멸망, C에서 나온 Java가 C멸망
   *  language옮기기가 쉽지 않음
   *  Java의 설득: tetris 만들기 C가 속도 빼고 Java에 모두 열세
      *  속도 : C 우위  Java
      *  개발시간 : C 3개월  Java 3주 우위
      *  유지보수비용 : C   Java 우위
      *  Bug: C 100개   Java 1개 우위
   * 회사 입장에서 개발기간 정말 중요한 이슈 C로 끙끙거리고 다양한 bug에 고생하는 것보다 Java를 더 좋아하게 됨
   * 속도와 관련된 System, H/W, Game 제외한 모든 분야에서 Java가 우위
   * Java의 40%가 C와 연관된 내용
   * C에서 사용되는 40%는 어려움: 메모리 관련
   * C를 그만두는 부분 pointer: Java는 없음
   * C는 없어질까요? 아니오 Java가 있는 한 C는 근본을 유지할 것입니다.
   * Java 사라지면 모든것 다 무너집니다. 최소 향후 10년간은 없어지지 않을것

* Python
  * Python이 인기 java보다 좋음. 사용자가 많다는 뜻. 더 좋다는 뜻은 아님
  * Python은 Big Data, AI 일부 분야에 특화된 언어
    * python은 중, 고급 사용자가 극히 적음.
    * 초기에 입문은 좋지만 중 고급 잘 안올라감
    * 어떤 언어건 고급으로 가면 어려움
  * 


## Java로 무엇을할 것인가
* Java는 근간이 되는 뿌리(C도 뿌리가 될 수 있습니다.)
* 줄기는 무엇일까요? 아마도 4차산업혁명의 어떠한 분야가되겠죠? 모든 분야도 갈 수 있습니다.
* 웹, 모바일 어플 등등 모든곳에 사용될 수 있음
* Java 하고 나서 바로 뭘 할 수 있는게 아님. 응용프로그램을 만들겟다 같은 목적이 있는
* 개발하는 회사가 수만개 있어도 어떤 개발을 하던 Java하면 쓸모있음
* 내가 Java하면 뭔가 할 수 있는 기초 베이스 마련한다 라고 생각하면 됨


## Setting
* terminal  `javac -version`
  * 환경설정이 안되었다는 뜻
* [Oracle](https://www.oracle.com/index.html, "Java설치")
  * Java는 최신써도 문제 없음(?)
  * Product - Software - Java - Download Java - (Java SE16) - JDK Download - 내려가면 OS에 맞는 installer 설치 - 
* [Eclipse](https://www.eclipse.org/"eclipse")
  * Download package: 개발 할 수 있는 프로그램 선택할 수 있음
  * [Eclipse IDE for Enterprise Java and Web Developers](https://www.eclipse.org/downloads/packages/release/2021-03/r/eclipse-ide-enterprise-java-and-web-developers/, "Install Package for Enterprise and Developers" )
* 시스템환경변수편집(Edit the System Environment Variables) - Advanced - Environment Virables... - 아래쪽것만 편집할거에요 - New - name: `JAVA_HOME`, value: `C:\Program Files\Java\jre1.8.0_191`
* path 편집
%JAVA_HOME%\bin

## Java에서 어떤 일이 일어나는가...(MEMORY)
* RAM: 이 기림을 확대시켜보겠습니다
  * memory를 빡쓰라고 생각하시면 털림이 없습니다
  * 3+5 계산하려면 빡쓰하나에 3, 다른빡쓰에 5를 집어넣습니다
  * 가산기(add)는 빡쓰 확인하여 값을 계산해줍니다.
* 프로그래머는 저 빢쓰하나 달라는 명령을 내릴 수 있습니다. 그러면 컴퓨터는 빡쓰 하나를 내어줍니다.
* 빡쓰가 바로 메모리입니다.
* 메모리에는 하나의 값만 넣을 수 있습니다.
* `byte`
  * 컴퓨터야 빡쓰 **하나**만 줘바라
  * 컴퓨터야 빡쓰두개 주고 하나에 숫자30 채워라: 둘중에 어느빡쓰인지 알 수 없음. -> 달라고 할때 빡쓰마다 이름붙여주어야 함 **(이름 = 변수)**


## Eclipse
* IDE(통합개발환경): Integrated Development Environment 
* create project 
  * Open Perspective - Java 선택후 Open - File - New - Java Project
  * Maven Project란?
  * src: source
    * New Class
      * 체크할 곳 3가지: package(package이름), name(대문자로 시작하는 file이름), public static void main (체크박스체크)


package pack;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Tiger");

	}

}

