Write REST API, that interacts with AWS S3 and provides access to files and upload history.
Entities:
User
Event (User user, File file)
File (id, location, ...)
User -> … List<Events> events ...
AWS SDK helps to interact with S3
Access level:
ADMIN - full
MODERATOR - add, delete
USER - read

Stack: Java, MySQL, Spring (IoC, Data, Sercurity), AWS SDK, MySQL, Docker, JUnit, Mockito, Gradle.
