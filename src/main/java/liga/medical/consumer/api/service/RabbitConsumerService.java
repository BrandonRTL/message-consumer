package liga.medical.consumer.api.service;


public interface RabbitConsumerService {

    void getErrorMessage(String message);

    void getDailyMessage(String message);

    void getAlertMessage(String message);

}