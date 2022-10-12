package ex3;

public class RS {
        private String mens;
        private byte relevancia;

        public RS(String msg, byte relevancia) {
            this.mens = msg;
            this.relevancia = relevancia;
        }
        public String getMsg() {
            return mens;
        }

        public void setMsg(String msg) {
            this.mens = msg;
        }

        public byte getRelevancia() {
            return relevancia;
        }

        public void setRelevancia(byte relevancia) {
            this.relevancia = relevancia;
        }
    }
}
