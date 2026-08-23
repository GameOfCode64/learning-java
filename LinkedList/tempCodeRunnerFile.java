

            if (tail == null) {
                return;
            }

            if (head == tail) {
                head = null;
                tail = null;
                return;
            }
            tail = tail.prev;