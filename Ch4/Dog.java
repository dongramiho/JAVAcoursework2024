package Ch4;

public class Dog {
    public String name;
    public String breed;
    public int age; // classdog 타입 생성, 오브젝트안에 세개의 필드 네임 브리드 에이지 생성.
    public void writeOutput()
    {
        System.out.println("Name: "+name);
        System.out.println("Breed: "+breed);
        System.out.println("Age in calendar year: "+ age);
        System.out.println("Age in human years: " + getAgeInHumanYears());
        System.out.println();
    }
    public int getAgeInHumanYears()
    {
        int humanAge = 0;
        if (age <=2)
        {
            humanAge = age * 11;
        }
        else
        {
            humanAge = 22 + ((age-2)*5);
        }
        return humanAge;
    }
}

