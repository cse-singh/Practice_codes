@extends('layouts.app')

@section('content')
    <a href="/posts" class="btn btn-outline-dark">Go Back</a>
    <br><br><br>
    <h1>{{$post->title}}</h1>
    <div>
        {!!$post->body!!}
    </div>
    <hr>
    <small>Written on {{$post->created_at}}</small>
    <br>
    <a href="/posts/{{$post->id}}/edit" class="btn btn-dark">Edit Post</a>

    {!!Form::open(['action' => ['PostsController@destroy',$post->id], 'method' => 'POST', 'class' => 'float-right'])!!}
        {{Form::hidden('_method','DELETE')}}
        {{Form::submit('Delete', ['class' => 'btn btn-danger'])}}
    {!!Form::close()!!}
@endsection 