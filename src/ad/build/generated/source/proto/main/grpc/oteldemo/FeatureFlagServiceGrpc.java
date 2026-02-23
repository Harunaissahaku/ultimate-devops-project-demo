package oteldemo;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: demo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FeatureFlagServiceGrpc {

  private FeatureFlagServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "oteldemo.FeatureFlagService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<oteldemo.Demo.GetFlagRequest,
      oteldemo.Demo.GetFlagResponse> getGetFlagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFlag",
      requestType = oteldemo.Demo.GetFlagRequest.class,
      responseType = oteldemo.Demo.GetFlagResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<oteldemo.Demo.GetFlagRequest,
      oteldemo.Demo.GetFlagResponse> getGetFlagMethod() {
    io.grpc.MethodDescriptor<oteldemo.Demo.GetFlagRequest, oteldemo.Demo.GetFlagResponse> getGetFlagMethod;
    if ((getGetFlagMethod = FeatureFlagServiceGrpc.getGetFlagMethod) == null) {
      synchronized (FeatureFlagServiceGrpc.class) {
        if ((getGetFlagMethod = FeatureFlagServiceGrpc.getGetFlagMethod) == null) {
          FeatureFlagServiceGrpc.getGetFlagMethod = getGetFlagMethod =
              io.grpc.MethodDescriptor.<oteldemo.Demo.GetFlagRequest, oteldemo.Demo.GetFlagResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFlag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.GetFlagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.GetFlagResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FeatureFlagServiceMethodDescriptorSupplier("GetFlag"))
              .build();
        }
      }
    }
    return getGetFlagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<oteldemo.Demo.CreateFlagRequest,
      oteldemo.Demo.CreateFlagResponse> getCreateFlagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFlag",
      requestType = oteldemo.Demo.CreateFlagRequest.class,
      responseType = oteldemo.Demo.CreateFlagResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<oteldemo.Demo.CreateFlagRequest,
      oteldemo.Demo.CreateFlagResponse> getCreateFlagMethod() {
    io.grpc.MethodDescriptor<oteldemo.Demo.CreateFlagRequest, oteldemo.Demo.CreateFlagResponse> getCreateFlagMethod;
    if ((getCreateFlagMethod = FeatureFlagServiceGrpc.getCreateFlagMethod) == null) {
      synchronized (FeatureFlagServiceGrpc.class) {
        if ((getCreateFlagMethod = FeatureFlagServiceGrpc.getCreateFlagMethod) == null) {
          FeatureFlagServiceGrpc.getCreateFlagMethod = getCreateFlagMethod =
              io.grpc.MethodDescriptor.<oteldemo.Demo.CreateFlagRequest, oteldemo.Demo.CreateFlagResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFlag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.CreateFlagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.CreateFlagResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FeatureFlagServiceMethodDescriptorSupplier("CreateFlag"))
              .build();
        }
      }
    }
    return getCreateFlagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<oteldemo.Demo.UpdateFlagRequest,
      oteldemo.Demo.UpdateFlagResponse> getUpdateFlagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFlag",
      requestType = oteldemo.Demo.UpdateFlagRequest.class,
      responseType = oteldemo.Demo.UpdateFlagResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<oteldemo.Demo.UpdateFlagRequest,
      oteldemo.Demo.UpdateFlagResponse> getUpdateFlagMethod() {
    io.grpc.MethodDescriptor<oteldemo.Demo.UpdateFlagRequest, oteldemo.Demo.UpdateFlagResponse> getUpdateFlagMethod;
    if ((getUpdateFlagMethod = FeatureFlagServiceGrpc.getUpdateFlagMethod) == null) {
      synchronized (FeatureFlagServiceGrpc.class) {
        if ((getUpdateFlagMethod = FeatureFlagServiceGrpc.getUpdateFlagMethod) == null) {
          FeatureFlagServiceGrpc.getUpdateFlagMethod = getUpdateFlagMethod =
              io.grpc.MethodDescriptor.<oteldemo.Demo.UpdateFlagRequest, oteldemo.Demo.UpdateFlagResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFlag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.UpdateFlagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.UpdateFlagResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FeatureFlagServiceMethodDescriptorSupplier("UpdateFlag"))
              .build();
        }
      }
    }
    return getUpdateFlagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<oteldemo.Demo.ListFlagsRequest,
      oteldemo.Demo.ListFlagsResponse> getListFlagsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFlags",
      requestType = oteldemo.Demo.ListFlagsRequest.class,
      responseType = oteldemo.Demo.ListFlagsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<oteldemo.Demo.ListFlagsRequest,
      oteldemo.Demo.ListFlagsResponse> getListFlagsMethod() {
    io.grpc.MethodDescriptor<oteldemo.Demo.ListFlagsRequest, oteldemo.Demo.ListFlagsResponse> getListFlagsMethod;
    if ((getListFlagsMethod = FeatureFlagServiceGrpc.getListFlagsMethod) == null) {
      synchronized (FeatureFlagServiceGrpc.class) {
        if ((getListFlagsMethod = FeatureFlagServiceGrpc.getListFlagsMethod) == null) {
          FeatureFlagServiceGrpc.getListFlagsMethod = getListFlagsMethod =
              io.grpc.MethodDescriptor.<oteldemo.Demo.ListFlagsRequest, oteldemo.Demo.ListFlagsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFlags"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.ListFlagsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.ListFlagsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FeatureFlagServiceMethodDescriptorSupplier("ListFlags"))
              .build();
        }
      }
    }
    return getListFlagsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<oteldemo.Demo.DeleteFlagRequest,
      oteldemo.Demo.DeleteFlagResponse> getDeleteFlagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFlag",
      requestType = oteldemo.Demo.DeleteFlagRequest.class,
      responseType = oteldemo.Demo.DeleteFlagResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<oteldemo.Demo.DeleteFlagRequest,
      oteldemo.Demo.DeleteFlagResponse> getDeleteFlagMethod() {
    io.grpc.MethodDescriptor<oteldemo.Demo.DeleteFlagRequest, oteldemo.Demo.DeleteFlagResponse> getDeleteFlagMethod;
    if ((getDeleteFlagMethod = FeatureFlagServiceGrpc.getDeleteFlagMethod) == null) {
      synchronized (FeatureFlagServiceGrpc.class) {
        if ((getDeleteFlagMethod = FeatureFlagServiceGrpc.getDeleteFlagMethod) == null) {
          FeatureFlagServiceGrpc.getDeleteFlagMethod = getDeleteFlagMethod =
              io.grpc.MethodDescriptor.<oteldemo.Demo.DeleteFlagRequest, oteldemo.Demo.DeleteFlagResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFlag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.DeleteFlagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.DeleteFlagResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FeatureFlagServiceMethodDescriptorSupplier("DeleteFlag"))
              .build();
        }
      }
    }
    return getDeleteFlagMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FeatureFlagServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeatureFlagServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeatureFlagServiceStub>() {
        @java.lang.Override
        public FeatureFlagServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeatureFlagServiceStub(channel, callOptions);
        }
      };
    return FeatureFlagServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FeatureFlagServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeatureFlagServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeatureFlagServiceBlockingStub>() {
        @java.lang.Override
        public FeatureFlagServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeatureFlagServiceBlockingStub(channel, callOptions);
        }
      };
    return FeatureFlagServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FeatureFlagServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeatureFlagServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeatureFlagServiceFutureStub>() {
        @java.lang.Override
        public FeatureFlagServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeatureFlagServiceFutureStub(channel, callOptions);
        }
      };
    return FeatureFlagServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getFlag(oteldemo.Demo.GetFlagRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.GetFlagResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFlagMethod(), responseObserver);
    }

    /**
     */
    default void createFlag(oteldemo.Demo.CreateFlagRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.CreateFlagResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFlagMethod(), responseObserver);
    }

    /**
     */
    default void updateFlag(oteldemo.Demo.UpdateFlagRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.UpdateFlagResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateFlagMethod(), responseObserver);
    }

    /**
     */
    default void listFlags(oteldemo.Demo.ListFlagsRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.ListFlagsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFlagsMethod(), responseObserver);
    }

    /**
     */
    default void deleteFlag(oteldemo.Demo.DeleteFlagRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.DeleteFlagResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFlagMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FeatureFlagService.
   */
  public static abstract class FeatureFlagServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FeatureFlagServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FeatureFlagService.
   */
  public static final class FeatureFlagServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FeatureFlagServiceStub> {
    private FeatureFlagServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeatureFlagServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeatureFlagServiceStub(channel, callOptions);
    }

    /**
     */
    public void getFlag(oteldemo.Demo.GetFlagRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.GetFlagResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFlagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createFlag(oteldemo.Demo.CreateFlagRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.CreateFlagResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFlagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateFlag(oteldemo.Demo.UpdateFlagRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.UpdateFlagResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateFlagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listFlags(oteldemo.Demo.ListFlagsRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.ListFlagsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFlagsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFlag(oteldemo.Demo.DeleteFlagRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.DeleteFlagResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFlagMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FeatureFlagService.
   */
  public static final class FeatureFlagServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FeatureFlagServiceBlockingStub> {
    private FeatureFlagServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeatureFlagServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeatureFlagServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public oteldemo.Demo.GetFlagResponse getFlag(oteldemo.Demo.GetFlagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFlagMethod(), getCallOptions(), request);
    }

    /**
     */
    public oteldemo.Demo.CreateFlagResponse createFlag(oteldemo.Demo.CreateFlagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFlagMethod(), getCallOptions(), request);
    }

    /**
     */
    public oteldemo.Demo.UpdateFlagResponse updateFlag(oteldemo.Demo.UpdateFlagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateFlagMethod(), getCallOptions(), request);
    }

    /**
     */
    public oteldemo.Demo.ListFlagsResponse listFlags(oteldemo.Demo.ListFlagsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFlagsMethod(), getCallOptions(), request);
    }

    /**
     */
    public oteldemo.Demo.DeleteFlagResponse deleteFlag(oteldemo.Demo.DeleteFlagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFlagMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FeatureFlagService.
   */
  public static final class FeatureFlagServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FeatureFlagServiceFutureStub> {
    private FeatureFlagServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeatureFlagServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeatureFlagServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<oteldemo.Demo.GetFlagResponse> getFlag(
        oteldemo.Demo.GetFlagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFlagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<oteldemo.Demo.CreateFlagResponse> createFlag(
        oteldemo.Demo.CreateFlagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFlagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<oteldemo.Demo.UpdateFlagResponse> updateFlag(
        oteldemo.Demo.UpdateFlagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateFlagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<oteldemo.Demo.ListFlagsResponse> listFlags(
        oteldemo.Demo.ListFlagsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFlagsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<oteldemo.Demo.DeleteFlagResponse> deleteFlag(
        oteldemo.Demo.DeleteFlagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFlagMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FLAG = 0;
  private static final int METHODID_CREATE_FLAG = 1;
  private static final int METHODID_UPDATE_FLAG = 2;
  private static final int METHODID_LIST_FLAGS = 3;
  private static final int METHODID_DELETE_FLAG = 4;

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
        case METHODID_GET_FLAG:
          serviceImpl.getFlag((oteldemo.Demo.GetFlagRequest) request,
              (io.grpc.stub.StreamObserver<oteldemo.Demo.GetFlagResponse>) responseObserver);
          break;
        case METHODID_CREATE_FLAG:
          serviceImpl.createFlag((oteldemo.Demo.CreateFlagRequest) request,
              (io.grpc.stub.StreamObserver<oteldemo.Demo.CreateFlagResponse>) responseObserver);
          break;
        case METHODID_UPDATE_FLAG:
          serviceImpl.updateFlag((oteldemo.Demo.UpdateFlagRequest) request,
              (io.grpc.stub.StreamObserver<oteldemo.Demo.UpdateFlagResponse>) responseObserver);
          break;
        case METHODID_LIST_FLAGS:
          serviceImpl.listFlags((oteldemo.Demo.ListFlagsRequest) request,
              (io.grpc.stub.StreamObserver<oteldemo.Demo.ListFlagsResponse>) responseObserver);
          break;
        case METHODID_DELETE_FLAG:
          serviceImpl.deleteFlag((oteldemo.Demo.DeleteFlagRequest) request,
              (io.grpc.stub.StreamObserver<oteldemo.Demo.DeleteFlagResponse>) responseObserver);
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
          getGetFlagMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              oteldemo.Demo.GetFlagRequest,
              oteldemo.Demo.GetFlagResponse>(
                service, METHODID_GET_FLAG)))
        .addMethod(
          getCreateFlagMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              oteldemo.Demo.CreateFlagRequest,
              oteldemo.Demo.CreateFlagResponse>(
                service, METHODID_CREATE_FLAG)))
        .addMethod(
          getUpdateFlagMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              oteldemo.Demo.UpdateFlagRequest,
              oteldemo.Demo.UpdateFlagResponse>(
                service, METHODID_UPDATE_FLAG)))
        .addMethod(
          getListFlagsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              oteldemo.Demo.ListFlagsRequest,
              oteldemo.Demo.ListFlagsResponse>(
                service, METHODID_LIST_FLAGS)))
        .addMethod(
          getDeleteFlagMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              oteldemo.Demo.DeleteFlagRequest,
              oteldemo.Demo.DeleteFlagResponse>(
                service, METHODID_DELETE_FLAG)))
        .build();
  }

  private static abstract class FeatureFlagServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FeatureFlagServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return oteldemo.Demo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FeatureFlagService");
    }
  }

  private static final class FeatureFlagServiceFileDescriptorSupplier
      extends FeatureFlagServiceBaseDescriptorSupplier {
    FeatureFlagServiceFileDescriptorSupplier() {}
  }

  private static final class FeatureFlagServiceMethodDescriptorSupplier
      extends FeatureFlagServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FeatureFlagServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (FeatureFlagServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FeatureFlagServiceFileDescriptorSupplier())
              .addMethod(getGetFlagMethod())
              .addMethod(getCreateFlagMethod())
              .addMethod(getUpdateFlagMethod())
              .addMethod(getListFlagsMethod())
              .addMethod(getDeleteFlagMethod())
              .build();
        }
      }
    }
    return result;
  }
}
