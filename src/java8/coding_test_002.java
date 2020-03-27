package java8;

public class coding_test_002 {

	public static void main(String[] args) {

		String dartResult = "1D2S0T";
		int answer = 0, cnt = 0;
		int[] index = new int[3];
		int[] index2 = new int[3];
		int answer1 = 0, answer2 = 0, answer3 = 0;

		//스프링을 인트형 배열로 변경
		int arr[]=new int[dartResult.length()];
		for(int i=0 ; i<dartResult.length() ; i++) {
			arr[i] = dartResult.charAt(i) - '0';
		}

		//S,D,T를 기준으로 Index를 배열에 저장
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i] == 'S'-'0' || arr[i] == 'D'-'0' || arr[i] == 'T'-'0') {
				index[cnt] = i;
				index2[cnt] = i;
				cnt++;
			}
		}

		//S,D,T 의 Index 뒤에 *,#이 있는지 확인 후 Index2 배열에 저장
		for(int i=0 ; i<3 ; i++) {

			if(index[i]+1 == arr.length) {
				break;
			}

			if(arr[index[i]+1] == '*'-'0' || arr[index[i]+1] == '#'-'0')
			{
				index2[i]++;
			}
		}

		//숫자가 10이라면 첫번재 수를 10으로 변경하고 
		//두번째 수를 -1로 바꿔 차후 조건계산에 포함 안되도록 함
		if(arr[0] == 1 && arr[1] == 0) {
			arr[0] = 10;
			arr[1] = -1;  
		}
		if(arr[index2[0]+1] == 1 && arr[index2[0]+2] == 0) {
			arr[index2[0]+1] = 10;
			arr[index2[0]+2] = -1 ;
		}
		if(arr[index2[1]+1] == 1 && arr[index2[1]+2] == 0) {
			arr[index2[1]+1] = 10;
			arr[index2[1]+2] = -1;
		}

		//S,D,T를 배수에 맞게 숫자로 변환
		for(int i=0 ; i<3 ; i++) {
			if(index[i] == index2[i] && arr[index[i]] == 'S'-'0')
				arr[index[i]] = 1;
			else if(index[i] == index2[i] && arr[index[i]] == 'D'-'0')
				arr[index[i]] = 2;
			else if(index[i] == index2[i] && arr[index[i]] == 'T'-'0')
				arr[index[i]] = 3;
			else if(index[i] != index2[i] && arr[index[i]] == 'S'-'0')
				arr[index[i]] = 1;
			else if(index[i] != index2[i] && arr[index[i]] == 'D'-'0')
				arr[index[i]] = 2;
			else if(index[i] != index2[i] && arr[index[i]] == 'T'-'0')
				arr[index[i]] = 3;
		}

		//자른부분별로 선차적 계산
		answer1 = (int)Math.pow(arr[0], arr[index[0]]);
		answer2 = (int)Math.pow(arr[index2[0]+1], arr[index[1]]);
		answer3 = (int)Math.pow(arr[index2[1]+1], arr[index[2]]);

		//*과 #이 있는 부분 처리
		for(int i=0 ; i<3 ; i++) {
			if(index[i] != index2[i]) {
				if(arr[index2[i]] == '*'-'0') {
					if (i==0) {
						answer1 = 2*answer1;
					}
					else if(i==1) {
						answer1 = 2*answer1;
						answer2 = 2*answer2;
					}

					else if (i==2) {
						answer2 = 2*answer2;
						answer3 = 2*answer3;
					}
				}

				else if(arr[index2[i]] == '#'-'0') {
					if (i==0) {
						answer1 = -answer1;
					}
					else if(i==1) {
						answer2 = -answer2;
					}

					else if (i==2) {
						answer3 = -answer3;
					}
				}
			}
		}

		// 부분적으로 계산한 답을 합함
		answer = answer1 + answer2 + answer3;

		for(int i=0 ; i<arr.length ; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
		System.out.println(answer);
	}






}
