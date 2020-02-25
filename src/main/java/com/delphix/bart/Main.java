package com.delphix.bart;

import javax.xml.bind.JAXBException;

/**
 * start the estimation service for Montgomery St.(MONT) station
 */
public class Main {
    public static void main(String[] args) throws JAXBException {
        StationService.findEstimate();
    }
}
