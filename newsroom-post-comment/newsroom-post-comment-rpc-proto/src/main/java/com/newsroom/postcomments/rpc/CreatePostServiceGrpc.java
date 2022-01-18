package com.newsroom.postcomments.rpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: postComments.proto")
public final class CreatePostServiceGrpc {

  private CreatePostServiceGrpc() {}

  public static final String SERVICE_NAME = "com.newsroom.postcomments.rpc.CreatePostService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.newsroom.postcomments.rpc.PostComments.CreatePostRequest,
      com.newsroom.postcomments.rpc.PostComments.ServiceResponse> METHOD_CREATE_POST =
      io.grpc.MethodDescriptor.<com.newsroom.postcomments.rpc.PostComments.CreatePostRequest, com.newsroom.postcomments.rpc.PostComments.ServiceResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.newsroom.postcomments.rpc.CreatePostService", "createPost"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.newsroom.postcomments.rpc.PostComments.CreatePostRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.newsroom.postcomments.rpc.PostComments.ServiceResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CreatePostServiceStub newStub(io.grpc.Channel channel) {
    return new CreatePostServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CreatePostServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CreatePostServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CreatePostServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CreatePostServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CreatePostServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createPost(com.newsroom.postcomments.rpc.PostComments.CreatePostRequest request,
        io.grpc.stub.StreamObserver<com.newsroom.postcomments.rpc.PostComments.ServiceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_POST, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_POST,
            asyncUnaryCall(
              new MethodHandlers<
                com.newsroom.postcomments.rpc.PostComments.CreatePostRequest,
                com.newsroom.postcomments.rpc.PostComments.ServiceResponse>(
                  this, METHODID_CREATE_POST)))
          .build();
    }
  }

  /**
   */
  public static final class CreatePostServiceStub extends io.grpc.stub.AbstractStub<CreatePostServiceStub> {
    private CreatePostServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreatePostServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreatePostServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreatePostServiceStub(channel, callOptions);
    }

    /**
     */
    public void createPost(com.newsroom.postcomments.rpc.PostComments.CreatePostRequest request,
        io.grpc.stub.StreamObserver<com.newsroom.postcomments.rpc.PostComments.ServiceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_POST, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CreatePostServiceBlockingStub extends io.grpc.stub.AbstractStub<CreatePostServiceBlockingStub> {
    private CreatePostServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreatePostServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreatePostServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreatePostServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.newsroom.postcomments.rpc.PostComments.ServiceResponse createPost(com.newsroom.postcomments.rpc.PostComments.CreatePostRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_POST, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CreatePostServiceFutureStub extends io.grpc.stub.AbstractStub<CreatePostServiceFutureStub> {
    private CreatePostServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreatePostServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreatePostServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreatePostServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.newsroom.postcomments.rpc.PostComments.ServiceResponse> createPost(
        com.newsroom.postcomments.rpc.PostComments.CreatePostRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_POST, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_POST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CreatePostServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CreatePostServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_POST:
          serviceImpl.createPost((com.newsroom.postcomments.rpc.PostComments.CreatePostRequest) request,
              (io.grpc.stub.StreamObserver<com.newsroom.postcomments.rpc.PostComments.ServiceResponse>) responseObserver);
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

  private static final class CreatePostServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.newsroom.postcomments.rpc.PostComments.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CreatePostServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CreatePostServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE_POST)
              .build();
        }
      }
    }
    return result;
  }
}
