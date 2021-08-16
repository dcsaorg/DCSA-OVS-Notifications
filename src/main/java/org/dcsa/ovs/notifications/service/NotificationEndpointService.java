package org.dcsa.ovs.notifications.service;

import org.dcsa.core.service.ExtendedBaseService;
import org.dcsa.ovs.notifications.model.NotificationEndpoint;
import org.springframework.http.server.reactive.ServerHttpRequest;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface NotificationEndpointService extends ExtendedBaseService<NotificationEndpoint, UUID> {

    Mono<Void> receiveNotification(ServerHttpRequest request, UUID endpointID);
}
