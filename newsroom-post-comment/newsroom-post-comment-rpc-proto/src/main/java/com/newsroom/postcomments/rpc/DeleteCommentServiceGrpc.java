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
public final class DeleteCommentServiceGrpc {

  private DeleteCommentServiceGrpc() {}

  public static final String SERVICE_NAME = "com.newsroom.postcomments.rpc.DeleteCommentService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.newsroom.postcomments.rpc.PostComments.DeleteComentRequest,
      com.newsroom.postcomments.rpc.PostComments.ServiceResponse> METHOD_DELETE_COMMENT =
      io.grpc.MethodDescriptor.<com.newsroom.postcomments.rpc.PostComments.DeleteComentRequest, com.newsroom.postcomments.rpc.PostComments.ServiceResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.newsroom.postcomments.rpc.DeleteCommentService", "deleteComment"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.newsroom.postcomments.rpc.PostComments.DeleteComentRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.newsroom.postcomments.rpc.PostComments.ServiceResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeleteCommentServiceStub newStub(io.grpc.Channel channel) {
    return new DeleteCommentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeleteCommentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DeleteCommentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeleteCommentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DeleteCommentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DeleteCommentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void deleteComment(com.newsroom.postcomments.rpc.PostComments.DeleteComentRequest request,
        io.grpc.stub.StreamObserver<com.newsroom.postcomments.rpc.PostComments.ServiceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_COMMENT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_DELETE_COMMENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.newsroom.postcomments.rpc.PostComments.DeleteComentRequest,
                com.newsroom.postcomments.rpc.PostComments.ServiceResponse>(
                  this, METHODID_DELETE_COMMENT)))
          .build();
    }
  }

  /**
   */
  public static final class DeleteCommentServiceStub extends io.grpc.stub.AbstractStub<DeleteCommentServiceStub> {
    private DeleteCommentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeleteCommentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeleteCommentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeleteCommentServiceStub(channel, callOptions);
    }

    /**
     */
    public void deleteComment(com.newsroom.postcomments.rpc.PostComments.DeleteComentRequest request,
        io.grpc.stub.StreamObserver<com.newsroom.postcomments.rpc.PostComments.ServiceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_COMMENT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DeleteCommentServiceBlockingStub extends io.grpc.stub.AbstractStub<DeleteCommentServiceBlockingStub> {
    private DeleteCommentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeleteCommentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeleteCommentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeleteCommentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.newsroom.postcomments.rpc.PostComments.ServiceResponse deleteComment(com.newsroom.postcomments.rpc.PostComments.DeleteComentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_COMMENT, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DeleteCommentServiceFutureStub extends io.grpc.stub.AbstractStub<DeleteCommentServiceFutureStub> {
    private DeleteCommentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeleteCommentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeleteCommentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeleteCommentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.newsroom.postcomments.rpc.PostComments.ServiceResponse> deleteComment(
        com.newsroom.postcomments.rpc.PostComments.DeleteComentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_COMMENT, getCallOptions()), request);
    }
  }

  private static final int METHODID_DELETE_COMMENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeleteCommentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeleteCommentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DELETE_COMMENT:
          serviceImpl.deleteComment((com.newsroom.postcomments.rpc.PostComments.DeleteComentRequest) request,
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

  private static final class DeleteCommentServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.newsroom.postcomments.rpc.PostComments.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DeleteCommentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeleteCommentServiceDescriptorSupplier())
              .addMethod(METHOD_DELETE_COMMENT)
              .build();
        }
      }
    }
    return result;
  }
}
