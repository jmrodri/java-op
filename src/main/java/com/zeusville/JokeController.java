package com.zeusville;

import io.fabric8.kubernetes.api.model.*;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.kubernetes.api.model.apps.DeploymentBuilder;
import io.fabric8.kubernetes.api.model.apps.DeploymentSpecBuilder;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.api.*;
import io.javaoperatorsdk.operator.api.Context;
import io.javaoperatorsdk.operator.processing.event.EventSourceManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.collections.CollectionUtils;

@Controller
public class JokeController implements ResourceController<Joke> {

    private final KubernetesClient client;

    public JokeController(KubernetesClient client) {
        this.client = client;
    }

    // TODO Fill in the rest of the controller

    @Override
    public void init(EventSourceManager eventSourceManager) {
        // TODO: fill in init
    }

    @Override
    public UpdateControl<Joke> createOrUpdateResource(
        Joke resource, Context<Joke> context) {
        // TODO: fill in logic

        return UpdateControl.noUpdate();
    }

    @Override
    public DeleteControl deleteResource(Joke resource, Context<Joke> context) {
	    // nothing to do here...
        // framework takes care of deleting the resource object
        // k8s takes care of deleting deployment and pods because of ownerreference set
        return DeleteControl.DEFAULT_DELETE;
    }
}

