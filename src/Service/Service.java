package Service;

import java.math.BigDecimal;

public interface Service {
        String getName();
        String getDescription();
        BigDecimal getPrice();
        int getDurationMinutes();
    }
