## 作业

```java

public class TestPrinter {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Printer printer1 = (Printer) context.getBean("printer1");
		printer1.print("这是打印机1的内容！");
		Printer printer2 = (Printer) context.getBean("printer2");
		printer2.print("这是打印机2的内容！");
	}
}

### 运行结果

--START PRINTING--
您使用了彩色墨水，A4纸张打印了[这是打印机1的内容！]
--PRINTED--
--START PRINTING--
您使用了黑色墨水，B5纸张打印了[这是打印机2的内容！]
--PRINTED--

```