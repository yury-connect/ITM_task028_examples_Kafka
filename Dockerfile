# Используем оптимизированный образ для production (JRE вместо JDK)
FROM eclipse-temurin:17-jre-jammy

# Создаем непривилегированного пользователя для безопасности
RUN useradd -m appuser
USER appuser

# Устанавливаем рабочую директорию
WORKDIR /app

# Копируем jar-файл (используем wildcard для независимости от версии)
COPY --chown=appuser:appuser target/*.jar app.jar

# Открываем порт приложения + порт для дебага (опционально)
EXPOSE 8080
EXPOSE 5005

# Переменные окружения для Spring Boot
ENV SPRING_PROFILES_ACTIVE=docker
ENV JAVA_OPTS="-XX:+UseContainerSupport -XX:MaxRAMPercentage=75"

# Health check для мониторинга готовности приложения
HEALTHCHECK --interval=30s --timeout=3s \
  CMD curl -f http://localhost:8080/actuator/health || exit 1

# Запускаем приложение с возможностью удаленного дебага
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]
