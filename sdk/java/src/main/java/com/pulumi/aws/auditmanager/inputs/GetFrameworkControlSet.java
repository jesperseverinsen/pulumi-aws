// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.auditmanager.inputs;

import com.pulumi.aws.auditmanager.inputs.GetFrameworkControlSetControl;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFrameworkControlSet extends com.pulumi.resources.InvokeArgs {

    public static final GetFrameworkControlSet Empty = new GetFrameworkControlSet();

    @Import(name="controls")
    private @Nullable List<GetFrameworkControlSetControl> controls;

    public Optional<List<GetFrameworkControlSetControl>> controls() {
        return Optional.ofNullable(this.controls);
    }

    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    /**
     * Name of the framework.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the framework.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetFrameworkControlSet() {}

    private GetFrameworkControlSet(GetFrameworkControlSet $) {
        this.controls = $.controls;
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFrameworkControlSet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFrameworkControlSet $;

        public Builder() {
            $ = new GetFrameworkControlSet();
        }

        public Builder(GetFrameworkControlSet defaults) {
            $ = new GetFrameworkControlSet(Objects.requireNonNull(defaults));
        }

        public Builder controls(@Nullable List<GetFrameworkControlSetControl> controls) {
            $.controls = controls;
            return this;
        }

        public Builder controls(GetFrameworkControlSetControl... controls) {
            return controls(List.of(controls));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name Name of the framework.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetFrameworkControlSet build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetFrameworkControlSet", "id");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetFrameworkControlSet", "name");
            }
            return $;
        }
    }

}
