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
public final class AddCommentServiceGrpc {

  private AddCommentServiceGrpc() {}

  public static final String SERVICE_NAME = "com.newsroom.postcomments.rpc.AddCommentService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.newsroom.postcomments.rpc.PostComments.AddCommentRequest,
      com.newsroom.postcomments.rpc.PostComments.ServiceResponse> METHOD_ADD_COMMENT =
      io.grpc.MethodDescriptor.<com.newsroom.postcomments.rpc.PostComments.AddCommentRequest, com.newsroom.postcomments.rpc.PostComments.ServiceResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.newsroom.postcomments.rpc.AddCommentService", "addComment"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.newsroom.postcomments.rpc.PostComments.AddCommentRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.newsroom.postcomments.rpc.PostComments.ServiceResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AddCommentServiceStub newStub(io.grpc.Channel channel) {
    return new AddCommentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AddCommentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AddCommentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AddCommentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AddCommentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AddCommentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addComment(com.newsroom.postcomments.rpc.PostComments.AddCommentRequest request,
        io.grpc.stub.StreamObserver<com.newsroom.postcomments.rpc.PostComments.ServiceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_COMMENT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ADD_COMMENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.newsroom.postcomments.rpc.PostComments.AddCommentRequest,
                com.newsroom.postcomments.rpc.PostComments.ServiceResponse>(
                  this, METHODID_ADD_COMMENT)))
          .build();
    }
  }

  /**
   */
  public static final class AddCommentServiceStub extends io.grpc.stub.AbstractStub<AddCommentServiceStub> {
    private AddCommentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AddCommentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddCommentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AddCommentServiceStub(channel, callOptions);
    }

    /**
     */
    public void addComment(com.newsroom.postcomments.rpc.PostComments.AddCommentRequest request,
        io.grpc.stub.StreamObserver<com.newsroom.postcomments.rpc.PostComments.ServiceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_COMMENT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AddCommentServiceBlockingStub extends io.grpc.stub.AbstractStub<AddCommentServiceBlockingStub> {
    private AddCommentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AddCommentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddCommentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AddCommentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.newsroom.postcomments.rpc.PostComments.ServiceResponse addComment(com.newsroom.postcomments.rpc.PostComments.AddCommentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_COMMENT, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AddCommentServiceFutureStub extends io.grpc.stub.AbstractStub<AddCommentServiceFutureStub> {
    private AddCommentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AddCommentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddCommentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AddCommentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.newsroom.postcomments.rpc.PostComments.ServiceResponse> addComment(
        com.newsroom.postcomments.rpc.PostComments.AddCommentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_COMMENT, getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_COMMENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AddCommentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AddCommentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_COMMENT:
          serviceImpl.addComment((com.newsroom.postcomments.rpc.PostComments.AddCommentRequest) request,
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

  private static final class AddCommentServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.newsroom.postcomments.rpc.PostComments.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AddCommentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AddCommentServiceDescriptorSupplier())
              .addMethod(METHOD_ADD_COMMENT)
              .build();
        }
      }
    }
    return result;
  }
}
