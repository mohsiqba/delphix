package com.delphix.bart;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class Utils {

    public static String buildQuery() {
        StringBuilder builder = new StringBuilder(Properties.REQUEST_QUERY_DELIMITER);
        builder.append(Properties.API_COMMAND).append(Properties.EQUALS).append(Properties.API_COMMAND_VALUE).append(Properties.REQUEST_ATTRIBUTE_DELIMITER)
                .append(Properties.API_ORIGINATION_STATION).append(Properties.EQUALS).append(Properties.API_ORIGINATION_STATION_VALUE).append(Properties.REQUEST_ATTRIBUTE_DELIMITER)
                .append(Properties.API_KEY).append(Properties.EQUALS).append(Properties.API_KEY_VALUE).append(Properties.REQUEST_ATTRIBUTE_DELIMITER)
        ;
        return builder.toString();
    }

    public static void parseValidationError(String content) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(ValidationError.class);
        Unmarshaller un = context.createUnmarshaller();
        ValidationError validationError = (ValidationError) un.unmarshal(new StringReader(content));
        if (validationError.getMessage() != null && validationError.getMessage().getError() != null) {
            throw new RESTException("VALIDATION_ERROR", 400, validationError.toString());
        }
    }

    public static StationETD parseContent(String content) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(StationETD.class);
        Unmarshaller un = context.createUnmarshaller();
        StationETD stationETD = (StationETD) un.unmarshal(new StringReader(content));
        return stationETD;
    }
}
