1.FortuneService라는 인터페이스가 존재함  
2.HappyFortuneService라는 클래스가 FortuneService 인터페이스를 하드코딩으로 구현함  
3.기존 BaseballCoach.java에 injection을 하기 위해 private 변수 생성  
4.BaseballCoach의 Constructor의 파라미터로 FortuneService를 받게끔 생성  
5.받은 FortuneService인 theFortuneService를 private 변수에 할당  
6.Spring config file인 applicationContext.xml에 injection을 위한 코드 작성  

