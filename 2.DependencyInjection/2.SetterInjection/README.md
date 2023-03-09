1.CricketCoach 클래스가 존재하고 private FortuneService가 존재함  
2.setFortuneService라는 이름의 setter 메소드를 생성하고 arg로 FortuneService 받음  
3.받은 FortuneService를 private FortuneService에 할당함  
4.applicationContext.xml에서 property 속성을 이용해 dependency injection  
5.config file에서 property 태그의 name은 setName으로 바뀌어서 사용됨  
6.SetterDemoApp.java를 새로 만들어 main에 접근  
  
7.Literal Values들을 주입하는 것도 가능함  
8.SetterDemoApp.java에서 getBean시 interface가 아닌 class를 사용한 것에 주목  
  
9.Properties File에서 Literal Value를 Injection => static(hard-coded) to dynamic  
10.sport.properties 파일을 작성하여 foo.email=이메일 형식으로 작성  
11.applicationContext.xml에서 context:property-placeholder 태그 작성  
12.${foo.email}와 같은 형식으로 사용하면 자동으로 내용을 대체해 줌  

