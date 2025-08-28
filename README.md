# MiniCoupang Backend

## 1. 프로젝트 개요
- 학습용 이커머스 백엔드
- Spring Boot + JPA + MySQL 기반
- Docker로 로컬 개발 환경 구성

## 2. MVP 기능
- 회원가입 / 로그인 (JWT 인증)
- 상품 등록 및 조회
- 장바구니
- 주문 생성 및 조회
- 배송 상태 변경

## 3. 기술 스택
- Java 21
- Spring Boot 3.5.5
- JPA / Hibernate
- MySQL 8
- Redis (세션/캐시)
- Docker / Docker Compose
- Gradle

## 4. 아키텍처
- 단일 모놀리식으로 시작
- 서비스 계층 / 도메인 계층 분리
- RESTful API

## 5. 일정 (예시)
| 주차 | 목표 |
|-------|-------|
| 1주차 | 프로젝트 구조 잡기, DB 설계 |
| 2주차 | 회원가입, 로그인 API 구현 |
| 3주차 | 상품 등록/조회 API 구현 |
| 4주차 | 장바구니, 주문 API 구현 |
| 5주차 | 배송 상태 변경, 통합 테스트 |

## 6. 브랜치 전략
- `main`: 안정화된 배포 브랜치
- `develop`: 개발 브랜치
- `feature/*`: 기능별 브랜치
