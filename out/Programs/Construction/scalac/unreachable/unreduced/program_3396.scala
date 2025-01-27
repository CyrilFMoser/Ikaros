package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: C, c: T_A[C, T_B]) extends T_A[C, T_B]
case class CC_B[D, E]() extends T_A[D, T_B]
case class CC_C(a: T_A[T_A[T_B, T_B], T_B], b: T_A[Int, CC_B[T_B, T_B]], c: T_A[Byte, T_B]) extends T_B
case class CC_D(a: T_B, b: Int, c: (T_A[T_B, Byte],CC_A[CC_C])) extends T_B
case class CC_E(a: (T_A[T_B, CC_D],CC_D)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), _, CC_A(_, _, _)) => 0 
  case CC_C(CC_A(_, CC_A(_, _, _), CC_B()), _, CC_A(_, _, _)) => 1 
  case CC_C(CC_A(_, CC_B(), CC_A(_, _, _)), _, CC_A(_, _, _)) => 2 
  case CC_C(CC_A(_, CC_B(), CC_B()), _, CC_A(_, _, _)) => 3 
  case CC_C(CC_B(), _, CC_A(_, _, _)) => 4 
  case CC_C(CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), _, CC_B()) => 5 
  case CC_C(CC_A(_, CC_A(_, _, _), CC_B()), _, CC_B()) => 6 
  case CC_C(CC_A(_, CC_B(), CC_B()), _, CC_B()) => 7 
  case CC_C(CC_B(), _, CC_B()) => 8 
  case CC_D(_, _, _) => 9 
  case CC_E(_) => 10 
}
}
// This is not matched: CC_C(CC_A(_, CC_B(), CC_A(_, _, _)), _, CC_B())