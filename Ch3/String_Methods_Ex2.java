public class String_Methods_Ex2 {
    public static void main(String[] args)
    {
        String sentence = "Text processing is hard!"; // 문자열 변수 sentence에 text processing is hard!라는 문자열 할당
        int position = sentence.indexOf("hard"); 
        /*
        메서드는 문자열에서 특정 문자 또는 문자열이 처음으로 나타나는 인덱스를 반환합니다
        이 메서드는 문자열에서 특정 문자 또는 문자열을 찾을 때 사용됩니다.
        indexOf 메서드를 사용하여 sentence 문자열에서 hard 라는 부분 문자열이 처음으로 나타는 인덱스를 찾습니다.
        이 인덱스를 postion 변수에 저장합니다.
        */
        System.out.println(sentence);
        System.out.println("012345678901234567890123"); // hard가 나타내는 위치(index)를 시각적으로 표현
        System.out.println("The word \"hard\" starts at index " + position); // ""사용시 역슬래시 사용
        sentence = sentence.substring(0, position) + "easy!";
        /*
         substirng 함수는 문자열의 특정 부분을 수정하는데 사용. 
         0부터 position까지 추출하고 뒤에 easy를 붙여서 sentence 변수에 할당.
         소문자로 바꾸기전에 hard를 easy로 먼저 바꾸어준다.
         */
        sentence = sentence.toUpperCase(); // sentence에 easy로 바뀐문장이 할당되어있으므로 toUppercase
        System.out.println("The changed string is:");
        System.out.println(sentence); // Text processing is EASY로 출력.
    }


}
