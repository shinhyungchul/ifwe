If we Proejct ReadMe
====================

* * * * *

### 1 . 프로젝트 명 : Ifwe

* * * * *

### 2 . 프로젝트 소개

주52시간 근무제 도입으로 인해 삶의 방식이
변화를 맞이했습니다. 그중에는 소모임 이나 동호회 관련 시장이 많이 활성화
되었고, 그와 관련된 어플리케이션들이 시중에 많이 나와 있습니다. 하지만
실제 이용자들이 사용하는 것에 불편한점이 많아 사용자 친화적인 서비스를
제공하는 사이트를 제작 하기로 하였습니다.

* * * * *

### 2 . 프로젝트 DB 구조 설계 

[ERD CLOUD - IFWE 자세히 보기](https://www.erdcloud.com/d/8hkEsyHYqqGc4RGj6)  

![ERD](./sql/ifwe_sql_erd.png)




* * * * *

### 3 . 프로젝트 환경

-   Jdk 1.8
-   SpringFrameWork 3.0
-   SQL Developer
-   Oracle 11g

* * * * *



### 4 . 프로젝트 환경 설정

#### 4 - 1 . sql 관련 설정

-   ifwe.1.0 파일 실행 
-   1. 계정 생성
-   2. 테이블 및 더미내용 전체 실행

#### 4 - 2 . SpringFrameWork ( sts ) 실행

-   Maven Folder 위치 설정 - maven 설정 확인
-   settings.xml 파일 수정! <localRepository>C:\dev\maven\repository</localRepository>
-   sts Server configue 에서 Runtime out 을 45sec -\> 120sec 로 변경

### 5 . 프로젝트 환경 설정

#### 5 - 1 . 사이트 접속 및 로그인

-   Url : http://localhost:9090/ifwe/
-   ID : test001
-   PASSWORD : test001!

* * * * *

### 6 . 프로젝트 테스트

##### 메인 화면

-   소모임 생성 - 프로젝트에 포함된 파일을 이용하여 소모임 배경 화면
    적용 가능.
-   소모임 검색 - 더미 자료 조회 가능
-   게시판 - 더미 자료 조회 가능
-   멤버십구매 - 소모임 생성시 테스트 가능
-   종 -\> 알림메세지 확인 ( 마이페이지 )
-   삼각형 버튼 클릭시 로그아웃 및 마이페이지 조회 가능
-   우측 상단 메세지 버튼 클릭시 주고 받은 메세지 확인 가능 - 친구 얼굴
    클릭시 조회됨.

##### 소모임 화면

소모임 회원

-   게시글 조회 및 작성 가능
-   우측 소모임 관련 정보 출력 - ( 소모임 카테고리별 3가지 내용 이
    제공됨 )
-   소모임 일정 조회 가능

소모임 장 ( 소모임 만든이 )

-   소모임 일정 수정 가능
-   소모임 관리 사용

* * * * *

### 주의점

-   sql trigger 생성 오류발생시 trigger 명칭 수정할 것
-   새로운 계정 생성시 핸드폰 번호는 테스트 api등록자 핸드폰번호로만
    가능 하므로 입력하여도 메세지 오지않음.(미 입력하여도 가입가능)

* * * * *

### Update 기록

-   2020-04-17 ver ifwe.1.1

* * * * *
