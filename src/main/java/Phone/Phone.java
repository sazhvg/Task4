package Phone;

 public abstract class Phone {
        private String name, model;
        private int storege, memory;

        public Phone(String name, String model, int storege, int memory) {
            this.name=name;
            this.model=model;
            this.storege=storege;
            this.memory=memory;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setModel(String model) {
            this.model = model;
        }
        public void setStorege(int storege) {
            this.storege = storege;
        }
        public void setMemory(int memory) {
            this.memory = memory;
        }
        public String getName() {
            return name;
        }
        public String getModel() {
            return model;
        }
        public int getStorege() {
            return storege;
        }
        public int getMemory() {
            return memory;
        }


     public String call(){
         return "Call from " + name + " " + model ;
     }
     public String sendMessage(){
         return "Message from " + name + " " + model;
     }
     public String takePhoto(){
         return "Photo from " + name + " " + model;
     }
     public String shootVideos(){
         return "Videos from " + name + " " + model;
     }

        public String toString() {
            return "Виробник: " + getName() + "; Модель: " + getModel() +
                    "; Сховище:"+ getStorege()+ "; ОЗУ:" + getMemory() + ".";
        }
}