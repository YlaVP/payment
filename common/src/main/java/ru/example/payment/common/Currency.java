package ru.example.payment.common;


    public enum Currency{
        RUB(810),
        EUR(978),
        USD(840);

      private int code;
      Currency (int code){
          this.code=code;
      }

      public int getCode(){
          return code;
      }

    }

