package ru.example.Server;

import ru.example.common.PhonePayment;
import java.util.function.Predicate;

public interface Operation {
    boolean PhonePayment(PhonePayment phonePayment, Predicate<Double> predicate);
    }

    // public class Server<account, summ, accountcount> {
    //    Map<String, String> hashMap = new HashMap<>();
    //   map.put(accountcount, summ);

    //  @Override
    //     public boolean equals(Object o) {
    //if (this == o) return true;
    //      if (o == null || getClass() != o.getClass()) return false;
    //   Server<?, ?> server = (Server<?, ?>) o;
    //      return Objects.equals(hashMap, server.hashMap);
    //}

    // @Override
    //public int hashCode() {
    //   return Objects.hash(hashMap);
    // }
    // какая-то логика
    //for......
    //System out print



    //  public static void main(String[] args) {
// сервер реализует с приложением и клиентом (слушает запросы, распознает переданные параметры и значения,
    //       корректно отвечает на них
    //  }


    //}


