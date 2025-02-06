# OOP [ Object Oriented Programming ]

Real world object ko agr programming me lana hu tu hum OOP ka use krte he.

ab kiya hoti he `class`, kiya hote he `object`.

## Class 
Kisi bhi object ka blue print hota he jo ye define krta he k jo objject bne ga wo kis trh se show hoga.
us me kiya kiya property `attribute` hogi, wo kiya kiya action `method` perform kr skta he.

- **Attribute:** Object kis trh ka data apne pass rkh skta he.
- **Method:** Object ks ks drh k action ko perform kr skta he.

## Object
Ye wo real world entity he object he jo us class ki instruction ko follow kr k banaya gyaa he.

## `this` Keyword
`this` ka keyword hamare class ko ye identify kraa ta he k given function us k ks entity ya object se hua he.

## Constructor
Ye special type k function/ method he jo kisi bhi class k object ko construct krne/banane k liye use hote he.
Kisi bhi object ko banane k liye constructor ka use hota he jo btaye ga k hm koi Object create krna chahte he.

***Note:**
Hr class ka ek by-default constructor hota he jo Java khd se create kr deta he class bnate hi.

#### Properties of Constructor:
1. class ka naam aur constructor ka naam same hoga.
2. Constructor kch return nhi krte.
3. ek object k liye srf ek hi baar constructor call hoga.

#### Types of Constructor:
- Non-Parameterize Constructor. 
- Parameterize Constructor
- Copy Constructor -> Ek object ko copy kr k dusre Object me daal dena. 
Copy constructor bnaya he tu sath hi non-parameterize constructor bhi bnana pre ga.

## Destructure:
- Cpp me Destructure blkl constructor ki trh likhe jaate he
- Java me Destructure automatically run ho jaate he aur jo garbage collection hoti he unko remove kr dete he.

## Pillars of OOP:
There are four main pillar of OOP:
- Abstraction
- Encapsulation
- Inheritance
- Polymorphism

### Polymorphism:
The word polymorphism create with two words
- Poly means many/multiple
- morphism means form

Jb hm java ek hi kaam ko ko alg alg tariqon se krte he tu usko hm kehte he polymorphism.

#### Types of Polymorphism:
There are two types of polymorphism:
- Function overloading - Compile time polymorphism
- Function overriding - Run time polymorphism

##### Compile Type Polymorphism [ Function overloading ]:
- Same naam k function alg alg kaam kr rhe hote he.
- Ye compile time me check hota he k user ne polymorphism ko likhte hue khi koi mistake/galti tu nhi krdi.
- Polymorphism define krte waat y dekhna hota he k in me koi differentiate factor hona laazmi he.
    - ya tu inke return type alg alg hu
    - ya tu iske argument alg alg hu
    - ya iske number of argument different hu


### Inheritence (Virasat): 
Kisi ek generation se dusri generation tk data ko pass krna.
Like agr kisi k father ki color eyes he tu unki aulaad ki bhi colorful eyes hogi.

ab java me ek class ki properties aur methods ko dusri class ki properties tk pass krne k process ko hm `Inheritence` kehte he.

- Base Class: Js class se properties lete he [Parent Class].
- Sub Class: Js class ko properties dete he [Child Class].

#### Types of Inheritance:
- Single Level Inheritance: Ek base class hogi aur us se ek derive class nikle gi.
- MultiLevel Inheritance: Yani jo derive class wo bhi kisi aur shape ki base class bn gayi.
- Hierarchical Inheritance: Ek hi Base class he aur uski Multiple Derive Class hu. 
- Hybrid Inheritance: Combination of above inheritance type.


***Note** 
`C++` me ek type aur hoti he jsko hm `multiple inheritence` kehte he.

#### Keywords in Inheritence:
- **extends**: ye keywords hm use krte he ek class ko dusri class me inherit krne k liye. 
- **super:** agr hm ko child class me rehte hue parent class k attributes aur methods ko access krna hu tu hm super keywords ki help se kre ge.


### Encapsulation:
Data aur methods ko ek object ke andar bundle karna.
Ek class k data ko aur uske fuction ko ek hi packet me rkh dena aur uski internal detail ko hide krna ta ke koi bhi usko aa kr change naa kr sake. 

Data ko hide krne k liye use hota he.

Is k liye hm private access modifier aur getter and setter ka use krte he.

```text
Packages:
Combination of same thing like folder, hm apne project ko packages me bind kre ge ta k hm sb ko ek group me rkh sake.

- Built in Packages: Jo Java me already hote he
- User define Package: Jo user define krta he.


Access Modifiers:
ye define krna kn si chez ka access ks ko hona chahiye
kn se attributes aur kn se methods kn kn class ko access hu.
Help krta he sensitive information ko hide krne me.

Types of Access Modifier:
1. - Public: Jo sb k liye available hu. khi se bhi isko access kr skta he same class ya different class. 
2. - Private: jsko srf usi class me rehte hue use kiya jaaye us class se bahir koi bhi usko access nhi kr skta. 
3. - Default: agr hm khd se koi modifier nhi lagate tu wo default modifier ho ta he. Apna package me sb usko use kr skte he. dusre package se koi bhi usko access nhi kr skta.
4. - Protected: Apna package me tu sb usko access kr skti he, but agr dusre package me use krna he tu usko srf uski sub class hi access kr skti he.

Getter and Setters:
- Getter: Jo Private values ki value ko get kr k laa kr de.
- Setter: Jo Private values ki value ko set krne k liye use hu.


```

### Abstraction:
Abstraction ka matlab he user ko srf wohi dikhana jitni usko zaroorat he baqi inner details ko user se chupa lena.
User ko srf important chez hi dikhai jaaye.

Ek khayal he jo sach nhi he ya jo exist nhi krta he yani wo koi real me object nhi he bs wo khayal js ko hm different object me dekh rhe hote he.

### Interfaces:
Complete Abstraction ko show krta he.
Interface ko hm implement krte he
