# 명령어 
## pull (image 다운로드)
docker pull centos:latest

## images (image 목록 보기)
dokcer images 

## run (컨테이너 생성과 동시에 컨테이너로 접속)
docker run "REPOSITORY"
(docker run <옵션> <이미지이름 or 이미지ID> <실행할 파일>)
### 옵션
- -i (interactive) : 사용자가 입출력을 할 수 있는 상태로 한다
- -t : 가상 터미널 환경을 에뮬레이션 하겠다는 말
- -d : 컨테이너를 일반 프로세스가 아닌 데몬프로세스 형태로 실행하여 프로세스가 끝나도 유지되도록 한다
- -p : 포트포워딩 옵션

docker run -i -t docker.io/centos /bin/bash

## ps (컨테이너 확인(실행중인 image 확인))
docker ps
## 옵션
docker ps -a 
- 이전에 종료되었던 컨테이너들을 포함한 컨테이너의 목록을 확인한다

## start (종료된 컨테이너 시작)
docker start "container ID"
## attach (컨테이너에 접속하기)
docker attach "container ID"
## stop (컨테이너 종료하기)
docker stop "Container ID"
## rm (컨테이너 삭제)
docker rm "Container ID"
- 운영체제의 프로세스와 달리 컨테이너가 종료되더라도 다시 실행하면 이전 상태가 유지된다 따라서 사용하지 않는 컨테이너는
  rm 명령어를 통해 완전히 제거를 해야한다
## docker image 만들기
