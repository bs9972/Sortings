# Sortings
# 정렬 정의 정리
### 삽입 정렬
k번째 원소를 1부터 k-1까지와 비교해 적절한 위치에 끼워넣고 그 뒤의 자료를 한 칸씩 뒤로 밀어내는 방식으로 정렬한다.     
### 선택 정렬
1번째부터 끝까지 훑어서 가장 작은 게 1번째, 2번째부터 끝까지 훑어서 가장 작은 게 2번째……해서 (n-1)번 반복하여 정렬한다.  
### 버블 정렬
1번째와 2번째 원소를 비교하여 정렬하고, 2번째와 3번째, ..., n-1번째와 n번째를 정렬한 뒤 다시 처음으로 돌아가 이번에는 n-2번째와 n-1번째까지, ...해서 최대 n(n-1)/2번 정렬한다.  
### 퀵 정렬
찰스 앤터니 리처드 호어가 1959년에 개발한 알고리즘으로 원소 하나를 기준(피벗, pivot)으로 삼아 그보다 작은 것을 앞으로 빼내고 그 뒤에 피벗을 옮겨 피벗보다 작은 것, 큰 것으로 나눈뒤 나누어진 각각에서 다시 피벗을 잡고 정렬해서 각각의 크기가 0이나 1이 될 때까지 정렬한다.  
# 코드 원리 및 실행 결과
### 코드 원리
입력받야되는 값 : 2의 5승부터 2의 20승까지 배열   
출력해야하는 값 : 정렬 별 실행 시간   
1.먼저 2의 5승부터 2의 20승 까지 배열 생성  
2.정렬 시작 전 시스템 시간 저장   
3.정렬 시작  
4.정렬 시작 후 시스템 시간 저장  
5.두시간차이 출력  
6.랜덤하게 배열해주는 메소드를 이용해 랜덤 데이터 생성  
7.2번에서 5번 과정 재진행  
8.역 방향으로 배열해주는 메소드를 이용해 역방향 데이터 생성  
9.2번에서 5번 과정 재진행  
### 실행 결과
퀵 정렬 실행 결과  
![11](https://user-images.githubusercontent.com/101388180/166897192-0ca27333-aaf0-4169-8053-08ef25f511f5.PNG)  
버블 정렬 실행 결과  
![버블정렬](https://user-images.githubusercontent.com/101388180/166897196-6c092c4b-9781-4f30-85db-f64d8da37965.PNG)  
상입 정렬 실행 결과  
![삽입정렬](https://user-images.githubusercontent.com/101388180/166897200-2c7b0b83-6151-4033-a785-d6881ac28bc1.PNG)  
선택 정렬 실행 결과  
![선택정렬](https://user-images.githubusercontent.com/101388180/166897204-66827ea5-e4a7-4a71-aedb-149a842fabb5.PNG)  
### 10번 실행 결과에 대한 통계표  
![평균과 표준편차](https://user-images.githubusercontent.com/101388180/166904541-95ef3f12-7dc5-4fad-b2d6-fb06d9d75e42.PNG)
### 결과 그래프  
![그래프](https://user-images.githubusercontent.com/101388180/166905629-b08fa262-28ae-424f-be6a-d1b475645c75.PNG)
# 결론
자기 자신의 알고리즘 구현 실력,시간 확률 분포,메모리 크기에 따라 상황에 맞는 정렬 알고리즘을 골라 구현 해야 할듯하다. 또한 이미 정렬된 알고리즘에 대해서 시간이 걸리는 것에 의문이 들어 찾아보니 정렬 알고리즘 같은 경우 정렬 되있는 데이터도 무조건 알고리즘을 수행 한다고 한다.
