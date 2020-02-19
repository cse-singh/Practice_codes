@extends('layouts.app')

@section('content')
    {{-- <h1>Welcome to Laravel</h1> --}}

    <div class="jumbotron text-center">
        <h1>{{$title}}</h1>
        <p>This is the laravel application from the "Laravel from Scratch" Youtube series</p>    
        <p>
            <a class="btn btn-primary btn-lg" href="{{route('login')}}">Log in</a>
            <a class="btn btn-success btn-lg" href="{{route('register')}}">Register</a>  
        </p>
        

    </div>
    @endsection

