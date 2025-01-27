package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C, T_B]) extends T_A[C, T_B]
case class CC_B[D](a: CC_A[D], b: T_B, c: CC_A[D]) extends T_A[D, T_B]
case class CC_C[E]() extends T_A[E, T_B]
case class CC_D(a: T_B, b: T_A[T_A[T_B, (Boolean,Char)], Boolean], c: (T_A[Boolean, T_B],Char)) extends T_B
case class CC_E(a: T_A[T_A[Byte, T_B], T_B], b: CC_B[((Int,Int),T_B)]) extends T_B

val v_a: T_A[Byte, T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(CC_D(_, _, _), _, (_,_)), CC_A(_, _)) => 0 
  case CC_A(CC_D(CC_E(_, _), _, (_,_)), CC_A(_, _)) => 1 
  case CC_A(CC_E(CC_A(_, _), CC_B(_, _, _)), CC_A(_, _)) => 2 
  case CC_A(CC_E(CC_B(_, _, _), CC_B(_, _, _)), CC_A(_, _)) => 3 
  case CC_A(CC_E(CC_C(), CC_B(_, _, _)), CC_A(_, _)) => 4 
  case CC_A(CC_D(CC_D(_, _, _), _, (_,_)), CC_B(_, CC_D(_, _, _), CC_A(_, _))) => 5 
  case CC_A(CC_D(CC_E(_, _), _, (_,_)), CC_B(_, CC_D(_, _, _), CC_A(_, _))) => 6 
  case CC_A(CC_E(CC_A(_, _), CC_B(_, _, _)), CC_B(_, CC_D(_, _, _), CC_A(_, _))) => 7 
  case CC_A(CC_E(CC_B(_, _, _), CC_B(_, _, _)), CC_B(_, CC_D(_, _, _), CC_A(_, _))) => 8 
  case CC_A(CC_E(CC_C(), CC_B(_, _, _)), CC_B(_, CC_D(_, _, _), CC_A(_, _))) => 9 
  case CC_A(CC_D(CC_D(_, _, _), _, (_,_)), CC_B(_, CC_E(_, _), CC_A(_, _))) => 10 
  case CC_A(CC_D(CC_E(_, _), _, (_,_)), CC_B(_, CC_E(_, _), CC_A(_, _))) => 11 
  case CC_A(CC_E(CC_A(_, _), CC_B(_, _, _)), CC_B(_, CC_E(_, _), CC_A(_, _))) => 12 
  case CC_A(CC_E(CC_B(_, _, _), CC_B(_, _, _)), CC_B(_, CC_E(_, _), CC_A(_, _))) => 13 
  case CC_A(CC_E(CC_C(), CC_B(_, _, _)), CC_B(_, CC_E(_, _), CC_A(_, _))) => 14 
  case CC_A(CC_D(CC_D(_, _, _), _, (_,_)), CC_C()) => 15 
  case CC_A(CC_D(CC_E(_, _), _, (_,_)), CC_C()) => 16 
  case CC_A(CC_E(CC_A(_, _), CC_B(_, _, _)), CC_C()) => 17 
  case CC_A(CC_E(CC_B(_, _, _), CC_B(_, _, _)), CC_C()) => 18 
  case CC_A(CC_E(CC_C(), CC_B(_, _, _)), CC_C()) => 19 
  case CC_B(CC_A(CC_D(_, _, _), CC_A(_, _)), _, _) => 20 
  case CC_B(CC_A(CC_D(_, _, _), CC_B(_, _, _)), _, _) => 21 
  case CC_B(CC_A(CC_E(_, _), CC_A(_, _)), _, _) => 22 
  case CC_B(CC_A(CC_E(_, _), CC_B(_, _, _)), _, _) => 23 
  case CC_B(CC_A(CC_E(_, _), CC_C()), _, _) => 24 
  case CC_C() => 25 
}
}
// This is not matched: CC_B(CC_A(CC_D(_, _, _), CC_C()), _, _)