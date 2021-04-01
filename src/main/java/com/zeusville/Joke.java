package com.zeusville;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Version;

@Version("v1")
@Group("cache")
public class Joke extends CustomResource<JokeSpec, JokeStatus>
    implements Namespaced {}

