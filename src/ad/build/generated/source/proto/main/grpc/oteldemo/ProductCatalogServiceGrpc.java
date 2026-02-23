package oteldemo;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: demo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProductCatalogServiceGrpc {

  private ProductCatalogServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "oteldemo.ProductCatalogService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<oteldemo.Demo.Empty,
      oteldemo.Demo.ListProductsResponse> getListProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProducts",
      requestType = oteldemo.Demo.Empty.class,
      responseType = oteldemo.Demo.ListProductsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<oteldemo.Demo.Empty,
      oteldemo.Demo.ListProductsResponse> getListProductsMethod() {
    io.grpc.MethodDescriptor<oteldemo.Demo.Empty, oteldemo.Demo.ListProductsResponse> getListProductsMethod;
    if ((getListProductsMethod = ProductCatalogServiceGrpc.getListProductsMethod) == null) {
      synchronized (ProductCatalogServiceGrpc.class) {
        if ((getListProductsMethod = ProductCatalogServiceGrpc.getListProductsMethod) == null) {
          ProductCatalogServiceGrpc.getListProductsMethod = getListProductsMethod =
              io.grpc.MethodDescriptor.<oteldemo.Demo.Empty, oteldemo.Demo.ListProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.ListProductsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductCatalogServiceMethodDescriptorSupplier("ListProducts"))
              .build();
        }
      }
    }
    return getListProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<oteldemo.Demo.GetProductRequest,
      oteldemo.Demo.Product> getGetProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProduct",
      requestType = oteldemo.Demo.GetProductRequest.class,
      responseType = oteldemo.Demo.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<oteldemo.Demo.GetProductRequest,
      oteldemo.Demo.Product> getGetProductMethod() {
    io.grpc.MethodDescriptor<oteldemo.Demo.GetProductRequest, oteldemo.Demo.Product> getGetProductMethod;
    if ((getGetProductMethod = ProductCatalogServiceGrpc.getGetProductMethod) == null) {
      synchronized (ProductCatalogServiceGrpc.class) {
        if ((getGetProductMethod = ProductCatalogServiceGrpc.getGetProductMethod) == null) {
          ProductCatalogServiceGrpc.getGetProductMethod = getGetProductMethod =
              io.grpc.MethodDescriptor.<oteldemo.Demo.GetProductRequest, oteldemo.Demo.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.GetProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.Product.getDefaultInstance()))
              .setSchemaDescriptor(new ProductCatalogServiceMethodDescriptorSupplier("GetProduct"))
              .build();
        }
      }
    }
    return getGetProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<oteldemo.Demo.SearchProductsRequest,
      oteldemo.Demo.SearchProductsResponse> getSearchProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchProducts",
      requestType = oteldemo.Demo.SearchProductsRequest.class,
      responseType = oteldemo.Demo.SearchProductsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<oteldemo.Demo.SearchProductsRequest,
      oteldemo.Demo.SearchProductsResponse> getSearchProductsMethod() {
    io.grpc.MethodDescriptor<oteldemo.Demo.SearchProductsRequest, oteldemo.Demo.SearchProductsResponse> getSearchProductsMethod;
    if ((getSearchProductsMethod = ProductCatalogServiceGrpc.getSearchProductsMethod) == null) {
      synchronized (ProductCatalogServiceGrpc.class) {
        if ((getSearchProductsMethod = ProductCatalogServiceGrpc.getSearchProductsMethod) == null) {
          ProductCatalogServiceGrpc.getSearchProductsMethod = getSearchProductsMethod =
              io.grpc.MethodDescriptor.<oteldemo.Demo.SearchProductsRequest, oteldemo.Demo.SearchProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.SearchProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.SearchProductsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductCatalogServiceMethodDescriptorSupplier("SearchProducts"))
              .build();
        }
      }
    }
    return getSearchProductsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductCatalogServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductCatalogServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductCatalogServiceStub>() {
        @java.lang.Override
        public ProductCatalogServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductCatalogServiceStub(channel, callOptions);
        }
      };
    return ProductCatalogServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductCatalogServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductCatalogServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductCatalogServiceBlockingStub>() {
        @java.lang.Override
        public ProductCatalogServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductCatalogServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductCatalogServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductCatalogServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductCatalogServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductCatalogServiceFutureStub>() {
        @java.lang.Override
        public ProductCatalogServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductCatalogServiceFutureStub(channel, callOptions);
        }
      };
    return ProductCatalogServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void listProducts(oteldemo.Demo.Empty request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.ListProductsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListProductsMethod(), responseObserver);
    }

    /**
     */
    default void getProduct(oteldemo.Demo.GetProductRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.Product> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductMethod(), responseObserver);
    }

    /**
     */
    default void searchProducts(oteldemo.Demo.SearchProductsRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.SearchProductsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchProductsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProductCatalogService.
   */
  public static abstract class ProductCatalogServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProductCatalogServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProductCatalogService.
   */
  public static final class ProductCatalogServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProductCatalogServiceStub> {
    private ProductCatalogServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductCatalogServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductCatalogServiceStub(channel, callOptions);
    }

    /**
     */
    public void listProducts(oteldemo.Demo.Empty request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.ListProductsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProduct(oteldemo.Demo.GetProductRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.Product> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchProducts(oteldemo.Demo.SearchProductsRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.SearchProductsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchProductsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProductCatalogService.
   */
  public static final class ProductCatalogServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProductCatalogServiceBlockingStub> {
    private ProductCatalogServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductCatalogServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductCatalogServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public oteldemo.Demo.ListProductsResponse listProducts(oteldemo.Demo.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListProductsMethod(), getCallOptions(), request);
    }

    /**
     */
    public oteldemo.Demo.Product getProduct(oteldemo.Demo.GetProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public oteldemo.Demo.SearchProductsResponse searchProducts(oteldemo.Demo.SearchProductsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchProductsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProductCatalogService.
   */
  public static final class ProductCatalogServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProductCatalogServiceFutureStub> {
    private ProductCatalogServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductCatalogServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductCatalogServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<oteldemo.Demo.ListProductsResponse> listProducts(
        oteldemo.Demo.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListProductsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<oteldemo.Demo.Product> getProduct(
        oteldemo.Demo.GetProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<oteldemo.Demo.SearchProductsResponse> searchProducts(
        oteldemo.Demo.SearchProductsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchProductsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_PRODUCTS = 0;
  private static final int METHODID_GET_PRODUCT = 1;
  private static final int METHODID_SEARCH_PRODUCTS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_PRODUCTS:
          serviceImpl.listProducts((oteldemo.Demo.Empty) request,
              (io.grpc.stub.StreamObserver<oteldemo.Demo.ListProductsResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCT:
          serviceImpl.getProduct((oteldemo.Demo.GetProductRequest) request,
              (io.grpc.stub.StreamObserver<oteldemo.Demo.Product>) responseObserver);
          break;
        case METHODID_SEARCH_PRODUCTS:
          serviceImpl.searchProducts((oteldemo.Demo.SearchProductsRequest) request,
              (io.grpc.stub.StreamObserver<oteldemo.Demo.SearchProductsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getListProductsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              oteldemo.Demo.Empty,
              oteldemo.Demo.ListProductsResponse>(
                service, METHODID_LIST_PRODUCTS)))
        .addMethod(
          getGetProductMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              oteldemo.Demo.GetProductRequest,
              oteldemo.Demo.Product>(
                service, METHODID_GET_PRODUCT)))
        .addMethod(
          getSearchProductsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              oteldemo.Demo.SearchProductsRequest,
              oteldemo.Demo.SearchProductsResponse>(
                service, METHODID_SEARCH_PRODUCTS)))
        .build();
  }

  private static abstract class ProductCatalogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductCatalogServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return oteldemo.Demo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductCatalogService");
    }
  }

  private static final class ProductCatalogServiceFileDescriptorSupplier
      extends ProductCatalogServiceBaseDescriptorSupplier {
    ProductCatalogServiceFileDescriptorSupplier() {}
  }

  private static final class ProductCatalogServiceMethodDescriptorSupplier
      extends ProductCatalogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProductCatalogServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProductCatalogServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductCatalogServiceFileDescriptorSupplier())
              .addMethod(getListProductsMethod())
              .addMethod(getGetProductMethod())
              .addMethod(getSearchProductsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
