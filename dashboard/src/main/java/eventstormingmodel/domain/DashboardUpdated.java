package eventstormingmodel.domain;

import eventstormingmodel.domain.*;
import eventstormingmodel.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DashboardUpdated extends AbstractEvent {

    public DashboardUpdated(Dashboard aggregate) {
        super(aggregate);
    }

    public DashboardUpdated() {
        super();
    }
}
