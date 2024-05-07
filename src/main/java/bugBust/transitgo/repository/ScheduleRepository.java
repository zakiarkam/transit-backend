package bugBust.transitgo.repository;


import bugBust.transitgo.model.BusMgt;
import bugBust.transitgo.model.BusStop;
import bugBust.transitgo.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule,Integer> {
    // Define a custom query method to find a schedule by bus and bus stop
    Schedule findByBusAndBusStop(BusMgt bus, BusStop busStop);

    List<Schedule> findScheduleByBusId(int bus_id);

Schedule getByscheduleId(Integer scheduleId);
}
