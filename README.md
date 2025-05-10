# Team Project - Hotel PMS (API)
이 레포지토리는 풀스택 개발 교육 과정 중 진행된 팀 프로젝트 **Hotel PMS**의 **Back-end API** 전체 소스코드를 포함하고 있으며, <br>
본인이 별도로 정리하여 업로드한 저장소입니다.
<br><br>
사용자 페이지(User Page) 및 관리자 페이지(Admin Page)는 아래 별도 레포지토리에서 확인할 수 있습니다:<br><br>
👉 [사용자 페이지 레포지토리 이동하기](https://github.com/eziquexx/jelee-hjhotel-front-user) <br>
👉 [관리자 페이지 레포지토리 이동하기](https://github.com/eziquexx/jelee-hjhotel-front-admin) <br>

<br>

## :speech_balloon: 프로젝트 소개
**Hotel PMS Back-end API**입니다.<br>
이 프로젝트는 호텔 예약 및 관리를 위한 웹 기반 시스템입니다. 사용자와 관리자를 위한 별도의 페이지를 제공하며, 예약, 결제, 객실 관리 등의 기능을 포함합니다. <br>
사용자 페이지와 관리자 페이지에 사용되는 비즈니스 로직 api를 구현했습니다.<br><br>

※ 팀 프로젝트였으며 관리자 페이지는 여러 명이 함께 개발했습니다.<br>
이 저장소에는 **본인이 맡은 작업 중심으로 정리**되어 있습니다.<br><br>
> [!CAUTION]
> 경고: 이 팀 프로젝트는 상업적인 용도가 아닙니다.

<br/>

## :walking: 프로젝트 목적
- 팀 협업 경험을 쌓고, 학원에서 배운 내용을 기반으로 **취업용 포트폴리오 프로젝트**를 완성하는 것이 목표였습니다.

<br/>

## :calendar: 개발 기간 (프로젝트 전체 일정)
2024-11-11 ~ 2024-12-31
- 11/11 ~ 11/12: 프로젝트 기획 및 주제 정하기, 요구사항 분석, 아이디어 선정, 데이터 수집
- 11/13 ~ 11/13: DB 설계를 위한 속성 정의 및 호텔 관련 레퍼런스 조사
- 11/14 ~ 11/15: 데이터 모델링 및 비즈니스 로직 구조 정리
- 11/18 ~ 12/13: 각자 담당한 비즈니스 로직 구현 (API, 사용자/관리자 페이지 UI 개발 등)
- 12/16 ~ 12/25: 기능 테스트, 버그 수정, 사용자 피드백 반영
- 12/25 ~ 12/31: 최종 발표 준비 및 프로젝트 마무리

<br/>

## :star: 팀원 (Programmers)
- **JELEE** (팀장/본인)
- Kim YH
- Lim SY
- Ahn SJ
- Gong HT
- Kim JJ

<br/>

## 🔧 주요 기여 (JELEE 본인)
- (사용자 페이지) 결제시 Pay-pal api를 사용하여 결제 비즈니스 로직 구현.
- (관리자 페이지) 결제 내역과 주문서 생성, 내역 목록 구현(pagination), 특정 결제 내역 상태 변경 비즈니스 로직 구현.
- 팀장 역할: 브랜치 병합(Merge), 일정 조율, 회의 주도

<br/>

## ✅ 프로젝트 종료 이후 개인적으로 진행한 개선 작업:
- 개인 AWS Lightsail Instance에 배포
- Docker 작업
- 결제 진행 시 몇가지 예외처리 추가
  - 예약 내역이 있는지 여부 확인
  - 예약 내역의 상태가 PENDING인지 확인
  - 결제 진행 사용자와 예약 내역 사용자와 동일한지 확인

<br/>

## :computer: 개발 환경
![Spring Tool Suite](https://img.shields.io/badge/spring%20tool%20suite-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)
![HeidiSQL](https://img.shields.io/badge/HeidiSQL-%236DB33F.svg?style=for-the-badge&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
![AWS](https://img.shields.io/badge/AWS-%23FF9900.svg?style=for-the-badge&logo=amazon-aws&logoColor=white)
- **IDE**: Spring Tool Suite 4  
- **형상관리**: Git, GitHub  
- **DB 클라이언트 툴**: HeidiSQL  
- **API 테스트 도구**: Postman  
- **배포**: Docker + AWS Lightsail

<br/>

## :clipboard: 기술 스택
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/spring%20boot-%236DB33F.svg?style=for-the-badge&logo=springboot&logoColor=white)
![Spring Security](https://img.shields.io/badge/spring%20security-%236DB33F.svg?style=for-the-badge&logo=springsecurity&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens)
![MyBatis](https://img.shields.io/badge/mybatis-%23121011.svg?style=for-the-badge&&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white)
![PayPal](https://img.shields.io/badge/PayPal-00457C?style=for-the-badge&logo=paypal&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
![AWS](https://img.shields.io/badge/AWS-%23FF9900.svg?style=for-the-badge&logo=amazon-aws&logoColor=white)
- Java 17
- Spring Boot 3.x
- Spring Security + JWT
- MyBatis
- MySQL
- PayPal REST API
- Docker
- AWS Lightsail


<br/>

## :gear: 주요 기능
- 사용자 페이지와 관리자 페이지에 사용되는 비즈니스 로직 구현
- 사용자 페이지
  - 회원가입, 로그인, SpringSecurity, JWT
  - 객실 전체 조회, 객실 상세 조회
  - 예약 조회, 예약 생성, 객실 유형별 예약 현항 조회, 예약 취소시 상태 변경, 사용자 예약 날짜 변경, 예약 취소시 상태 변경
  - 예약된 내역을 토대로 paypal 결제 생성, 주문서와 결제 내역 생성, 결제 성공시 상태 변경, 결제 취소시 상태 변경
  - 공지사항 전체 목록 조회, 공지사항 상세 조회

- 관리자 페이지
  - 회원 목록 조회
  - 날짜, 상태로 객실 목록 조회, 객실 상태 변경, 객실 타입 조회, 객실 수 조회, 객실 타입별 상세 조회, 객실 비품 추가/삭제/활성화 여부
  - 예약 상세 조회, 예약 삭제, 예약 생성, 예약 목록 조회
  - 결제 전체 목록 조회, 결제 추가/수정/삭제, 결제 상세 조회
  - 공지사항 전체 목록 조회, 공지사항 상세 보기, 

<br/>

## :label: 저작권 및 사용권 정보
- 취업 포트폴리오용 팀 프로젝트이며 상업적이 용도가 아닙니다.
