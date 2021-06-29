package com.mycompany.myapp.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * A Currency.
 */
public class Currency implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    @Size(min = 3)
    private String sourceCurrency;

    @NotNull
    @Size(min = 3)
    private String targetCurrency;

    @NotNull
    private BigDecimal monetary;

    public String getSourceCurrency() {
        return sourceCurrency;
    }

    public void setSourceCurrency(String sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public BigDecimal getMonetary() {
        return monetary;
    }

    public void setMonetary(BigDecimal monetary) {
        this.monetary = monetary;
    }

    @Override
    public String toString() {
        return "Currency{" +
            "sourceCurrency='" + sourceCurrency + '\'' +
            ", targetCurrency='" + targetCurrency + '\'' +
            ", monetary=" + monetary +
            '}';
    }
}
