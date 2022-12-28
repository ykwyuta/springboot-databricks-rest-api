# Spring Boot + Databricks

Spring BootのアプリケーションからDatabricksにJDBC接続した場合の実装例です。

ポイントになるのは起動時のパラメータに`--add-opens=java.base/java.nio=ALL-UNNAMED`を指定することでこれがないと起動できません。
