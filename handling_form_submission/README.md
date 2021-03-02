# Handling Form Submission

- url: <https://spring.io/guides/gs/handling-form-submission/>

- handling_form_submission

- greeting.html

  - th:action="@{/greeting}": endpoint /greeting으로 post 전송되도록 설정

  - th:object="${greeting}": 해당 모델의 객체명 greeting으로 설정