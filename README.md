### 📄 개요
**********************
<img src="https://github.com/TrinityFForce/4Go8Go/assets/54929479/76bb6080-a4b4-4e68-b24b-59831cd87603" width="35%" height="35%"/><br>
* **프로젝트 이름** : **사고팔고**
* **프로젝트 제작기간** : 2024.03.26 ~ 2024.04.29
* **프로젝트 설명** :
  가치 책정이 어려운 품목들 (예 : 골동품,  예술 작품 등)을 대상으로 한 온라인 마켓 플레이스<br>
### 아키텍쳐
*********************
![image](https://github.com/TrinityFForce/4Go8Go/assets/54929479/f0d9cb31-411b-418c-be25-c78d215d7cd7)

### 👩🏼‍🤝‍👩🏼멤버 구성
**************
<table>
<tbody>
<tr>
<td align="center"><a href="https://github.com/KIM-TABLE-NEXT"><img src="https://avatars.githubusercontent.com/u/54929479?v=4" width="100px;" alt="김상엽"/><br /><sub><b> 김상엽 </b></sub></a><br /></td>
<td align="center"><a href="https://github.com/DragonSky2357"><img src="https://avatars.githubusercontent.com/u/38320524?v=4" width="100px;" alt="박용민"/><br /><sub><b> 박용민 </b></sub></a><br /></td>
<td align="center"><a href="https://github.com/zapzookj"><img src="https://avatars.githubusercontent.com/u/154570825?v=4" width="100px;" alt="이종원"/><br /><sub><b> 이종원 </b></sub></a><br /></td>
    </tr>
  </tbody>
</table>

* 김상엽 - 상품, 결제, CI
* 박용민 - 유저, 카테고리, FE
* 이종원 - 입찰 도메인, CD

## 🛠️ 사용 기술
**************
## **Back-end**

- WindowOS
- IntelliJ
- Java 17
- Spring Boot 3.2.4
- MySQL 8.0
- Docker 25.0.3
- Redis 7.1.0

## Infra

- AWS ECS (ALB, Fargate)
- AWS ECR
- AWS VPC (Route table, NAT gateway, Internet gateway)
- AWS RDS
- AWS ElastiCache
- AWS EventBridge
- AWS Lambda
- AWS S3
- AWS CDN
- AWS Route 53
- AWS Secrets Manager
- AWS Certificate Manager
- Github Actions
- Elastic Search
- Logstash
- Kibana
- Fluent bit

## Frontend

- React
- node.js 18
- Material UI
- Axios
- Recoil


### 🍀 주요 기술
**************

- **입찰 동시성 제어** - Redis의 싱글 스레드 특성을 활용
- **실시간 입찰가 변동** - SSE를 이용해 실시간 입찰가 변동에 대한 처리
- **서비스 성능 테스트** - Jmeter를 이용해 테스트 진행
- **상품 경매 상테 스케줄러** - EventBridge와 Lambda를 이용해 상품의 경매 상태를 변경
- **CI/CD 환경 구축** - Github Actions를 이용한 CI 테스트 환경 및 Docker를 활용한 CD 파이프라인 구축
- **결제 시스템 구축** - 토스 페이먼츠 API를 이용하여 결제 진행
- **로깅 시스템 구축** - ELK + Fluent bit를 활용한 로깅 시스템 구축

### 📐 와이어 프레임
**************
![image](https://github.com/TrinityFForce/4Go8Go/assets/54929479/9d92f2a0-702a-4ad8-bbbf-f6728b93070f)


### 🗂️ ERD (Entity Relationship Diagram)
**************
![image](https://github.com/TrinityFForce/4Go8Go/assets/54929479/e55b7378-fbb0-48cc-972b-7a3a3ea24186)

