# Schduling Tasks

- url: <https://spring.io/guides/gs/scheduling-tasks/>

- scheduling_tasks

- @Scheduled: 크론탭과 같이 주기적인 method의 스케줄링에 사용

  - fixedRate: 이전 작업이 수행되기 시작한 시점으로부터 고정된 시간을 설정

  - fixedDelay: 이전 작업이 끝난 시점으로부터 고정된 시간을 설정

  - cron: cron 표현식을 사용

- @EnableScheduling: background task scheduler 생성
