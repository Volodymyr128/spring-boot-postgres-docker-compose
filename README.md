To run application:
1. mvn clean install -Dmaven.test.skip=true
2. docker-compose up

To run containers separately:
docker run --name postgres -e POSTGRES_PASSWORD=qweqwe123 -e POSTGRES_DB=springbootdb -d postgres
docker run -v /Users/volodymyr.bakhmatiuk/Desktop/redis/target:/code -p 9000:9000 --link postgres redis-client:1.0

TODO
swagger
devtools: Remote Applications & Automatic Restart