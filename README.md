
## RestTemplate

> @RequestBody로 List를 보내려고 하면 class를 생성해 한번 더 감싼다음에 보낸다
> ex) @RequestBody List<user> users를 보낼려하면

'''
  class UserResponse{

  private List<user> users;

  }
'''  

감싸는 클래스를 만들어준 다음

@RequestBody UserResponse users처럼 받아야한다 


PostMan에서는 

'''
{
  "users" : 
  [
    {
      "id" : 1,
      "nam" : "test1"
    },
    {
      "id" : 1,
      "nam" : "test1"
    }  
  ]

}
'''
