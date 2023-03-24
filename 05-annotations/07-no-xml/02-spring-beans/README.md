1.Full XML Config와 다르게 SportConfig.java라는 Java Configuration을 사용  
2.@ComponentScan 없이 순수 자바 코드만 이용할 수 있음  
3.SportConfig.java에 @Bean을 이용하여 Dependency 관계 있는 메소드들을 만들어줌  
4.이때 메소드명은 bean ID이며 lowercase이고 singleton 객체 생성시 파라미터로 dependency injection 가능  
  
5.sport.properties 파일을 src 디렉토리 안에 만들고 넣을 literal들을 기입  
6.Configuration 클래스에 @PropertySource("classpath:파일명") 기입
7.field injection으로 삽입할 곳에 @Value("${변수명}") 이용하여 삽입
