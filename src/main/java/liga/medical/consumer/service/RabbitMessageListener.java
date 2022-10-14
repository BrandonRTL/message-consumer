package liga.medical.consumer.service;

import liga.medical.consumer.service.QueueNames;
import liga.medical.consumer.api.service.RabbitConsumerService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMessageListener {
    private final RabbitConsumerService rabbitConsumerService;

    public RabbitMessageListener(RabbitConsumerService rabbitConsumerService) {
        this.rabbitConsumerService = rabbitConsumerService;
    }

    @RabbitListener(queues = QueueNames.ERROR_QUEUE_NAME)
    public void receiveErrorMessage(String message) {
        rabbitConsumerService.getErrorMessage(message);
    }

    @RabbitListener(queues = QueueNames.DAILY_QUEUE_NAME)
    public void receiveDailyMessage(String message) {
        rabbitConsumerService.getDailyMessage(message);
    }

    @RabbitListener(queues = QueueNames.ALERT_QUEUE_NAME)
    public void receiveAlertMessage(String message) {
        rabbitConsumerService.getAlertMessage(message);
    }
}
