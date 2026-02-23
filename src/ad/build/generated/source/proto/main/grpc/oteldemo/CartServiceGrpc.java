package oteldemo;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: demo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CartServiceGrpc {

  private CartServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "oteldemo.CartService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<oteldemo.Demo.AddItemRequest,
      oteldemo.Demo.Empty> getAddItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddItem",
      requestType = oteldemo.Demo.AddItemRequest.class,
      responseType = oteldemo.Demo.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<oteldemo.Demo.AddItemRequest,
      oteldemo.Demo.Empty> getAddItemMethod() {
    io.grpc.MethodDescriptor<oteldemo.Demo.AddItemRequest, oteldemo.Demo.Empty> getAddItemMethod;
    if ((getAddItemMethod = CartServiceGrpc.getAddItemMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getAddItemMethod = CartServiceGrpc.getAddItemMethod) == null) {
          CartServiceGrpc.getAddItemMethod = getAddItemMethod =
              io.grpc.MethodDescriptor.<oteldemo.Demo.AddItemRequest, oteldemo.Demo.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.AddItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("AddItem"))
              .build();
        }
      }
    }
    return getAddItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<oteldemo.Demo.GetCartRequest,
      oteldemo.Demo.Cart> getGetCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCart",
      requestType = oteldemo.Demo.GetCartRequest.class,
      responseType = oteldemo.Demo.Cart.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<oteldemo.Demo.GetCartRequest,
      oteldemo.Demo.Cart> getGetCartMethod() {
    io.grpc.MethodDescriptor<oteldemo.Demo.GetCartRequest, oteldemo.Demo.Cart> getGetCartMethod;
    if ((getGetCartMethod = CartServiceGrpc.getGetCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getGetCartMethod = CartServiceGrpc.getGetCartMethod) == null) {
          CartServiceGrpc.getGetCartMethod = getGetCartMethod =
              io.grpc.MethodDescriptor.<oteldemo.Demo.GetCartRequest, oteldemo.Demo.Cart>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.GetCartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.Cart.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("GetCart"))
              .build();
        }
      }
    }
    return getGetCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<oteldemo.Demo.EmptyCartRequest,
      oteldemo.Demo.Empty> getEmptyCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EmptyCart",
      requestType = oteldemo.Demo.EmptyCartRequest.class,
      responseType = oteldemo.Demo.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<oteldemo.Demo.EmptyCartRequest,
      oteldemo.Demo.Empty> getEmptyCartMethod() {
    io.grpc.MethodDescriptor<oteldemo.Demo.EmptyCartRequest, oteldemo.Demo.Empty> getEmptyCartMethod;
    if ((getEmptyCartMethod = CartServiceGrpc.getEmptyCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getEmptyCartMethod = CartServiceGrpc.getEmptyCartMethod) == null) {
          CartServiceGrpc.getEmptyCartMethod = getEmptyCartMethod =
              io.grpc.MethodDescriptor.<oteldemo.Demo.EmptyCartRequest, oteldemo.Demo.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EmptyCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.EmptyCartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  oteldemo.Demo.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("EmptyCart"))
              .build();
        }
      }
    }
    return getEmptyCartMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CartServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceStub>() {
        @java.lang.Override
        public CartServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceStub(channel, callOptions);
        }
      };
    return CartServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CartServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceBlockingStub>() {
        @java.lang.Override
        public CartServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceBlockingStub(channel, callOptions);
        }
      };
    return CartServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CartServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceFutureStub>() {
        @java.lang.Override
        public CartServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceFutureStub(channel, callOptions);
        }
      };
    return CartServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void addItem(oteldemo.Demo.AddItemRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddItemMethod(), responseObserver);
    }

    /**
     */
    default void getCart(oteldemo.Demo.GetCartRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.Cart> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCartMethod(), responseObserver);
    }

    /**
     */
    default void emptyCart(oteldemo.Demo.EmptyCartRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEmptyCartMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CartService.
   */
  public static abstract class CartServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CartServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CartService.
   */
  public static final class CartServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CartServiceStub> {
    private CartServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceStub(channel, callOptions);
    }

    /**
     */
    public void addItem(oteldemo.Demo.AddItemRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCart(oteldemo.Demo.GetCartRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.Cart> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void emptyCart(oteldemo.Demo.EmptyCartRequest request,
        io.grpc.stub.StreamObserver<oteldemo.Demo.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEmptyCartMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CartService.
   */
  public static final class CartServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CartServiceBlockingStub> {
    private CartServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public oteldemo.Demo.Empty addItem(oteldemo.Demo.AddItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public oteldemo.Demo.Cart getCart(oteldemo.Demo.GetCartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public oteldemo.Demo.Empty emptyCart(oteldemo.Demo.EmptyCartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEmptyCartMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CartService.
   */
  public static final class CartServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CartServiceFutureStub> {
    private CartServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<oteldemo.Demo.Empty> addItem(
        oteldemo.Demo.AddItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<oteldemo.Demo.Cart> getCart(
        oteldemo.Demo.GetCartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<oteldemo.Demo.Empty> emptyCart(
        oteldemo.Demo.EmptyCartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEmptyCartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_ITEM = 0;
  private static final int METHODID_GET_CART = 1;
  private static final int METHODID_EMPTY_CART = 2;

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
        case METHODID_ADD_ITEM:
          serviceImpl.addItem((oteldemo.Demo.AddItemRequest) request,
              (io.grpc.stub.StreamObserver<oteldemo.Demo.Empty>) responseObserver);
          break;
        case METHODID_GET_CART:
          serviceImpl.getCart((oteldemo.Demo.GetCartRequest) request,
              (io.grpc.stub.StreamObserver<oteldemo.Demo.Cart>) responseObserver);
          break;
        case METHODID_EMPTY_CART:
          serviceImpl.emptyCart((oteldemo.Demo.EmptyCartRequest) request,
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
          getAddItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              oteldemo.Demo.AddItemRequest,
              oteldemo.Demo.Empty>(
                service, METHODID_ADD_ITEM)))
        .addMethod(
          getGetCartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              oteldemo.Demo.GetCartRequest,
              oteldemo.Demo.Cart>(
                service, METHODID_GET_CART)))
        .addMethod(
          getEmptyCartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              oteldemo.Demo.EmptyCartRequest,
              oteldemo.Demo.Empty>(
                service, METHODID_EMPTY_CART)))
        .build();
  }

  private static abstract class CartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CartServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return oteldemo.Demo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CartService");
    }
  }

  private static final class CartServiceFileDescriptorSupplier
      extends CartServiceBaseDescriptorSupplier {
    CartServiceFileDescriptorSupplier() {}
  }

  private static final class CartServiceMethodDescriptorSupplier
      extends CartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CartServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CartServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CartServiceFileDescriptorSupplier())
              .addMethod(getAddItemMethod())
              .addMethod(getGetCartMethod())
              .addMethod(getEmptyCartMethod())
              .build();
        }
      }
    }
    return result;
  }
}
