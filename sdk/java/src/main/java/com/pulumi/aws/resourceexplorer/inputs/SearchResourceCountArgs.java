// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.resourceexplorer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


public final class SearchResourceCountArgs extends com.pulumi.resources.ResourceArgs {

    public static final SearchResourceCountArgs Empty = new SearchResourceCountArgs();

    @Import(name="completed", required=true)
    private Output<Boolean> completed;

    public Output<Boolean> completed() {
        return this.completed;
    }

    /**
     * Number of resources that match the search query. This value can&#39;t exceed 1,000. If there are more than 1,000 resources that match the query, then only 1,000 are counted and the Complete field is set to false. We recommend that you refine your query to return a smaller number of results.
     * 
     */
    @Import(name="totalResources", required=true)
    private Output<Integer> totalResources;

    /**
     * @return Number of resources that match the search query. This value can&#39;t exceed 1,000. If there are more than 1,000 resources that match the query, then only 1,000 are counted and the Complete field is set to false. We recommend that you refine your query to return a smaller number of results.
     * 
     */
    public Output<Integer> totalResources() {
        return this.totalResources;
    }

    private SearchResourceCountArgs() {}

    private SearchResourceCountArgs(SearchResourceCountArgs $) {
        this.completed = $.completed;
        this.totalResources = $.totalResources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SearchResourceCountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SearchResourceCountArgs $;

        public Builder() {
            $ = new SearchResourceCountArgs();
        }

        public Builder(SearchResourceCountArgs defaults) {
            $ = new SearchResourceCountArgs(Objects.requireNonNull(defaults));
        }

        public Builder completed(Output<Boolean> completed) {
            $.completed = completed;
            return this;
        }

        public Builder completed(Boolean completed) {
            return completed(Output.of(completed));
        }

        /**
         * @param totalResources Number of resources that match the search query. This value can&#39;t exceed 1,000. If there are more than 1,000 resources that match the query, then only 1,000 are counted and the Complete field is set to false. We recommend that you refine your query to return a smaller number of results.
         * 
         * @return builder
         * 
         */
        public Builder totalResources(Output<Integer> totalResources) {
            $.totalResources = totalResources;
            return this;
        }

        /**
         * @param totalResources Number of resources that match the search query. This value can&#39;t exceed 1,000. If there are more than 1,000 resources that match the query, then only 1,000 are counted and the Complete field is set to false. We recommend that you refine your query to return a smaller number of results.
         * 
         * @return builder
         * 
         */
        public Builder totalResources(Integer totalResources) {
            return totalResources(Output.of(totalResources));
        }

        public SearchResourceCountArgs build() {
            if ($.completed == null) {
                throw new MissingRequiredPropertyException("SearchResourceCountArgs", "completed");
            }
            if ($.totalResources == null) {
                throw new MissingRequiredPropertyException("SearchResourceCountArgs", "totalResources");
            }
            return $;
        }
    }

}
