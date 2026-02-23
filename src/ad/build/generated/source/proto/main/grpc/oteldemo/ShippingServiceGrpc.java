package oteldemo;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: demo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ShippingServiceGrpc {

  private ShippingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "oteldemo.ShippingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<oteldemo.Demo.GetQuoteRequest,
      oteldemo.Demo.GetQuoteResponse> getGetQuoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQuote",
      requestType = oteldemo.Demo.GetQuoteRequest.class,
      responseType = oteldemo.Demo.GetQuoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<oteldemo.Demo.GetQuoteRequest,
      oteldemo.Demo.GetQuoteResponse> getGetQuoteMethod() {
    io.grpc.MethodDescriptor<oteldemo.Demo.GetQuoteRequest, oteldemo.Demo.GetQuoteResponse> getGetQuoteMethod;
    if ((getGetQuoteMethod = ShippingServiceGrpc.getGetQuoteMethod) == null) {
      synchronized (ShippingServiceGrpc.class) {
        if ((getGetQuoteMethod = ShippingServiceGrpc.getGetQuoteMethod) == null) {
          ShippingServiceGrpc.getGetQuoteMethod = getGetQuoteMethod =
              io.grpc.MethodDescriptor.<oteldemo.Demo.GetQuoteRequest, oteldemo.Demo.GetQuoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQuote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.GetQuoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.GetQuoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShippingServiceMethodDescriptorSupplier("GetQuote"))
              .build();
        }
      }
    }
    return getGetQuoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<oteldemo.Demo.ShipOrderRequest,
      oteldemo.Demo.ShipOrderResponse> getShipOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShipOrder",
      requestType = oteldemo.Demo.ShipOrderRequest.class,
      responseType = oteldemo.Demo.ShipOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<oteldemo.Demo.ShipOrderRequest,
      oteldemo.Demo.ShipOrderResponse> getShipOrderMethod() {
    io.grpc.MethodDescriptor<oteldemo.Demo.ShipOrderRequest, oteldemo.Demo.ShipOrderResponse> getShipOrderMethod;
    if ((getShipOrderMethod = ShippingServiceGrpc.getShipOrderMethod) == null) {
      synchronized (ShippingServiceGrpc.class) {
        if ((getShipOrderMethod = ShippingServiceGrpc.getShipOrderMethod) == null) {
          ShippingServiceGrpc.getShipOrderMethod = getShipOrderMethod =
              io.grpc.MethodDescriptor.<oteldemo.Demo.ShipOrderRequest, oteldemo.Demo.ShipOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ShipOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.ShipOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.ShipOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShippingServiceMethodDescriptorSupplier("ShipOrder"))
              .build();
        }
      }
    }
    return getShipOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ShippingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShippingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShippingServiceStub>() {
        @java.lang.Override
        public ShippingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShippingServiceStub(channel, callOptions);
        }
      };
    return ShippingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ShippingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShippingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShippingServiceBlockingStub>() {
        @java.lang.Override
        public ShippingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShippingServiceBlockingStub(channel, callOptions);
        }
      };
    return ShippingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ShippingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShippingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShippingServiceFutureStub>() {
        @java.lang.Override
        public ShippingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShippingServiceFutureStub(channel, callOptions);
        }
      };
    return ShippingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getQuote(oteldemo.Demo.GetQuoteRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.GetQuoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQuoteMethod(), responseObserver);
    }

    /**
     */
    default void shipOrder(oteldemo.Demo.ShipOrderRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.ShipOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShipOrderMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ShippingService.
   */
  public static abstract class ShippingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ShippingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ShippingService.
   */
  public static final class ShippingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ShippingServiceStub> {
    private ShippingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShippingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShippingServiceStub(channel, callOptions);
    }

    /**
     */
    public void getQuote(oteldemo.Demo.GetQuoteRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.GetQuoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQuoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void shipOrder(oteldemo.Demo.ShipOrderRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.ShipOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShipOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ShippingService.
   */
  public static final class ShippingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ShippingServiceBlockingStub> {
    private ShippingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShippingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShippingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public oteldemo.Demo.GetQuoteResponse getQuote(oteldemo.Demo.GetQuoteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQuoteMethod(), getCallOptions(), request);
    }

    /**
     */
    public oteldemo.Demo.ShipOrderResponse shipOrder(oteldemo.Demo.ShipOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShipOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ShippingService.
   */
  public static final class ShippingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ShippingServiceFutureStub> {
    private ShippingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShippingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShippingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<oteldemo.Demo.GetQuoteResponse> getQuote(
        oteldemo.Demo.GetQuoteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQuoteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<oteldemo.Demo.ShipOrderResponse> shipOrder(
        oteldemo.Demo.ShipOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShipOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_QUOTE = 0;
  private static final int METHODID_SHIP_ORDER = 1;

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
        case METHODID_GET_QUOTE:
          serviceImpl.getQuote((oteldemo.Demo.GetQuoteRequest) request,
              (io.grpc.stub.StreamObserver<oteldemo.Demo.GetQuoteResponse>) responseObserver);
          break;
        case METHODID_SHIP_ORDER:
          serviceImpl.shipOrder((oteldemo.Demo.ShipOrderRequest) request,
              (io.grpc.stub.StreamObserver<oteldemo.Demo.ShipOrderResponse>) responseObserver);
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
          getGetQuoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              oteldemo.Demo.GetQuoteRequest,
              oteldemo.Demo.GetQuoteResponse>(
                service, METHODID_GET_QUOTE)))
        .addMethod(
          getShipOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              oteldemo.Demo.ShipOrderRequest,
              oteldemo.Demo.ShipOrderResponse>(
                service, METHODID_SHIP_ORDER)))
        .build();
  }

  private static abstract class ShippingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ShippingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return oteldemo.Demo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ShippingService");
    }
  }

  private static final class ShippingServiceFileDescriptorSupplier
      extends ShippingServiceBaseDescriptorSupplier {
    ShippingServiceFileDescriptorSupplier() {}
  }

  private static final class ShippingServiceMethodDescriptorSupplier
      extends ShippingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ShippingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ShippingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ShippingServiceFileDescriptorSupplier())
              .addMethod(getGetQuoteMethod())
              .addMethod(getShipOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
