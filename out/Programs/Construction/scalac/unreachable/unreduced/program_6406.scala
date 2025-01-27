package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Char],T_A[Boolean]), b: T_A[Char], c: T_A[Char]) extends T_A[Char]
case class CC_B() extends T_A[Char]
case class CC_C() extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _, _),_), _, CC_A((_,_), CC_A(_, _, _), CC_A(_, _, _))) => 0 
  case CC_A((CC_B(),_), _, CC_A((_,_), CC_A(_, _, _), CC_A(_, _, _))) => 1 
  case CC_A((CC_C(),_), _, CC_A((_,_), CC_A(_, _, _), CC_A(_, _, _))) => 2 
  case CC_A((CC_A(_, _, _),_), _, CC_A((_,_), CC_A(_, _, _), CC_B())) => 3 
  case CC_A((CC_B(),_), _, CC_A((_,_), CC_A(_, _, _), CC_B())) => 4 
  case CC_A((CC_C(),_), _, CC_A((_,_), CC_A(_, _, _), CC_B())) => 5 
  case CC_A((CC_A(_, _, _),_), _, CC_A((_,_), CC_A(_, _, _), CC_C())) => 6 
  case CC_A((CC_B(),_), _, CC_A((_,_), CC_A(_, _, _), CC_C())) => 7 
  case CC_A((CC_C(),_), _, CC_A((_,_), CC_A(_, _, _), CC_C())) => 8 
  case CC_A((CC_A(_, _, _),_), _, CC_A((_,_), CC_B(), CC_A(_, _, _))) => 9 
  case CC_A((CC_B(),_), _, CC_A((_,_), CC_B(), CC_A(_, _, _))) => 10 
  case CC_A((CC_C(),_), _, CC_A((_,_), CC_B(), CC_A(_, _, _))) => 11 
  case CC_A((CC_A(_, _, _),_), _, CC_A((_,_), CC_B(), CC_B())) => 12 
  case CC_A((CC_B(),_), _, CC_A((_,_), CC_B(), CC_B())) => 13 
  case CC_A((CC_C(),_), _, CC_A((_,_), CC_B(), CC_B())) => 14 
  case CC_A((CC_A(_, _, _),_), _, CC_A((_,_), CC_B(), CC_C())) => 15 
  case CC_A((CC_B(),_), _, CC_A((_,_), CC_B(), CC_C())) => 16 
  case CC_A((CC_C(),_), _, CC_A((_,_), CC_B(), CC_C())) => 17 
  case CC_A((CC_A(_, _, _),_), _, CC_A((_,_), CC_C(), CC_A(_, _, _))) => 18 
  case CC_A((CC_B(),_), _, CC_A((_,_), CC_C(), CC_A(_, _, _))) => 19 
  case CC_A((CC_C(),_), _, CC_A((_,_), CC_C(), CC_A(_, _, _))) => 20 
  case CC_A((CC_A(_, _, _),_), _, CC_A((_,_), CC_C(), CC_B())) => 21 
  case CC_A((CC_B(),_), _, CC_A((_,_), CC_C(), CC_B())) => 22 
  case CC_A((CC_C(),_), _, CC_A((_,_), CC_C(), CC_B())) => 23 
  case CC_A((CC_A(_, _, _),_), _, CC_A((_,_), CC_C(), CC_C())) => 24 
  case CC_A((CC_B(),_), _, CC_A((_,_), CC_C(), CC_C())) => 25 
  case CC_A((CC_C(),_), _, CC_A((_,_), CC_C(), CC_C())) => 26 
  case CC_A((CC_A(_, _, _),_), _, CC_B()) => 27 
  case CC_A((CC_B(),_), _, CC_B()) => 28 
  case CC_A((CC_C(),_), _, CC_B()) => 29 
  case CC_A((CC_A(_, _, _),_), _, CC_C()) => 30 
  case CC_A((CC_B(),_), _, CC_C()) => 31 
  case CC_A((CC_C(),_), _, CC_C()) => 32 
  case CC_B() => 33 
  case CC_C() => 34 
}
}