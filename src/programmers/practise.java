import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {

        List<Integer> ansList = new ArrayList<>();

        int compare = -1; //의미없는 숫자 선언(값 비교용)
        for(int i=0; i < arr.length; i++){
            //순회하면서 compare 값과 비교
            if(compare != arr[i]) {
                compare = arr[i];
                ansList.add(arr[i]); //이전값과 같지 않음으로 ansList에 추가
            }
        }

        //ansList를 배열로 변환 후 answer값 넣기
        int[] answer = new int[ansList.size()];
        for(int i=0; i < ansList.size(); i++){
            answer[i] = ansList.get(i);
        }

        return answer;
    }
}