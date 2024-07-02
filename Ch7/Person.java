
public class Person // student의 상위 클래스
{
    private String name; //private으로 name 선언

    public Person( )
    {
        name = "No name yet"; //person 입력값 void일 경우-> no name yet
    }
    
    public Person(String initialName) //parameter로 initializeName불러와서 입력 시 name에 저장
    {
        name = initialName;
    }
    
    public void setName(String newName) // private으로 선언된 name에 접근하기 위해 setName 설정
    {
        name = newName; // 입력된 newName 불러와서 name에 저장
    }
    
    public String getName( ) //private으로 선언된 name에 접근할 수 있도록 getName 설정
    {
        return name;
    }
    
    public void writeOutput( ) // 입력받는 writeOutput 설정
    {
        System.out.println("Name: " + name);
    }
   
    public boolean hasSameName(Person otherPerson) // 같은이름인지여부 판단(boolean) Person과 otherPerson
    {
        return this.name.equalsIgnoreCase(otherPerson.name); // 대소문자 무시 equalsIgnoreCase 
        // name 과 otherPerson.name 비교하여 T/F 반환
    }
}
