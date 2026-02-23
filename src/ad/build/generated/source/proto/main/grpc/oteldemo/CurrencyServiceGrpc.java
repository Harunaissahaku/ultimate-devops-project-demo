package oteldemo;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: demo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CurrencyServiceGrpc {

  private CurrencyServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "oteldemo.CurrencyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<oteldemo.Demo.Empty,
      oteldemo.Demo.GetSupportedCurrenciesResponse> getGetSupportedCurrenciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSupportedCurrencies",
      requestType = oteldemo.Demo.Empty.class,
      responseType = oteldemo.Demo.GetSupportedCurrenciesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<oteldemo.Demo.Empty,
      oteldemo.Demo.GetSupportedCurrenciesResponse> getGetSupportedCurrenciesMethod() {
    io.grpc.MethodDescriptor<oteldemo.Demo.Empty, oteldemo.Demo.GetSupportedCurrenciesResponse> getGetSupportedCurrenciesMethod;
    if ((getGetSupportedCurrenciesMethod = CurrencyServiceGrpc.getGetSupportedCurrenciesMethod) == null) {
      synchronized (CurrencyServiceGrpc.class) {
        if ((getGetSupportedCurrenciesMethod = CurrencyServiceGrpc.getGetSupportedCurrenciesMethod) == null) {
          CurrencyServiceGrpc.getGetSupportedCurrenciesMethod = getGetSupportedCurrenciesMethod =
              io.grpc.MethodDescriptor.<oteldemo.Demo.Empty, oteldemo.Demo.GetSupportedCurrenciesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSupportedCurrencies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.GetSupportedCurrenciesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CurrencyServiceMethodDescriptorSupplier("GetSupportedCurrencies"))
              .build();
        }
      }
    }
    return getGetSupportedCurrenciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<oteldemo.Demo.CurrencyConversionRequest,
      oteldemo.Demo.Money> getConvertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Convert",
      requestType = oteldemo.Demo.CurrencyConversionRequest.class,
      responseType = oteldemo.Demo.Money.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<oteldemo.Demo.CurrencyConversionRequest,
      oteldemo.Demo.Money> getConvertMethod() {
    io.grpc.MethodDescriptor<oteldemo.Demo.CurrencyConversionRequest, oteldemo.Demo.Money> getConvertMethod;
    if ((getConvertMethod = CurrencyServiceGrpc.getConvertMethod) == null) {
      synchronized (CurrencyServiceGrpc.class) {
        if ((getConvertMethod = CurrencyServiceGrpc.getConvertMethod) == null) {
          CurrencyServiceGrpc.getConvertMethod = getConvertMethod =
              io.grpc.MethodDescriptor.<oteldemo.Demo.CurrencyConversionRequest, oteldemo.Demo.Money>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Convert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.CurrencyConversionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.Money.getDefaultInstance()))
              .setSchemaDescriptor(new CurrencyServiceMethodDescriptorSupplier("Convert"))
              .build();
        }
      }
    }
    return getConvertMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CurrencyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CurrencyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CurrencyServiceStub>() {
        @java.lang.Override
        public CurrencyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CurrencyServiceStub(channel, callOptions);
        }
      };
    return CurrencyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CurrencyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CurrencyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CurrencyServiceBlockingStub>() {
        @java.lang.Override
        public CurrencyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CurrencyServiceBlockingStub(channel, callOptions);
        }
      };
    return CurrencyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CurrencyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CurrencyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CurrencyServiceFutureStub>() {
        @java.lang.Override
        public CurrencyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CurrencyServiceFutureStub(channel, callOptions);
        }
      };
    return CurrencyServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getSupportedCurrencies(oteldemo.Demo.Empty request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.GetSupportedCurrenciesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSupportedCurrenciesMethod(), responseObserver);
    }

    /**
     */
    default void convert(oteldemo.Demo.CurrencyConversionRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.Money> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConvertMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CurrencyService.
   */
  public static abstract class CurrencyServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CurrencyServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CurrencyService.
   */
  public static final class CurrencyServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CurrencyServiceStub> {
    private CurrencyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurrencyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CurrencyServiceStub(channel, callOptions);
    }

    /**
     */
    public void getSupportedCurrencies(oteldemo.Demo.Empty request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.GetSupportedCurrenciesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSupportedCurrenciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void convert(oteldemo.Demo.CurrencyConversionRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.Money> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CurrencyService.
   */
  public static final class CurrencyServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CurrencyServiceBlockingStub> {
    private CurrencyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurrencyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CurrencyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public oteldemo.Demo.GetSupportedCurrenciesResponse getSupportedCurrencies(oteldemo.Demo.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSupportedCurrenciesMethod(), getCallOptions(), request);
    }

    /**
     */
    public oteldemo.Demo.Money convert(oteldemo.Demo.CurrencyConversionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConvertMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CurrencyService.
   */
  public static final class CurrencyServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CurrencyServiceFutureStub> {
    private CurrencyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurrencyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CurrencyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<oteldemo.Demo.GetSupportedCurrenciesResponse> getSupportedCurrencies(
        oteldemo.Demo.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSupportedCurrenciesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<oteldemo.Demo.Money> convert(
        oteldemo.Demo.CurrencyConversionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SUPPORTED_CURRENCIES = 0;
  private static final int METHODID_CONVERT = 1;

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
        case METHODID_GET_SUPPORTED_CURRENCIES:
          serviceImpl.getSupportedCurrencies((oteldemo.Demo.Empty) request,
              (io.grpc.stub.StreamObserver<oteldemo.Demo.GetSupportedCurrenciesResponse>) responseObserver);
          break;
        case METHODID_CONVERT:
          serviceImpl.convert((oteldemo.Demo.CurrencyConversionRequest) request,
              (io.grpc.stub.StreamObserver<oteldemo.Demo.Money>) responseObserver);
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
          getGetSupportedCurrenciesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              oteldemo.Demo.Empty,
              oteldemo.Demo.GetSupportedCurrenciesResponse>(
                service, METHODID_GET_SUPPORTED_CURRENCIES)))
        .addMethod(
          getConvertMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              oteldemo.Demo.CurrencyConversionRequest,
              oteldemo.Demo.Money>(
                service, METHODID_CONVERT)))
        .build();
  }

  private static abstract class CurrencyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CurrencyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return oteldemo.Demo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CurrencyService");
    }
  }

  private static final class CurrencyServiceFileDescriptorSupplier
      extends CurrencyServiceBaseDescriptorSupplier {
    CurrencyServiceFileDescriptorSupplier() {}
  }

  private static final class CurrencyServiceMethodDescriptorSupplier
      extends CurrencyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CurrencyServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CurrencyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CurrencyServiceFileDescriptorSupplier())
              .addMethod(getGetSupportedCurrenciesMethod())
              .addMethod(getConvertMethod())
              .build();
        }
      }
    }
    return result;
  }
}
