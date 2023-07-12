package eventstormingmodel.domain;

import eventstormingmodel.domain.*;
import eventstormingmodel.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileIndexed extends AbstractEvent {

    public FileIndexed(File aggregate) {
        super(aggregate);
    }

    public FileIndexed() {
        super();
    }
}
