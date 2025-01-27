package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Char, b: C) extends T_A[C]
case class CC_B() extends T_A[T_A[CC_A[Char]]]
case class CC_C[D](a: (T_A[Byte],T_B[CC_B]), b: D, c: T_A[D]) extends T_A[D]

val v_a: T_A[T_A[CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C((CC_A(_, _),_), CC_A(_, _), CC_A(_, CC_A(_, _))) => 1 
  case CC_C((CC_C(_, _, _),_), CC_A(_, _), CC_A(_, CC_A(_, _))) => 2 
  case CC_C((CC_A(_, _),_), CC_C((_,_), _, CC_A(_, _)), CC_A(_, CC_A(_, _))) => 3 
  case CC_C((CC_C(_, _, _),_), CC_C((_,_), _, CC_A(_, _)), CC_A(_, CC_A(_, _))) => 4 
  case CC_C((CC_A(_, _),_), CC_C((_,_), _, CC_C(_, _, _)), CC_A(_, CC_A(_, _))) => 5 
  case CC_C((CC_C(_, _, _),_), CC_C((_,_), _, CC_C(_, _, _)), CC_A(_, CC_A(_, _))) => 6 
  case CC_C((CC_A(_, _),_), CC_A(_, _), CC_A(_, CC_C(_, _, _))) => 7 
  case CC_C((CC_C(_, _, _),_), CC_A(_, _), CC_A(_, CC_C(_, _, _))) => 8 
  case CC_C((CC_A(_, _),_), CC_C((_,_), _, CC_A(_, _)), CC_A(_, CC_C(_, _, _))) => 9 
  case CC_C((CC_C(_, _, _),_), CC_C((_,_), _, CC_A(_, _)), CC_A(_, CC_C(_, _, _))) => 10 
  case CC_C((CC_A(_, _),_), CC_C((_,_), _, CC_C(_, _, _)), CC_A(_, CC_C(_, _, _))) => 11 
  case CC_C((CC_C(_, _, _),_), CC_C((_,_), _, CC_C(_, _, _)), CC_A(_, CC_C(_, _, _))) => 12 
  case CC_C((CC_A(_, _),_), CC_A(_, _), CC_B()) => 13 
  case CC_C((CC_C(_, _, _),_), CC_A(_, _), CC_B()) => 14 
  case CC_C((CC_A(_, _),_), CC_C((_,_), _, CC_A(_, _)), CC_B()) => 15 
  case CC_C((CC_C(_, _, _),_), CC_C((_,_), _, CC_A(_, _)), CC_B()) => 16 
  case CC_C((CC_A(_, _),_), CC_C((_,_), _, CC_C(_, _, _)), CC_B()) => 17 
  case CC_C((CC_C(_, _, _),_), CC_C((_,_), _, CC_C(_, _, _)), CC_B()) => 18 
  case CC_C((CC_A(_, _),_), CC_A(_, _), CC_C(_, CC_A(_, _), _)) => 19 
  case CC_C((CC_C(_, _, _),_), CC_A(_, _), CC_C(_, CC_A(_, _), _)) => 20 
  case CC_C((CC_A(_, _),_), CC_C((_,_), _, CC_A(_, _)), CC_C(_, CC_A(_, _), _)) => 21 
  case CC_C((CC_C(_, _, _),_), CC_C((_,_), _, CC_A(_, _)), CC_C(_, CC_A(_, _), _)) => 22 
  case CC_C((CC_A(_, _),_), CC_C((_,_), _, CC_C(_, _, _)), CC_C(_, CC_A(_, _), _)) => 23 
  case CC_C((CC_C(_, _, _),_), CC_C((_,_), _, CC_C(_, _, _)), CC_C(_, CC_A(_, _), _)) => 24 
  case CC_C((CC_A(_, _),_), CC_A(_, _), CC_C(_, CC_C(_, _, _), _)) => 25 
  case CC_C((CC_C(_, _, _),_), CC_A(_, _), CC_C(_, CC_C(_, _, _), _)) => 26 
  case CC_C((CC_A(_, _),_), CC_C((_,_), _, CC_A(_, _)), CC_C(_, CC_C(_, _, _), _)) => 27 
  case CC_C((CC_C(_, _, _),_), CC_C((_,_), _, CC_A(_, _)), CC_C(_, CC_C(_, _, _), _)) => 28 
  case CC_C((CC_A(_, _),_), CC_C((_,_), _, CC_C(_, _, _)), CC_C(_, CC_C(_, _, _), _)) => 29 
  case CC_C((CC_C(_, _, _),_), CC_C((_,_), _, CC_C(_, _, _)), CC_C(_, CC_C(_, _, _), _)) => 30 
}
}
// This is not matched: CC_B()