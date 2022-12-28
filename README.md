# Spring Boot + Databricks

Spring BootのアプリケーションからDatabricksにJDBC接続した場合の実装例。こういう構成にできないかなと思って試してみたものです。

![image](https://user-images.githubusercontent.com/633029/209817661-cef44478-14e7-43b8-a88b-c6301eb927e7.png)

ポイントになるのは起動時のパラメータに`--add-opens=java.base/java.nio=ALL-UNNAMED`を指定することでこれがないと起動できません。

