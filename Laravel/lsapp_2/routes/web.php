<?php

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

// Route::get('/', function () {
//     return view('welcome');
// });

// we never want to return view, instead want a controller to handle that

// Route::get('/users/{id}', function ($id) {
//     return 'This is user '.$id;
// });


// Route::get('/users/{id}/{name}', function ($id,$name) {
//     return 'This is user '.$name.' with an id of '.$id;
// });

Route::get('/', 'PagesController@index');

Route::get('/about', 'PagesController@about');

Route::get('/services', 'PagesController@services');

Auth::routes();

Route::get('/home', 'HomeController@index')->name('home');