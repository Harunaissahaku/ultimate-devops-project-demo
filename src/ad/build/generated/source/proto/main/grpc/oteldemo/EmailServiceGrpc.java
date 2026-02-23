package oteldemo;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: demo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EmailServiceGrpc {

  private EmailServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "oteldemo.EmailService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<oteldemo.Demo.SendOrderConfirmationRequest,
      oteldemo.Demo.Empty> getSendOrderConfirmationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendOrderConfirmation",
      requestType = oteldemo.Demo.SendOrderConfirmationRequest.class,
      responseType = oteldemo.Demo.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<oteldemo.Demo.SendOrderConfirmationRequest,
      oteldemo.Demo.Empty> getSendOrderConfirmationMethod() {
    io.grpc.MethodDescriptor<oteldemo.Demo.SendOrderConfirmationRequest, oteldemo.Demo.Empty> getSendOrderConfirmationMethod;
    if ((getSendOrderConfirmationMethod = EmailServiceGrpc.getSendOrderConfirmationMethod) == null) {
      synchronized (EmailServiceGrpc.class) {
        if ((getSendOrderConfirmationMethod = EmailServiceGrpc.getSendOrderConfirmationMethod) == null) {
          EmailServiceGrpc.getSendOrderConfirmationMethod = getSendOrderConfirmationMethod =
              io.grpc.MethodDescriptor.<oteldemo.Demo.SendOrderConfirmationRequest, oteldemo.Demo.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendOrderConfirmation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.SendOrderConfirmationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("SendOrderConfirmation"))
              .build();
        }
      }
    }
    return getSendOrderConfirmationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmailServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmailServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmailServiceStub>() {
        @java.lang.Override
        public EmailServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmailServiceStub(channel, callOptions);
        }
      };
    return EmailServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmailServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmailServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmailServiceBlockingStub>() {
        @java.lang.Override
        public EmailServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmailServiceBlockingStub(channel, callOptions);
        }
      };
    return EmailServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmailServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmailServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmailServiceFutureStub>() {
        @java.lang.Override
        public EmailServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmailServiceFutureStub(channel, callOptions);
        }
      };
    return EmailServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void sendOrderConfirmation(oteldemo.Demo.SendOrderConfirmationRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendOrderConfirmationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EmailService.
   */
  public static abstract class EmailServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EmailServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EmailService.
   */
  public static final class EmailServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EmailServiceStub> {
    private EmailServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmailServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmailServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendOrderConfirmation(oteldemo.Demo.SendOrderConfirmationRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendOrderConfirmationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EmailService.
   */
  public static final class EmailServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EmailServiceBlockingStub> {
    private EmailServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmailServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmailServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public oteldemo.Demo.Empty sendOrderConfirmation(oteldemo.Demo.SendOrderConfirmationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendOrderConfirmationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EmailService.
   */
  public static final class EmailServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EmailServiceFutureStub> {
    private EmailServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmailServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmailServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<oteldemo.Demo.Empty> sendOrderConfirmation(
        oteldemo.Demo.SendOrderConfirmationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendOrderConfirmationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_ORDER_CONFIRMATION = 0;

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
        case METHODID_SEND_ORDER_CONFIRMATION:
          serviceImpl.sendOrderConfirmation((oteldemo.Demo.SendOrderConfirmationRequest) request,
              (io.grpc.stub.StreamObserver<oteldemo.Demo.Empty>) responseObserver);
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
          getSendOrderConfirmationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              oteldemo.Demo.SendOrderConfirmationRequest,
              oteldemo.Demo.Empty>(
                service, METHODID_SEND_ORDER_CONFIRMATION)))
        .build();
  }

  private static abstract class EmailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmailServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return oteldemo.Demo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmailService");
    }
  }

  private static final class EmailServiceFileDescriptorSupplier
      extends EmailServiceBaseDescriptorSupplier {
    EmailServiceFileDescriptorSupplier() {}
  }

  private static final class EmailServiceMethodDescriptorSupplier
      extends EmailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EmailServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EmailServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmailServiceFileDescriptorSupplier())
              .addMethod(getSendOrderConfirmationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
