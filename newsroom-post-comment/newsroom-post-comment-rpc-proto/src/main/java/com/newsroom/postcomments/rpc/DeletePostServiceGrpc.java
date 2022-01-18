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
public final class DeletePostServiceGrpc {

  private DeletePostServiceGrpc() {}

  public static final String SERVICE_NAME = "com.newsroom.postcomments.rpc.DeletePostService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.newsroom.postcomments.rpc.PostComments.DeletePostRequest,
      com.newsroom.postcomments.rpc.PostComments.ServiceResponse> METHOD_DELETE_POST =
      io.grpc.MethodDescriptor.<com.newsroom.postcomments.rpc.PostComments.DeletePostRequest, com.newsroom.postcomments.rpc.PostComments.ServiceResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.newsroom.postcomments.rpc.DeletePostService", "deletePost"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.newsroom.postcomments.rpc.PostComments.DeletePostRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.newsroom.postcomments.rpc.PostComments.ServiceResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeletePostServiceStub newStub(io.grpc.Channel channel) {
    return new DeletePostServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeletePostServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DeletePostServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeletePostServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DeletePostServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DeletePostServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void deletePost(com.newsroom.postcomments.rpc.PostComments.DeletePostRequest request,
        io.grpc.stub.StreamObserver<com.newsroom.postcomments.rpc.PostComments.ServiceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_POST, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_DELETE_POST,
            asyncUnaryCall(
              new MethodHandlers<
                com.newsroom.postcomments.rpc.PostComments.DeletePostRequest,
                com.newsroom.postcomments.rpc.PostComments.ServiceResponse>(
                  this, METHODID_DELETE_POST)))
          .build();
    }
  }

  /**
   */
  public static final class DeletePostServiceStub extends io.grpc.stub.AbstractStub<DeletePostServiceStub> {
    private DeletePostServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeletePostServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeletePostServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeletePostServiceStub(channel, callOptions);
    }

    /**
     */
    public void deletePost(com.newsroom.postcomments.rpc.PostComments.DeletePostRequest request,
        io.grpc.stub.StreamObserver<com.newsroom.postcomments.rpc.PostComments.ServiceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_POST, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DeletePostServiceBlockingStub extends io.grpc.stub.AbstractStub<DeletePostServiceBlockingStub> {
    private DeletePostServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeletePostServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeletePostServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeletePostServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.newsroom.postcomments.rpc.PostComments.ServiceResponse deletePost(com.newsroom.postcomments.rpc.PostComments.DeletePostRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_POST, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DeletePostServiceFutureStub extends io.grpc.stub.AbstractStub<DeletePostServiceFutureStub> {
    private DeletePostServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeletePostServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeletePostServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeletePostServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.newsroom.postcomments.rpc.PostComments.ServiceResponse> deletePost(
        com.newsroom.postcomments.rpc.PostComments.DeletePostRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_POST, getCallOptions()), request);
    }
  }

  private static final int METHODID_DELETE_POST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeletePostServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeletePostServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DELETE_POST:
          serviceImpl.deletePost((com.newsroom.postcomments.rpc.PostComments.DeletePostRequest) request,
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

  private static final class DeletePostServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.newsroom.postcomments.rpc.PostComments.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DeletePostServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeletePostServiceDescriptorSupplier())
              .addMethod(METHOD_DELETE_POST)
              .build();
        }
      }
    }
    return result;
  }
}
