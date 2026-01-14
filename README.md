1、nacos 创建namespase dubbo3

2、创建配置 \
2.1 : dubbo3-provider  ## yaml格式 \
配置内容：

```
server:
  port: 5656

dubbo:
  application:
    id: xdx-dubbo3-provider
    name: xdx-dubbo3-provider
    serialize-check-status: WARN
  protocol:
    id: dubbo
    name: dubbo
    host: 10.94.203.64
    port: 7788
    serialization: hessian2
  registry:
    address: nacos://${nacos.config.server-addr}
    parameters.namespace: ${nacos.config.namespace}
    register-mode: instance


dubboParams: xdx971

```
2.2 : dubbo3-provider2  ## yaml格式 \
配置内容：

```
server:
  port: 5657

dubbo:
  application:
    id: xdx-dubbo3-provider
    name: xdx-dubbo3-provider
    serialize-check-status: WARN
  protocol:
    id: dubbo
    name: dubbo
    host: 10.94.203.64
    port: 7789
    serialization: hessian2
  registry:
    address: nacos://${nacos.config.server-addr}
    parameters.namespace: ${nacos.config.namespace}
    register-mode: instance
dubboParams: xdx

```
2.3: dubbo3-consumer ## yaml格式 \
配置内容：

```
dubbo:
  application:
    id: xdx-dubbo3-consumer
    name: xdx-dubbo3-consumer
    serialize-check-status: WARN
  registry:
    address: nacos://${nacos.config.server-addr}
    parameters.namespace: ${nacos.config.namespace}

```



    