1.applixationContext.xml에서 configuring이 이루어짐  
2.HelloSpringApp.java에 main 함수가 존재함  
3.Coach.java 라는 interface와 Track.Coac.java라는 클래스가 존재함  
4.MyLoggerConfig.java 로깅 메세지를 확인하기 위한 클래스임  
5.applicationContext.xml에서 로깅 메세지를 보기위한 configuration이 추가  
  
6.FortuneService라는 인터페이스가 존재함  
7.HappyFortuneService라는 클래스스가 FortuneService 인터페이스를 하드코딩으로 구현함  
8.기존 BaseballCoach.java에 injection을 하기 위해 private 변수 생성  
9.BaseballCoach의 Constructor의 파라미터로 FortuneService를 받게끔 생성  
10.받은 FortuneService인 theFortuneService를 private 변수에 할당  
11.Spring config file인 applicationContext.xml에 injection을 위한 코드 작성  

