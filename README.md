# simple-api

This project is a Simple API Project to search city and province in indonesia.

## Technology Stack
1. Java 1.8
2. Spring Framework
3. Spring Boot
4. Maven
5. Spring Tools Suite 4

## API Documentation
Module Name | Path | HTTP Method | Function |
--- | --- | --- | --- |
City | /api/rest/v1/city?name={yourcity} | GET | for search city by city name |
Province | /api/rest/v1/province?name={yourprovince} | GET | for search province by province name |

## Response Data
**City**
```
[
  {
    "city_id": "6",
    "province_id": "21",
    "province": "Nanggroe Aceh Darussalam (NAD)",
    "type": "Kabupaten",
    "city_name": "Aceh Singkil",
    "postal_code": "24785"
  }
]
```

**Province**
```
[
  {
    "province_id": "12",
    "province": "Kalimantan Barat"
  }
]
```

## Where's data from ?
The data's from [Rajaongkir API](https://rajaongkir.com/dokumentasi/starter)

## How to use it ?
1. First clone this repository
2. Open your IDE(STS is recommended)
3. Wait a minutes because it will take a time
4. If it's finished then run this project and test it, have fun ^^
