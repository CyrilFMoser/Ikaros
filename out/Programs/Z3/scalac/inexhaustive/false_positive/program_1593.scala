package Program_31 

package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: Byte, b: B) extends T_A[B]
case class CC_B(a: T_B, b: T_A[T_B], c: T_A[T_B]) extends T_A[T_B]
case class CC_C[C](a: (Byte,CC_B), b: CC_B, c: T_A[T_B]) extends T_B
case class CC_D(a: T_A[Byte], b: CC_C[T_B], c: T_A[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C(_, _, _), _) => 0 
  case CC_D(_, _, CC_B(_, _, _)) => 1 
  case CC_D(CC_A(_, _), _, _) => 2 
  case CC_D(_, _, CC_A(_, _)) => 3 
  case CC_D(CC_A(_, _), CC_C(_, _, _), _) => 4 
  case CC_D(CC_A(_, _), _, CC_A(_, _)) => 5 
  case CC_C((0,CC_B(_, _, _)), CC_B(_, _, _), _) => 6 
  case CC_C((_,CC_B(_, _, _)), CC_B(_, _, _), CC_A(_, _)) => 7 
  case CC_C((_,CC_B(_, _, _)), _, CC_B(_, _, _)) => 8 
  case CC_C(_, _, _) => 9 
  case CC_C((0,CC_B(_, _, _)), CC_B(_, _, _), CC_A(_, _)) => 10 
  case CC_C((0,CC_B(_, _, _)), CC_B(_, _, _), CC_B(_, _, _)) => 11 
  case CC_C((_,CC_B(_, _, _)), _, _) => 12 
  case CC_C(_, CC_B(_, _, _), _) => 13 
  case CC_C((_,CC_B(_, _, _)), _, CC_A(_, _)) => 14 
  case CC_C((_,CC_B(_, _, _)), CC_B(_, _, _), CC_B(_, _, _)) => 15 
}
}
// This is not matched: (CC_C T_B Wildcard Wildcard Wildcard T_B)
// This is not matched: (CC_A (CC_C Wildcard Wildcard Wildcard (T_A Boolean)) (T_A Boolean))