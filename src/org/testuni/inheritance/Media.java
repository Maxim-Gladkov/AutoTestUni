package org.testuni.inheritance;

import org.testuni.classes.AbstractEntry;


public abstract class Media extends AbstractEntry {

        private int maxEntrySize;
        private String mediaType;

        public Media(String author, int date, String message, String messageType, String mediaType, int maxEntrySize) {
            super(author, date, message, messageType);
            this.mediaType = mediaType;
            this.maxEntrySize = maxEntrySize;
        }

        public abstract String getMediaType();

        @Override
        public int getMaxSizeOfEntry() {
                return maxEntrySize;
        }
}
