package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: T_A[B], c: T_A[B]) extends T_A[B]
case class CC_B[C]() extends T_A[C]
case class CC_C[D, E](a: T_A[D], b: (T_A[Boolean],Char), c: CC_A[E]) extends T_A[D]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 0 
  case CC_A(_, CC_A(_, _, _), CC_A(_, CC_B(), CC_A(_, _, _))) => 1 
  case CC_A(_, CC_A(_, _, _), CC_A(_, CC_C(_, _, _), CC_A(_, _, _))) => 2 
  case CC_A(_, CC_A(_, _, _), CC_A(_, CC_A(_, _, _), CC_B())) => 3 
  case CC_A(_, CC_A(_, _, _), CC_A(_, CC_B(), CC_B())) => 4 
  case CC_A(_, CC_A(_, _, _), CC_A(_, CC_C(_, _, _), CC_B())) => 5 
  case CC_A(_, CC_A(_, _, _), CC_A(_, CC_A(_, _, _), CC_C(_, _, _))) => 6 
  case CC_A(_, CC_A(_, _, _), CC_A(_, CC_B(), CC_C(_, _, _))) => 7 
  case CC_A(_, CC_A(_, _, _), CC_A(_, CC_C(_, _, _), CC_C(_, _, _))) => 8 
  case CC_A(_, CC_A(_, _, _), CC_B()) => 9 
  case CC_A(_, CC_A(_, _, _), CC_C(CC_A(_, _, _), (_,_), _)) => 10 
  case CC_A(_, CC_A(_, _, _), CC_C(CC_B(), (_,_), _)) => 11 
  case CC_A(_, CC_A(_, _, _), CC_C(CC_C(_, _, _), (_,_), _)) => 12 
  case CC_A(_, CC_B(), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 13 
  case CC_A(_, CC_B(), CC_A(_, CC_B(), CC_A(_, _, _))) => 14 
  case CC_A(_, CC_B(), CC_A(_, CC_C(_, _, _), CC_A(_, _, _))) => 15 
  case CC_A(_, CC_B(), CC_A(_, CC_A(_, _, _), CC_B())) => 16 
  case CC_A(_, CC_B(), CC_A(_, CC_B(), CC_B())) => 17 
  case CC_A(_, CC_B(), CC_A(_, CC_C(_, _, _), CC_B())) => 18 
  case CC_A(_, CC_B(), CC_A(_, CC_A(_, _, _), CC_C(_, _, _))) => 19 
  case CC_A(_, CC_B(), CC_A(_, CC_B(), CC_C(_, _, _))) => 20 
  case CC_A(_, CC_B(), CC_A(_, CC_C(_, _, _), CC_C(_, _, _))) => 21 
  case CC_A(_, CC_B(), CC_B()) => 22 
  case CC_A(_, CC_B(), CC_C(CC_A(_, _, _), (_,_), _)) => 23 
  case CC_A(_, CC_B(), CC_C(CC_B(), (_,_), _)) => 24 
  case CC_A(_, CC_B(), CC_C(CC_C(_, _, _), (_,_), _)) => 25 
  case CC_A(_, CC_C(_, (_,_), _), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 26 
  case CC_A(_, CC_C(_, (_,_), _), CC_A(_, CC_B(), CC_A(_, _, _))) => 27 
  case CC_A(_, CC_C(_, (_,_), _), CC_A(_, CC_C(_, _, _), CC_A(_, _, _))) => 28 
  case CC_A(_, CC_C(_, (_,_), _), CC_A(_, CC_A(_, _, _), CC_B())) => 29 
  case CC_A(_, CC_C(_, (_,_), _), CC_A(_, CC_B(), CC_B())) => 30 
  case CC_A(_, CC_C(_, (_,_), _), CC_A(_, CC_C(_, _, _), CC_B())) => 31 
  case CC_A(_, CC_C(_, (_,_), _), CC_A(_, CC_A(_, _, _), CC_C(_, _, _))) => 32 
  case CC_A(_, CC_C(_, (_,_), _), CC_A(_, CC_B(), CC_C(_, _, _))) => 33 
  case CC_A(_, CC_C(_, (_,_), _), CC_A(_, CC_C(_, _, _), CC_C(_, _, _))) => 34 
  case CC_A(_, CC_C(_, (_,_), _), CC_B()) => 35 
  case CC_A(_, CC_C(_, (_,_), _), CC_C(CC_A(_, _, _), (_,_), _)) => 36 
  case CC_A(_, CC_C(_, (_,_), _), CC_C(CC_B(), (_,_), _)) => 37 
  case CC_A(_, CC_C(_, (_,_), _), CC_C(CC_C(_, _, _), (_,_), _)) => 38 
  case CC_B() => 39 
  case CC_C(_, _, _) => 40 
}
}