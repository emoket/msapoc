# PoC Cache

## 결과 및 시사점

어느 정도 기준을 두고 캐시를 사용해야 한다고 생각

Product용으로는 Ehcache 사용

Memcached는 HTML과 같이 상대적으로 작고 정적인 데이터를 캐싱 할 때 선호


## 참고

### What is Redis

* Redis = Remote Dictionary Server

* 휘발성이면서 영속성을 가진 key-value 저장소

* Redis는 이러한 NoSQL의 종류 중 하나

* 디스크 기반이 아닌 메모리에 데이터를 read/write하는 in-memory 솔루션

#### 영속성

레디스는 지속성을 보장하기 위해 데이터를 DISK에 저장할 수 있습니다. 서버가 내려가더라도 DISK에 저장된 데이터를 읽어서 메모리에 로딩을 합니다.

##### 저장방식

* snapshotting (RDB) 방식
  > 순간적으로 메모리에 있는 내용을 DISK에 전체를 옮겨 담는 방식

* AOF(Append On File) 방식
  > redis의 모든 write/update 연산 자체를 모두 log 파일에 기록하는 형태

![메커니즘](https://dzone.com/storage/temp/1788474-1444132453algorithm-basic.png)