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
//     return 'This is an user with id '.$id;
// });



// Route::get('/', function () {
//     return view('welcome');
// });


Auth::routes();

Route::get('/home', 'HomeController@index')->name('home');
Route::get('/','PagesController@index')->name('index');
Route::get('/about','PagesController@about')->name('about');
Route::get('/services','PagesController@services')->name('services');

Route::resource('/posts', 'PostsController');


?>