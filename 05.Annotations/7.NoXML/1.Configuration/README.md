1.XML configuration 대신 .java로된 config file을 사용  
2.@Configuration과 @ComponentScan("package경로") <- optional 를 config file에 명시  
3.main 함수에 ClassPathXmlApplicationContext 대신 AnnotationConfigApplicationContext 사용
  
4.NoXML 도입 이전부터 @PostConstruct @PreDestroy를 이용한 Bean Lifecycle Method 사용 가능  

