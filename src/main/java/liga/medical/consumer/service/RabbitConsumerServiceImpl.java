package liga.medical.consumer.service;

import liga.medical.consumer.api.service.RabbitConsumerService;
import org.springframework.stereotype.Service;

@Service
public class RabbitConsumerServiceImpl implements RabbitConsumerService {

    @Override
    public void getErrorMessage(String message) {
        System.out.println(String.format("Получил сообщение из очереди ошибок", message));
    }

    @Override
    public void getDailyMessage(String message) {
        System.out.println(String.format("Получил сообщение из очереди ежедневных сообщений", message));
    }

    @Override
    public void getAlertMessage(String message) {
        System.out.println(String.format("Андрюха, у нас алерт! Возможно, криминал. По Коням.", message));
    }
}