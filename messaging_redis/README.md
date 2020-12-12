# Messaging with Redis

- url: <https://spring.io/guides/gs/messaging-redis/>

- messaging_redis

- Redis

  - <https://redis.io/>

  - Redis (REmote DIctionary System)

    - In Memory Dictionary

    - Key / Value store

    - 다양한 자료구조 사용

- POJO (Plain Old Java Object)

  - 객체 사용을 위해서 클래스 상속, 인터페이스 구현, 애노테이션 사용을 강제하지 않는 자바 객체

- Connection factory

  - DB Connection을 생성하는 class를 따로 만들어서 사용한다.

  - RedisConnectionFactory

  - JedisConnectionFactory

- message listener container

  - MessageListener
  
  - RedisMessageListenerContainer

- Redis template

  - StringRedisTemplate
