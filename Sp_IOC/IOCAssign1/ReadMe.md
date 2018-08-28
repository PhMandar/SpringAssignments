Steps Followed : 
1. Create project using Maven Project of type jar
2. Update pom.xml using dependencies and properties
3. Create plain POJO classes
4. Create "Spring Bean Definition" type xml file. In this, bean details are mentioned.
5. Create Main class and create bean factory using XmlBeanFactory(using ClassPathResource)/XmlBeanFactory(using FileSystemResource)
    /ClassPathXmlApplicationContext(which is type casted to BeanFactory)