package org.testuni.inheritance;

import org.testuni.classes.AbstractEntry;

public class Media extends AbstractEntry {

        static int maxEntrySize;
        String mediaType;

        public Media(String author, int date, String message, String messageType, String mediaType) {
            super(author, date, message, messageType);
            this.mediaType = mediaType;
        }

        public String getMediaType () {
                return mediaType;
        }

        @Override
        public int getMaxSizeOfEntry() {
                return maxEntrySize;
        }
}
