package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_B], b: T_B) extends T_A[C, T_B]
case class CC_B[D](a: T_A[D, T_B], b: T_A[D, D], c: T_A[D, T_B]) extends T_A[D, T_B]
case class CC_C(a: (T_A[T_B, T_B],T_A[T_B, T_B])) extends T_B
case class CC_D(a: T_A[T_A[T_B, Int], T_A[Byte, CC_C]]) extends T_B
case class CC_E(a: Int, b: CC_D) extends T_B

val v_a: T_A[Int, T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_C((_,_))) => 0 
  case CC_A(CC_B(_, _, CC_B(_, _, _)), CC_C((_,_))) => 1 
  case CC_A(CC_A(_, _), CC_D(_)) => 2 
  case CC_A(CC_B(_, _, CC_A(_, _)), CC_D(_)) => 3 
  case CC_A(CC_B(_, _, CC_B(_, _, _)), CC_D(_)) => 4 
  case CC_A(CC_A(_, _), CC_E(_, CC_D(_))) => 5 
  case CC_A(CC_B(_, _, CC_A(_, _)), CC_E(_, CC_D(_))) => 6 
  case CC_A(CC_B(_, _, CC_B(_, _, _)), CC_E(_, CC_D(_))) => 7 
  case CC_B(_, _, _) => 8 
}
}
// This is not matched: CC_A(CC_B(_, _, CC_A(_, _)), CC_C((_,_)))