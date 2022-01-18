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
public final class UserLikeServiceGrpc {

  private UserLikeServiceGrpc() {}

  public static final String SERVICE_NAME = "com.newsroom.postcomments.rpc.UserLikeService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.newsroom.postcomments.rpc.PostComments.UserLikeRequest,
      com.newsroom.postcomments.rpc.PostComments.ServiceResponse> METHOD_LIKE =
      io.grpc.MethodDescriptor.<com.newsroom.postcomments.rpc.PostComments.UserLikeRequest, com.newsroom.postcomments.rpc.PostComments.ServiceResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.newsroom.postcomments.rpc.UserLikeService", "like"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.newsroom.postcomments.rpc.PostComments.UserLikeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.newsroom.postcomments.rpc.PostComments.ServiceResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserLikeServiceStub newStub(io.grpc.Channel channel) {
    return new UserLikeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserLikeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserLikeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserLikeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserLikeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserLikeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void like(com.newsroom.postcomments.rpc.PostComments.UserLikeRequest request,
        io.grpc.stub.StreamObserver<com.newsroom.postcomments.rpc.PostComments.ServiceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIKE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIKE,
            asyncUnaryCall(
              new MethodHandlers<
                com.newsroom.postcomments.rpc.PostComments.UserLikeRequest,
                com.newsroom.postcomments.rpc.PostComments.ServiceResponse>(
                  this, METHODID_LIKE)))
          .build();
    }
  }

  /**
   */
  public static final class UserLikeServiceStub extends io.grpc.stub.AbstractStub<UserLikeServiceStub> {
    private UserLikeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserLikeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserLikeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserLikeServiceStub(channel, callOptions);
    }

    /**
     */
    public void like(com.newsroom.postcomments.rpc.PostComments.UserLikeRequest request,
        io.grpc.stub.StreamObserver<com.newsroom.postcomments.rpc.PostComments.ServiceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIKE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserLikeServiceBlockingStub extends io.grpc.stub.AbstractStub<UserLikeServiceBlockingStub> {
    private UserLikeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserLikeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserLikeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserLikeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.newsroom.postcomments.rpc.PostComments.ServiceResponse like(com.newsroom.postcomments.rpc.PostComments.UserLikeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIKE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserLikeServiceFutureStub extends io.grpc.stub.AbstractStub<UserLikeServiceFutureStub> {
    private UserLikeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserLikeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserLikeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserLikeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.newsroom.postcomments.rpc.PostComments.ServiceResponse> like(
        com.newsroom.postcomments.rpc.PostComments.UserLikeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIKE, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIKE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserLikeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserLikeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIKE:
          serviceImpl.like((com.newsroom.postcomments.rpc.PostComments.UserLikeRequest) request,
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

  private static final class UserLikeServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.newsroom.postcomments.rpc.PostComments.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserLikeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserLikeServiceDescriptorSupplier())
              .addMethod(METHOD_LIKE)
              .build();
        }
      }
    }
    return result;
  }
}
