package com.mycompany.myapp.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public class CurrenciesAPI implements Serializable {

        @JsonProperty("success")
        private Boolean success;
        @JsonProperty("timestamp")
        private Integer timestamp;
        @JsonProperty("base")
        private String base;
        @JsonProperty("date")
        private String date;
        @JsonProperty("rates")
        private Rates rates;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("success")
        public Boolean getSuccess() {
            return success;
        }

        @JsonProperty("success")
        public void setSuccess(Boolean success) {
            this.success = success;
        }

        @JsonProperty("timestamp")
        public Integer getTimestamp() {
            return timestamp;
        }

        @JsonProperty("timestamp")
        public void setTimestamp(Integer timestamp) {
            this.timestamp = timestamp;
        }

        @JsonProperty("base")
        public String getBase() {
            return base;
        }

        @JsonProperty("base")
        public void setBase(String base) {
            this.base = base;
        }

        @JsonProperty("date")
        public String getDate() {
            return date;
        }

        @JsonProperty("date")
        public void setDate(String date) {
            this.date = date;
        }

        @JsonProperty("rates")
        public Rates getRates() {
            return rates;
        }

        @JsonProperty("rates")
        public void setRates(Rates rates) {
            this.rates = rates;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }
    }
