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
public final class UpdateCommentServiceGrpc {

  private UpdateCommentServiceGrpc() {}

  public static final String SERVICE_NAME = "com.newsroom.postcomments.rpc.UpdateCommentService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.newsroom.postcomments.rpc.PostComments.UpdateCommentRequest,
      com.newsroom.postcomments.rpc.PostComments.ServiceResponse> METHOD_UPDATE_COMMENT =
      io.grpc.MethodDescriptor.<com.newsroom.postcomments.rpc.PostComments.UpdateCommentRequest, com.newsroom.postcomments.rpc.PostComments.ServiceResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.newsroom.postcomments.rpc.UpdateCommentService", "updateComment"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.newsroom.postcomments.rpc.PostComments.UpdateCommentRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.newsroom.postcomments.rpc.PostComments.ServiceResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UpdateCommentServiceStub newStub(io.grpc.Channel channel) {
    return new UpdateCommentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UpdateCommentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UpdateCommentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UpdateCommentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UpdateCommentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UpdateCommentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void updateComment(com.newsroom.postcomments.rpc.PostComments.UpdateCommentRequest request,
        io.grpc.stub.StreamObserver<com.newsroom.postcomments.rpc.PostComments.ServiceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_COMMENT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_UPDATE_COMMENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.newsroom.postcomments.rpc.PostComments.UpdateCommentRequest,
                com.newsroom.postcomments.rpc.PostComments.ServiceResponse>(
                  this, METHODID_UPDATE_COMMENT)))
          .build();
    }
  }

  /**
   */
  public static final class UpdateCommentServiceStub extends io.grpc.stub.AbstractStub<UpdateCommentServiceStub> {
    private UpdateCommentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UpdateCommentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateCommentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UpdateCommentServiceStub(channel, callOptions);
    }

    /**
     */
    public void updateComment(com.newsroom.postcomments.rpc.PostComments.UpdateCommentRequest request,
        io.grpc.stub.StreamObserver<com.newsroom.postcomments.rpc.PostComments.ServiceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_COMMENT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UpdateCommentServiceBlockingStub extends io.grpc.stub.AbstractStub<UpdateCommentServiceBlockingStub> {
    private UpdateCommentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UpdateCommentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateCommentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UpdateCommentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.newsroom.postcomments.rpc.PostComments.ServiceResponse updateComment(com.newsroom.postcomments.rpc.PostComments.UpdateCommentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_COMMENT, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UpdateCommentServiceFutureStub extends io.grpc.stub.AbstractStub<UpdateCommentServiceFutureStub> {
    private UpdateCommentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UpdateCommentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateCommentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UpdateCommentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.newsroom.postcomments.rpc.PostComments.ServiceResponse> updateComment(
        com.newsroom.postcomments.rpc.PostComments.UpdateCommentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_COMMENT, getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_COMMENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UpdateCommentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UpdateCommentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_COMMENT:
          serviceImpl.updateComment((com.newsroom.postcomments.rpc.PostComments.UpdateCommentRequest) request,
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

  private static final class UpdateCommentServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.newsroom.postcomments.rpc.PostComments.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UpdateCommentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UpdateCommentServiceDescriptorSupplier())
              .addMethod(METHOD_UPDATE_COMMENT)
              .build();
        }
      }
    }
    return result;
  }
}
