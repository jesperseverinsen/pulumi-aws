// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.aws.medialive.outputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsAudioSilenceSettings;
import com.pulumi.aws.medialive.outputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettings;
import com.pulumi.aws.medialive.outputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsVideoBlackSettings;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettings {
    /**
     * @return MediaLive will perform a failover if the specified audio selector is silent for the specified period. See Audio Silence Failover Settings for more details.
     * 
     */
    private @Nullable ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsAudioSilenceSettings audioSilenceSettings;
    /**
     * @return MediaLive will perform a failover if content is not detected in this input for the specified period. See Input Loss Failover Settings for more details.
     * 
     */
    private @Nullable ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettings inputLossSettings;
    /**
     * @return MediaLive will perform a failover if content is considered black for the specified period. See Video Black Failover Settings for more details.
     * 
     */
    private @Nullable ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsVideoBlackSettings videoBlackSettings;

    private ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettings() {}
    /**
     * @return MediaLive will perform a failover if the specified audio selector is silent for the specified period. See Audio Silence Failover Settings for more details.
     * 
     */
    public Optional<ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsAudioSilenceSettings> audioSilenceSettings() {
        return Optional.ofNullable(this.audioSilenceSettings);
    }
    /**
     * @return MediaLive will perform a failover if content is not detected in this input for the specified period. See Input Loss Failover Settings for more details.
     * 
     */
    public Optional<ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettings> inputLossSettings() {
        return Optional.ofNullable(this.inputLossSettings);
    }
    /**
     * @return MediaLive will perform a failover if content is considered black for the specified period. See Video Black Failover Settings for more details.
     * 
     */
    public Optional<ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsVideoBlackSettings> videoBlackSettings() {
        return Optional.ofNullable(this.videoBlackSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsAudioSilenceSettings audioSilenceSettings;
        private @Nullable ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettings inputLossSettings;
        private @Nullable ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsVideoBlackSettings videoBlackSettings;
        public Builder() {}
        public Builder(ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioSilenceSettings = defaults.audioSilenceSettings;
    	      this.inputLossSettings = defaults.inputLossSettings;
    	      this.videoBlackSettings = defaults.videoBlackSettings;
        }

        @CustomType.Setter
        public Builder audioSilenceSettings(@Nullable ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsAudioSilenceSettings audioSilenceSettings) {

            this.audioSilenceSettings = audioSilenceSettings;
            return this;
        }
        @CustomType.Setter
        public Builder inputLossSettings(@Nullable ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettings inputLossSettings) {

            this.inputLossSettings = inputLossSettings;
            return this;
        }
        @CustomType.Setter
        public Builder videoBlackSettings(@Nullable ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsVideoBlackSettings videoBlackSettings) {

            this.videoBlackSettings = videoBlackSettings;
            return this;
        }
        public ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettings build() {
            final var _resultValue = new ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettings();
            _resultValue.audioSilenceSettings = audioSilenceSettings;
            _resultValue.inputLossSettings = inputLossSettings;
            _resultValue.videoBlackSettings = videoBlackSettings;
            return _resultValue;
        }
    }
}
