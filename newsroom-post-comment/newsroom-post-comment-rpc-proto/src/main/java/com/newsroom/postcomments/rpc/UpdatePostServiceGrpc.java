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
public final class UpdatePostServiceGrpc {

  private UpdatePostServiceGrpc() {}

  public static final String SERVICE_NAME = "com.newsroom.postcomments.rpc.UpdatePostService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.newsroom.postcomments.rpc.PostComments.UpdatePostRequest,
      com.newsroom.postcomments.rpc.PostComments.ServiceResponse> METHOD_UPDATE_POST =
      io.grpc.MethodDescriptor.<com.newsroom.postcomments.rpc.PostComments.UpdatePostRequest, com.newsroom.postcomments.rpc.PostComments.ServiceResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.newsroom.postcomments.rpc.UpdatePostService", "updatePost"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.newsroom.postcomments.rpc.PostComments.UpdatePostRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.newsroom.postcomments.rpc.PostComments.ServiceResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UpdatePostServiceStub newStub(io.grpc.Channel channel) {
    return new UpdatePostServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UpdatePostServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UpdatePostServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UpdatePostServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UpdatePostServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UpdatePostServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void updatePost(com.newsroom.postcomments.rpc.PostComments.UpdatePostRequest request,
        io.grpc.stub.StreamObserver<com.newsroom.postcomments.rpc.PostComments.ServiceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_POST, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_UPDATE_POST,
            asyncUnaryCall(
              new MethodHandlers<
                com.newsroom.postcomments.rpc.PostComments.UpdatePostRequest,
                com.newsroom.postcomments.rpc.PostComments.ServiceResponse>(
                  this, METHODID_UPDATE_POST)))
          .build();
    }
  }

  /**
   */
  public static final class UpdatePostServiceStub extends io.grpc.stub.AbstractStub<UpdatePostServiceStub> {
    private UpdatePostServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UpdatePostServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdatePostServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UpdatePostServiceStub(channel, callOptions);
    }

    /**
     */
    public void updatePost(com.newsroom.postcomments.rpc.PostComments.UpdatePostRequest request,
        io.grpc.stub.StreamObserver<com.newsroom.postcomments.rpc.PostComments.ServiceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_POST, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UpdatePostServiceBlockingStub extends io.grpc.stub.AbstractStub<UpdatePostServiceBlockingStub> {
    private UpdatePostServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UpdatePostServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdatePostServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UpdatePostServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.newsroom.postcomments.rpc.PostComments.ServiceResponse updatePost(com.newsroom.postcomments.rpc.PostComments.UpdatePostRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_POST, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UpdatePostServiceFutureStub extends io.grpc.stub.AbstractStub<UpdatePostServiceFutureStub> {
    private UpdatePostServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UpdatePostServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdatePostServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UpdatePostServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.newsroom.postcomments.rpc.PostComments.ServiceResponse> updatePost(
        com.newsroom.postcomments.rpc.PostComments.UpdatePostRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_POST, getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_POST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UpdatePostServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UpdatePostServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_POST:
          serviceImpl.updatePost((com.newsroom.postcomments.rpc.PostComments.UpdatePostRequest) request,
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

  private static final class UpdatePostServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.newsroom.postcomments.rpc.PostComments.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UpdatePostServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UpdatePostServiceDescriptorSupplier())
              .addMethod(METHOD_UPDATE_POST)
              .build();
        }
      }
    }
    return result;
  }
}
