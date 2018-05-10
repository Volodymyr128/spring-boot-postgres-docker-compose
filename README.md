docker run --name postgres -e POSTGRES_PASSWORD=qweqwe123 -d postgres
docker exec -it <container_id> psql -U postgres
docker run -v /Users/volodymyr.bakhmatiuk/Desktop/redis/target:/code -p 9000:9000 --link postgres redis-client:1.0


TODO
swagger
devtools: Remote Applications & Automatic Restart