/*
 * Copyright 2022-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.pulsar.core;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

import org.apache.pulsar.client.api.Consumer;
import org.apache.pulsar.client.api.ConsumerBuilder;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.api.PulsarClientException;
import org.apache.pulsar.client.api.Schema;
import org.apache.pulsar.client.impl.ConsumerBuilderImpl;

import org.springframework.lang.Nullable;
import org.springframework.util.CollectionUtils;

/**
 * Default implementation for {@link PulsarConsumerFactory}.
 *
 * @param <T> underlying payload type for the consumer.
 * @author Soby Chacko
 * @author Alexander Preuß
 * @author Christophe Bornet
 * @author Chris Bono
 */
public class DefaultPulsarConsumerFactory<T> implements PulsarConsumerFactory<T> {

	private final PulsarClient pulsarClient;

	@Nullable
	private final ConsumerBuilderCustomizer<T> defaultConfigCustomizer;

	/**
	 * Construct a consumer factory instance.
	 * @param pulsarClient the client used to consume
	 * @param defaultConfigCustomizer the default configuration to apply to the consumers
	 * or null to use no default configuration
	 */
	public DefaultPulsarConsumerFactory(PulsarClient pulsarClient,
			ConsumerBuilderCustomizer<T> defaultConfigCustomizer) {
		this.pulsarClient = pulsarClient;
		this.defaultConfigCustomizer = defaultConfigCustomizer;
	}

	@Override
	public Consumer<T> createConsumer(Schema<T> schema, @Nullable Collection<String> topics,
			@Nullable String subscriptionName, ConsumerBuilderCustomizer<T> customizer) throws PulsarClientException {
		return createConsumer(schema, topics, subscriptionName, null,
				customizer != null ? Collections.singletonList(customizer) : null);
	}

	@Override
	public Consumer<T> createConsumer(Schema<T> schema, @Nullable Collection<String> topics,
			@Nullable String subscriptionName, @Nullable Map<String, String> metadataProperties,
			@Nullable List<ConsumerBuilderCustomizer<T>> customizers) throws PulsarClientException {
		Objects.requireNonNull(schema, "Schema must be specified");
		ConsumerBuilder<T> consumerBuilder = this.pulsarClient.newConsumer(schema);

		// Apply the default config customizer (preserve the topic)
		if (this.defaultConfigCustomizer != null) {
			this.defaultConfigCustomizer.customize(consumerBuilder);
		}
		if (topics != null) {
			replaceTopicsOnBuilder(consumerBuilder, topics);
		}
		if (subscriptionName != null) {
			consumerBuilder.subscriptionName(subscriptionName);
		}
		if (metadataProperties != null) {
			replaceMetadataPropertiesOnBuilder(consumerBuilder, metadataProperties);
		}
		if (!CollectionUtils.isEmpty(customizers)) {
			customizers.forEach(customizer -> customizer.customize(consumerBuilder));
		}
		return consumerBuilder.subscribe();
	}

	private void replaceTopicsOnBuilder(ConsumerBuilder<T> builder, Collection<String> topics) {
		var builderImpl = (ConsumerBuilderImpl<T>) builder;
		builderImpl.getConf().setTopicNames(new HashSet<>(topics));
	}

	private void replaceMetadataPropertiesOnBuilder(ConsumerBuilder<T> builder,
			Map<String, String> metadataProperties) {
		var builderImpl = (ConsumerBuilderImpl<T>) builder;
		builderImpl.getConf().setProperties(new TreeMap<>(metadataProperties));
	}

}
