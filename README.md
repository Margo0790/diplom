Шаги развертывания тестовой среды и запуска автотестов на локальном компьютере

1) Сделать клон <a href="https://github.com/Margo0790/diplom">Дипломного проекта</a> в локальный репозиторий и открыть его в IntelliJ IDEA

2) Запустить Docker Desktop

3) В терминале IDEA запустить контейнеры с помощью команды:
docker-compose up

4) Порядок развертывания SUT для разных БД через второй терминал:
для mySQL:
java -jar .\artifacts\aqa-shop.jar --spring.datasource.url=jdbc:mysql://localhost:3306/app

для postgresgl:
java -jar .\artifacts\aqa-shop.jar --spring.datasource.url=jdbc:postgresql://localhost:5432/app

5) Открыть третий терминал и ввести команду для запуска тестов в зависимости от СУБД:
для mySQL:
./gradlew clean test "-Ddb.url=jdbc:mysql://localhost:3306/app"
для postgresgl:
./gradlew clean test "-Ddb.url=jdbc:postgresql://localhost:5432/app"

Для генерации отчета тестирования используется команда:
./gradlew allureserve

Для завершения работы allureServe используется сочетание клавиш:
Ctrl+C

Для остановки работы контейнеров используется команда:
docker-compose down
