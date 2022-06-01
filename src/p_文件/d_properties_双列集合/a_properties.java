package p_文件.d_properties_双列集合;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*<1> properties集合：
	1.java.util.Properties集合 extends HashTable<K,V> implements Map<K,V>
	2.Properties 类：表示一个持久的属性集，Properties可保存在流中或从流中加载。
	3.Properties集合是一个唯一和IO流相结合的集合
		*Properties.store(): 把集合中的临时数据，持久化写入到硬盘中存储
		*Properties.load() : 把硬盘中保存的文件（键值对），读取到集合中使用
	4.属性列表中每个键及其对应值都是一个字符串：
		*Properties集合是一个双列集合，key和value默认都是字符串
	5.使用Properties集合存储数据，遍历取出Properties集合中的数据
	  Properties集合的一些操作字符串的方法：
	  	1.Object setProperty(String key,String value) 调用Hash table的方法 put
	  	2.String getProperty(String key,String value) 通过key 找到value值，此方法相当于Map中的 get（key）
	  	3.Set<String> set=prop.stringPropertyNames(); 返回此属性列表中的值，其中该键及其对应的值是字符串，此方法相当于Map中的keySet()方法
	6.使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
	  	1.void store(OutputStream out,String comments)   //字节输出流，不能写入中文
	  	2.void store(Writer writer,String comments)		 //字符输出流，可以写入中文
	  	  String comments ：注释，用来解释说明，保存文件是做什么用的，不能使用中文，默认是Unicode编码，一般使用空字符串
	  	3.使用步骤：
	  		1.创建Properties集合对象，添加数据
	  		2.创建字节/字符输出流对象，构造方法中指定输出的路径
	  		3.使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
	  		4.释放资源
	7.使用Properties集合中的方法load，把硬盘中保存的文件（键值对），读取到集合中使用
		1.void load(InputStream in_stream) 字节输入流，不能读取中文
		2.void load(Reader reader)		   字符输入流，可以读取中文
		3.使用步骤：
			1.创建集合Properties集合对象
			2.使用Properties集合对象中的方法load读取保存键值对的文件
			3.遍历Properties集合
			注意：
				1.存储键值对的文件中，键与值默认的连接符可以使用=，空格（其他符号）
				2.存储键值对的文件中，可以使用#进行注释，被注释的键值对不会被读取
				3.存储键值对的文件中，键与值默认都是字符串，不在加引号
*/
public class a_properties {
    public static void main(String[] args) throws IOException {
//1.读取
    //1.创建properties对象
        Properties properties = new Properties();
    //2.调用properties的方法load,读取保存键值对的文件
        properties.load(new FileReader("src/p_文件/d_properties_双列集合/z_properties.txt"));
        //getProperty(key)  通过key直接获取值
        System.out.println("properties.getProperty(\"cat\") = " + properties.getProperty("cat"));
        //3.遍历文件
        //properties.stringPropertyNames() 返回所有键组成的集合
        Set<String> strings = properties.stringPropertyNames();
        System.out.println("strings = " + strings);
        for (String key : strings) {
            String value = properties.getProperty(key);
            System.out.println("value = " + value);
        }
//2.存储
    //1.setProperty(key,value), 添加数据
        properties.setProperty("cat", "xiao");
        properties.setProperty("dog", "wang");
        properties.setProperty("bird", "zeze1");
    //2.创建字节/字符,输出流对象,构造方法中指定文件路径
        FileWriter fw = new FileWriter("src/p_文件/d_properties_双列集合/z_properties.txt",true);
    //3.store(), 把集合中的临时数据,持久化写入到硬盘中
        properties.store(fw,"src/p_文件/d_properties_双列集合/z_properties.txt");
        fw.close();
    }
}
