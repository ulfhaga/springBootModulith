package se.arbetsformedlingen.mall.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.modulith.Modulith;

/**
 * Huvudingångspunkt för Data Spring Boot Modulith-applikationen
 */
@Modulith
@SpringBootApplication
public class DataApplication {

    /**
     * Startar Spring Boot Modulith-applikationen.
     *
     * @param args kommandoradsargument
     */
    public static void main(String[] args) {
        SpringApplication.run(DataApplication.class, args);
    }

    /**
     * Utility class – förhindra instansiering.
     */
    private DataApplication() {
        // no-op
    }
}
