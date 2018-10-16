# Rate-Limits in Zuul

Zuul 에는 4 가지 비릍인 Rate limit 접근법이 존재

- Authenticated User

인증된 사용자명 또는 'anonymous'

- Request Origin

Uses the user origin request

- URL

Uses the request path of the downstream service

- Global configuration per service:

> This one does not validate the request Origin, Authenticated User or URI
>
> To use this approach just don’t set param 'type'
