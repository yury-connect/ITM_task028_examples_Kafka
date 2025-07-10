
Сначала 
```bash
mvn clean package
```

потом
```bash
docker-compose up --wait
```

затем стартуем проетк в браузере http://localhost:8080

---
### Пере-собрать и запустить:

```bash
docker-compose down -v
docker-compose build
docker-compose up --wait
```
