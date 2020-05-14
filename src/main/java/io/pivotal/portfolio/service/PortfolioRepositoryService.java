package io.pivotal.portfolio.service;

import io.pivotal.portfolio.domain.Order;
import io.pivotal.portfolio.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioRepositoryService {

    private OrderRepository repository;

    @Autowired
    public PortfolioRepositoryService(OrderRepository repository) {
        this.repository = repository;
    }

//    @HystrixCommand(
//            commandKey = "portfolio-service.getOrderFromDB",
//            groupKey = "portfolio-service.getOrderFromDB",
//            threadPoolKey = "portfolio-service.getOrderFromDB")
    List<Order> getOrders(String userId) {

        List<Order> orders = repository.findByUserId(userId);
        return repository.findByUserId(userId);
    }

}
