package com.msa.rpc4j.autoconfig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The type Rpc 4 j server properties.
 */
@Data
@ConfigurationProperties(prefix = "spring.rpc.server")
public class Rpc4jServerProperties {
    /**
     * 服务端端口号
     * The Port.
     */
    private int port = 8025;

    /**
     * 服务注册中心地址
     * The Registry address.
     */
    private String registryAddress = "localhost:2181";

}
