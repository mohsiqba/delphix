package com.delphix.bart;

import org.apache.commons.lang3.StringUtils;

import javax.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StationService {

    public static void findEstimate() throws JAXBException {
        String responseContent = RESTService.execute();
        if (StringUtils.isNotBlank(responseContent)) {
            Utils.parseValidationError(responseContent);
            StationETD stationETD = Utils.parseContent(responseContent);
            arrangeEstimates(stationETD);
        } else {
            System.out.println("[LOG] NO Response Received..... keep trying !!!");
        }
    }

    public static void arrangeEstimates(StationETD stationETD) {
        StationVO stationVO = new StationVO();
        stationVO.setDate(stationETD.getDate());
        stationVO.setStationName(stationETD.getStation().getName());
        stationVO.setStationAbbr(stationETD.getStation().getAbbr());
        stationVO.setTime(stationETD.getTime());
        if (stationETD.getStation().getEtd() != null) {
            stationVO.setTrains(sortEstimates(stationETD.getStation().getEtd()));
        } else {
            System.out.println("[LOG] No Estimates available at this moment.... keep trying !!!");
        }
        displayEstimates(stationVO);
    }

    private static List<TrainVO> sortEstimates(List<Etd> etdList) {
        List<TrainVO> list = null;
        if (etdList != null && etdList.size() != 0) {
            list = new ArrayList<TrainVO>();
            for (Etd etd : etdList) {
                for (Estimate estimate : etd.getEstimate()) {
                    TrainVO vo = new TrainVO();
                    vo.setDelay(estimate.getDelay());
                    vo.setDirection(estimate.getDirection());
                    vo.setMinutes(estimate.getMinutes());
                    vo.setPlatform(estimate.getPlatform());
                    vo.setDestinationName(etd.getDestination());
                    vo.setDestinationAbbr(etd.getAbbreviation());
                    list.add(vo);
                }
            }
        }
        Collections.sort(list, new Comparator<TrainVO>() {
            public int compare(TrainVO u1, TrainVO u2) {

                return Integer.valueOf(u1.getMinutes()).compareTo(Integer.valueOf(u2.getMinutes()));
            }
        });
        return list;
    }

    public static void displayEstimates(StationVO stationVO) {
        System.out.println("+------------------------------------------------------------------------------+");
        System.out.format("|%30s(%s) %s %-30s|%n", stationVO.getStationName(), stationVO.getStationAbbr(), stationVO.getDate(), stationVO.getTime());
        System.out.println("+------------------------------------------------------------------------------+");
        System.out.printf("|Arriving In | Platform | Direction | Delayed By | Destination                 | %n");
        System.out.printf("+------------+----------+-----------+------------+-----------------------------+%n");
        if (stationVO.getTrains() != null && !stationVO.getTrains().isEmpty()) {
            for (TrainVO trainVO : stationVO.getTrains()) {
                System.out.printf("|%-3s %-7s | %-7s  | %-9S | %-3s %-6s | %-28s|%n", trainVO.getMinutes(), "mins", trainVO.getPlatform(), trainVO.getDirection(), trainVO.getDelay(), "secs", StringUtils.join(trainVO.getDestinationName(), " (", trainVO.getDestinationAbbr(), ")"));
            }
        } else {
            System.out.println("[LOG] No Trains Available at this moment");
        }
        System.out.printf("+------------+----------+-----------+------------+-----------------------------+%n");
    }
}
