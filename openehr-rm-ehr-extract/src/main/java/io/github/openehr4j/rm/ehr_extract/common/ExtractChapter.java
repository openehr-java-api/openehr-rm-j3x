package io.github.openehr4j.rm.ehr_extract.common;

import java.util.List;
import io.github.openehr4j.rm.common.archetyped.Locatable;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr_extract.html#_extract_chapter_class">specifications.openehr.org</a>
 */
public interface ExtractChapter extends Locatable {

  List getItems();
}
