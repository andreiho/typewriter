/**
 * This client was automatically generated by Segment Typewriter. ** Do Not Edit **
 */
package com.segment.generated;

import java.util.*;
import com.segment.analytics.Properties;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class EveryNullableRequiredType extends SerializableProperties {
    private Properties properties;

    private EveryNullableRequiredType(Properties properties) {
        this.properties = properties;
    }

    protected Properties toProperties() {
        return properties;
    }

    /**
     * Builder for {@link EveryNullableRequiredType}
     */
    public static class Builder {
        private Properties properties;

        /**
         * Builder for {@link EveryNullableRequiredType}
         */
        public Builder() {
            properties = new Properties();
        }

        /**
         * Required any property
         * This property is required to generate a valid EveryNullableRequiredType object
         */
        public Builder requiredAny(final @Nullable Object requiredAny) {
            properties.putValue("required any", requiredAny);
            
            return this;
        }

        /**
         * Required array property
         * This property is required to generate a valid EveryNullableRequiredType object
         */
        public Builder requiredArray(final @Nullable List<Object> requiredArray) {
            List<?> p = TypewriterUtils.serializeList(requiredArray);
            properties.putValue("required array", p);

            return this;
        }

        /**
         * Required array with properties
         * This property is required to generate a valid EveryNullableRequiredType object
         */
        public Builder requiredArrayWithProperties(final @Nullable List<RequiredArrayWithPropertiesItem> requiredArrayWithProperties) {
            List<?> p = TypewriterUtils.serializeList(requiredArrayWithProperties);
            properties.putValue("required array with properties", p);

            return this;
        }

        /**
         * Required boolean property
         * This property is required to generate a valid EveryNullableRequiredType object
         */
        public Builder requiredBoolean(final @Nullable Boolean requiredBoolean) {
            properties.putValue("required boolean", requiredBoolean);
            
            return this;
        }

        /**
         * Required integer property
         * This property is required to generate a valid EveryNullableRequiredType object
         */
        public Builder requiredInt(final @Nullable Long requiredInt) {
            properties.putValue("required int", requiredInt);
            
            return this;
        }

        /**
         * Required number property
         * This property is required to generate a valid EveryNullableRequiredType object
         */
        public Builder requiredNumber(final @Nullable Double requiredNumber) {
            properties.putValue("required number", requiredNumber);
            
            return this;
        }

        /**
         * Required object property
         * This property is required to generate a valid EveryNullableRequiredType object
         */
        public Builder requiredObject(final @Nullable Object requiredObject) {
            properties.putValue("required object", requiredObject);
            
            return this;
        }

        /**
         * Required object with properties
         * This property is required to generate a valid EveryNullableRequiredType object
         */
        public Builder requiredObjectWithProperties(final @Nullable RequiredObjectWithProperties requiredObjectWithProperties) {
            if (requiredObjectWithProperties != null) {
                properties.putValue("required object with properties", requiredObjectWithProperties.toProperties());
            } else {
                properties.putValue("required object with properties", requiredObjectWithProperties);
            }

            return this;
        }

        /**
         * Required string property
         * This property is required to generate a valid EveryNullableRequiredType object
         */
        public Builder requiredString(final @Nullable String requiredString) {
            properties.putValue("required string", requiredString);
            
            return this;
        }

        /**
         * Required string property with a regex conditional
         * This property is required to generate a valid EveryNullableRequiredType object
         */
        public Builder requiredStringWithRegex(final @Nullable String requiredStringWithRegex) {
            properties.putValue("required string with regex", requiredStringWithRegex);
            
            return this;
        }

        /**
         * Build an instance of {@link EveryNullableRequiredType}
         */
        public EveryNullableRequiredType build() {
            return new EveryNullableRequiredType(properties);
        }
    }
}