package org.testuni.inheritance;

import org.testuni.classes.AbstractEntry;


public class Media extends AbstractEntry {

        protected int maxEntrySize;
        protected String mediaType;

        public Media(String author, int date, String message, String messageType, String mediaType, int maxEntrySize) {
            super(author, date, message, messageType);
            this.mediaType = mediaType;
            this.maxEntrySize = maxEntrySize;
        }

        public String getAuthor() {
                return author;
        }
        public int getDate() {
                return date;
        }
        public String getMessage() {
                return message;
        }
        public String getMessageType() {
                return messageType;
        }
        public String getMediaType() {
                return mediaType;
        }


        @Override
        public int getMaxSizeOfEntry() {
                return maxEntrySize;
        }
}
