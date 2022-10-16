public class Lamp {

        /*Write On, write status, it should return on
         * Write Off, write status, it should return off
         * */
        private boolean status;

        public Lamp (){
            status = false;
        }


        public boolean getStatus(){
            return status;
        }

        public void setStatus(boolean newStatus){
            this.status= newStatus;
        }
}
