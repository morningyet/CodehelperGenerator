### codehelper.generator 测试

*只测试了Tools-->CodeHelper--->GenDaoCode部分,*

*我的idea上显示CodeHelper--->Text Boxes, 不知道为啥, idea版本2019.3.2 x64*

#### 1  codehelper.generator 特性

-   根据Pojo 文件一键生成 Dao，Service，Xml，Sql文件。
-   Pojo文件更新后一键更新对应的Sql和mybatis xml文件。
-   提供insert，insertList，update，select，delete五种方法。
-   能够批量生成多个Pojo的对应的文件。
-   其他内容参考 [codehelper.generator官方地址]( https://github.com/zhengjunbase/codehelper.generator) 

#### 2  codehelper.generator 的使用与感受

因为这个和 **mybatis.generator** 比较相似,顺手测试了下,用法比较简单

但是和**mybatis.generator**相比,生成的dao方法比较少,

但是不需要设置数据库连接,只需要把  `codehelper.properties` 扔到工程目录下就可以,之后就点点点...

目前推荐还是 **mybatis.generator**

------

以上.

其他插件参考 [idea中常用的插件](https://blog.csdn.net/u010158540/article/details/79800758?utm_source=blogxgwz0)