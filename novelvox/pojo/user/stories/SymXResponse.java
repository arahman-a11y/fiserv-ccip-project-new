package novelvox.pojo.user.stories;

import lombok.Generated;

public class SymXResponse {
   private String status;
   private String message;
   private String sequenceId;
   private Object data;

   @Generated
   public String getStatus() {
      return this.status;
   }

   @Generated
   public String getMessage() {
      return this.message;
   }

   @Generated
   public String getSequenceId() {
      return this.sequenceId;
   }

   @Generated
   public Object getData() {
      return this.data;
   }

   @Generated
   public void setStatus(String status) {
      this.status = status;
   }

   @Generated
   public void setMessage(String message) {
      this.message = message;
   }

   @Generated
   public void setSequenceId(String sequenceId) {
      this.sequenceId = sequenceId;
   }

   @Generated
   public void setData(Object data) {
      this.data = data;
   }

   @Generated
   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SymXResponse)) {
         return false;
      } else {
         SymXResponse other = (SymXResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$status = this.getStatus();
            Object other$status = other.getStatus();
            if (this$status == null) {
               if (other$status != null) {
                  return false;
               }
            } else if (!this$status.equals(other$status)) {
               return false;
            }

            Object this$message = this.getMessage();
            Object other$message = other.getMessage();
            if (this$message == null) {
               if (other$message != null) {
                  return false;
               }
            } else if (!this$message.equals(other$message)) {
               return false;
            }

            Object this$sequenceId = this.getSequenceId();
            Object other$sequenceId = other.getSequenceId();
            if (this$sequenceId == null) {
               if (other$sequenceId != null) {
                  return false;
               }
            } else if (!this$sequenceId.equals(other$sequenceId)) {
               return false;
            }

            Object this$data = this.getData();
            Object other$data = other.getData();
            if (this$data == null) {
               if (other$data != null) {
                  return false;
               }
            } else if (!this$data.equals(other$data)) {
               return false;
            }

            return true;
         }
      }
   }

   @Generated
   protected boolean canEqual(Object other) {
      return other instanceof SymXResponse;
   }

   @Generated
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $message = this.getMessage();
      result = result * 59 + ($message == null ? 43 : $message.hashCode());
      Object $sequenceId = this.getSequenceId();
      result = result * 59 + ($sequenceId == null ? 43 : $sequenceId.hashCode());
      Object $data = this.getData();
      result = result * 59 + ($data == null ? 43 : $data.hashCode());
      return result;
   }

   @Generated
   public String toString() {
      String var10000 = this.getStatus();
      return "SymXResponse(status=" + var10000 + ", message=" + this.getMessage() + ", sequenceId=" + this.getSequenceId() + ", data=" + String.valueOf(this.getData()) + ")";
   }

   @Generated
   public SymXResponse(String status, String message, String sequenceId, Object data) {
      this.status = status;
      this.message = message;
      this.sequenceId = sequenceId;
      this.data = data;
   }

   @Generated
   public SymXResponse() {
   }
}
