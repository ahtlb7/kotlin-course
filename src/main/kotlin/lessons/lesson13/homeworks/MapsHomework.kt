package lessons.lesson13.homeworks

fun main() {

    // 1. Среднее время выполнения теста -> values
    val executionTimes = mapOf("testLogin" to 2.5, "testCheckout" to 4.0, "testSearch" to 1.5)
    println("1. Среднее время: ${executionTimes.values.average()} сек.")

    // 2. Список всех тестовых методов -> keys
    val testMetadata = mapOf("testLogin" to "author: Ivan", "testCheckout" to "author: Oleg")
    println("2. Список тестов: ${testMetadata.keys.toList()}")

    // 3. Добавить новый тест и результат -> put
    val testResults = mutableMapOf("testLogin" to "passed")
    testResults.put("testCheckout", "failed")
    println("3. Обновленные результаты: $testResults")

    // 4. Количество успешных тестов -> count
    println("4. Успешных тестов: ${testResults.count { it.value == "passed" }}")

    // 5. Удалить запись об исправленном баге -> remove
    val bugTracker = mutableMapOf("bug_123" to "fixed", "bug_124" to "open")
    bugTracker.remove("bug_123")
    println("5. Оставшиеся баги: $bugTracker")

    // 6. Вывести сообщение о странице и статусе -> forEach
    val webResults = mapOf("https://google.com" to "200 OK", "https://bad.com" to "404 Not Found")
    println("6. Результаты веб-страниц:")
    webResults.forEach { (url, status) -> println("   $url -> $status") }

    // 7. Время ответа > порог -> filterValues
    val responseTimes = mapOf("api/v1/users" to 120, "api/v1/orders" to 350, "api/v1/auth" to 80)
    val threshold = 100
    println("7. Сервисы с временем > $threshold: ${responseTimes.filterValues { it > threshold }}")

    // 8. Статус endpoint или "не протестирован" -> getOrElse
    val apiStatuses = mapOf("/users" to "200", "/orders" to "500")
    println("8. Статус /auth: ${apiStatuses.getOrElse("/auth") { "не протестирован" }}")

    // 9. Получить значение browserType, не null -> getValue
    val testConfig = mapOf("browserType" to "chrome", "os" to "windows")
    println("9. browserType: ${testConfig.getValue("browserType")}")

    // 10. Копия неизменяемого словаря + новая версия -> plus (+)
    val appVersions = mapOf("v1.0" to "stable", "v1.1" to "beta")
    val updatedVersions = appVersions + ("v1.2" to "alpha")
    println("10. Версии ПО: $updatedVersions")

    // 11. Настройки модели или default -> getOrDefault
    val mobileSettings = mapOf("iPhone 14" to "iOS 16", "Pixel 7" to "Android 13")
    println("11. Настройки Xiaomi: ${mobileSettings.getOrDefault("Xiaomi", "стандартные настройки")}")

    // 12. Проверить код ошибки -> containsKey
    val errorsDict = mapOf("404" to "Not Found", "500" to "Internal Server Error")
    println("12. Содержит код 404: ${errorsDict.containsKey("404")}")

    // 13. Отфильтровать по версии в ключе -> filterKeys
    val testScenarios = mapOf("Test1_v1.0" to "Passed", "Test2_v1.0" to "Failed", "Test3_v2.0" to "Passed")
    val targetVersion = "v1.0"
    println("13. Тесты для $targetVersion: ${testScenarios.filterKeys { it.contains(targetVersion) }}")

    // 14. Есть ли модули с failed -> any
    val moduleResults = mapOf("Auth" to "passed", "Payment" to "failed", "Profile" to "passed")
    println("14. Есть ли упавшие модули: ${moduleResults.any { it.value == "failed" }}")

    // 15. Добавить настройки из другого словаря -> putAll
    val envSettings1 = mutableMapOf("timeout" to "30s")
    val envSettings2 = mapOf("retries" to "3", "parallel" to "true")
    envSettings1.putAll(envSettings2)
    println("15. Настройки среды: $envSettings1")

    // 16. Объединить два неизменяемых словаря -> toMutableMap
    val bugsMap1 = mapOf("bug1" to "UI glitch")
    val bugsMap2 = mapOf("bug2" to "Logic error")
    val mergedBugs = bugsMap1.toMutableMap().apply { putAll(bugsMap2) }
    println("16. Объединенные баги: $mergedBugs")

    // 17. Очистить изменяемый словарь -> clear
    val tempRunData = mutableMapOf("test1" to "temp_result")
    tempRunData.clear()
    println("17. Временные данные после очистки: $tempRunData")

    // 18. Исключить skipped -> filterNot
    val autoReport = mapOf("test1" to "passed", "test2" to "skipped", "test3" to "failed")
    println("18. Без пропущенных тестов: ${autoReport.filterNot { it.value == "skipped" }}")

    // 19. Копия словаря с удалением конфигураций -> minus (-)
    val testConfigs = mapOf("db_url" to "localhost", "api_key" to "123", "debug" to "true")
    println("19. Без api_key: ${testConfigs - listOf("api_key")}")

    // 20. Отчет "Test ID: результат" -> map
    val reportResults = mapOf("TC-001" to "Passed", "TC-002" to "Failed")
    println("20. Отчет: ${reportResults.map { "Test ID: ${it.key} -> ${it.value}" }}")

    // 21. В неизменяемый для архивации -> toMap
    val mutableArchive = mutableMapOf("test1" to "passed")
    val immutableArchive = mutableArchive.toMap()
    println("21. Неизменяемый архив: $immutableArchive")

    // 22. Числовой ID в строковый -> mapKeys
    val numericTestTimes = mapOf(101 to 1.5, 102 to 2.0)
    println("22. Строковые ID: ${numericTestTimes.mapKeys { it.key.toString() }}")

    // 23. Увеличить на 10% -> mapValues
    val perfScores = mapOf("1.0" to 200.0, "2.0" to 150.0)
    println("23. Новые оценки (+10%): ${perfScores.mapValues { it.value * 1.1 }}")

    // 24. Пуст ли словарь -> isEmpty
    val compErrors = mapOf<String, String>()
    println("24. Ошибки компиляции пусты: ${compErrors.isEmpty()}")

    // 25. Не пуст -> isNotEmpty
    val loadResults = mapOf("load_test_1" to "success")
    println("25. Нагрузочные тесты не пусты: ${loadResults.isNotEmpty()}")

    // 26. Все успешно -> all
    val autoResults = mapOf("test1" to "passed", "test2" to "passed")
    println("26. Все тесты пройдены: ${autoResults.all { it.value == "passed" }}")

    // 27. Есть тест с ошибкой -> containsValue
    val testResWithError = mapOf("test1" to "passed", "test2" to "failed")
    println("27. Есть упавший тест: ${testResWithError.containsValue("failed")}")

    // 28. Не прошли + "optional" -> entries + filter
    val serviceTests = mapOf("payment_optional" to "failed", "auth_main" to "failed", "profile_optional" to "passed")
    val failedOptional = serviceTests.entries
        .filter { it.value == "failed" && it.key.contains("optional") }
        .associate { it.key to it.value }
    println("28. Упавшие optional-тесты: $failedOptional")
}