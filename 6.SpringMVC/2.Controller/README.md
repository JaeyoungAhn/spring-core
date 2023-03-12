1.@Controller는 @Component의 상속을 받아 구현한 것으로 Scanning 지원  
2.@RequestMapping("경로")를 통해 Request Mapping을 할 수 있음  
3.return에서 파일명.jsp에 해당하는 view name을 리턴해서 view resolve  

4.파라미터로 HttpServletRequest 및 Model을 받아서 데이터를 핸들링 할 수 있음  
5.request.getParameter("이름")으로 데이터를 받고 model.addAttribute("저장명",저장변수) 저장
