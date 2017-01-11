# Spring注解学习
原来对spring注解不是很了解，现在项目中注解太多了，好多都不知道，也不认识不得不单独拿出来学一下。
### Documented
@Documented Annotation的作用是在生成javadoc文档的时候将该Annotation也写入到文档中。
### Retention
java.lang.annotation.Retention可以在您定义Annotation型态时，指示编译器如何对待您的自定义 Annotation，预设上编译器会将Annotation资讯留在class档案中，但不被虚拟机器读取，而仅用于编译器或工具程式运行时提供资讯。
### Target
@Target说明了Annotation所修饰的对象范围：
　　　　Annotation可被用于 packages、types（类、接口、枚举、Annotation类型）、类型成员（方法、构造方法、成员变量、枚举值）、方法参数和本地变量（如循 环变量、catch参数）。
### Resource
