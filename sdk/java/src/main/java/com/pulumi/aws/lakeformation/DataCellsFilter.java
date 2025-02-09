// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lakeformation.DataCellsFilterArgs;
import com.pulumi.aws.lakeformation.inputs.DataCellsFilterState;
import com.pulumi.aws.lakeformation.outputs.DataCellsFilterTableData;
import com.pulumi.aws.lakeformation.outputs.DataCellsFilterTimeouts;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS Lake Formation Data Cells Filter.
 * 
 * ## Example Usage
 * 
 * ### Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lakeformation.DataCellsFilter;
 * import com.pulumi.aws.lakeformation.DataCellsFilterArgs;
 * import com.pulumi.aws.lakeformation.inputs.DataCellsFilterTableDataArgs;
 * import com.pulumi.aws.lakeformation.inputs.DataCellsFilterTableDataRowFilterArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new DataCellsFilter(&#34;example&#34;, DataCellsFilterArgs.builder()        
 *             .tableData(DataCellsFilterTableDataArgs.builder()
 *                 .databaseName(test.name())
 *                 .name(&#34;example&#34;)
 *                 .tableCatalogId(current.accountId())
 *                 .tableName(testAwsGlueCatalogTable.name())
 *                 .columnNames(&#34;my_column&#34;)
 *                 .rowFilter(DataCellsFilterTableDataRowFilterArgs.builder()
 *                     .filterExpression(&#34;my_column=&#39;example&#39;&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Lake Formation Data Cells Filter using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:lakeformation/dataCellsFilter:DataCellsFilter example database_name,name,table_catalog_id,table_name
 * ```
 * 
 */
@ResourceType(type="aws:lakeformation/dataCellsFilter:DataCellsFilter")
public class DataCellsFilter extends com.pulumi.resources.CustomResource {
    /**
     * Information about the data cells filter. See Table Data below for details.
     * 
     */
    @Export(name="tableData", refs={DataCellsFilterTableData.class}, tree="[0]")
    private Output</* @Nullable */ DataCellsFilterTableData> tableData;

    /**
     * @return Information about the data cells filter. See Table Data below for details.
     * 
     */
    public Output<Optional<DataCellsFilterTableData>> tableData() {
        return Codegen.optional(this.tableData);
    }
    @Export(name="timeouts", refs={DataCellsFilterTimeouts.class}, tree="[0]")
    private Output</* @Nullable */ DataCellsFilterTimeouts> timeouts;

    public Output<Optional<DataCellsFilterTimeouts>> timeouts() {
        return Codegen.optional(this.timeouts);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataCellsFilter(String name) {
        this(name, DataCellsFilterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataCellsFilter(String name, @Nullable DataCellsFilterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataCellsFilter(String name, @Nullable DataCellsFilterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lakeformation/dataCellsFilter:DataCellsFilter", name, args == null ? DataCellsFilterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataCellsFilter(String name, Output<String> id, @Nullable DataCellsFilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lakeformation/dataCellsFilter:DataCellsFilter", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DataCellsFilter get(String name, Output<String> id, @Nullable DataCellsFilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataCellsFilter(name, id, state, options);
    }
}
