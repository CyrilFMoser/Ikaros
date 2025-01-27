package Program_15 

package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_B[T_A, C], b: C, c: C) extends T_A
case class CC_B(a: T_B[T_A, T_A], b: T_B[(Byte,Boolean), T_A], c: T_A) extends T_A
case class CC_C(a: (Int,T_A), b: CC_B, c: Byte) extends T_A
case class CC_D[D, E](a: T_B[D, D]) extends T_B[E, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_), _, _) => 0 
  case CC_C(_, CC_B(_, _, _), _) => 1 
  case CC_C((_,CC_C(_, _, _)), _, _) => 2 
  case CC_C((_,CC_B(_, _, _)), _, _) => 3 
  case CC_C((12,CC_C(_, _, _)), CC_B(_, _, _), 0) => 4 
  case CC_C((12,CC_C(_, _, _)), CC_B(_, _, _), _) => 5 
  case CC_C((12,CC_A(_, _, _)), _, _) => 6 
  case CC_C(_, CC_B(_, _, _), 0) => 7 
  case CC_C((_,CC_C(_, _, _)), CC_B(_, _, _), 0) => 8 
  case CC_C(_, _, _) => 9 
  case CC_C((12,CC_B(_, _, _)), CC_B(_, _, _), _) => 10 
  case CC_C((12,CC_B(_, _, _)), CC_B(_, _, _), 0) => 11 
  case CC_C((_,CC_C(_, _, _)), _, 0) => 12 
  case CC_C((12,CC_A(_, _, _)), CC_B(_, _, _), 0) => 13 
  case CC_C((12,CC_B(_, _, _)), _, _) => 14 
  case CC_C((12,CC_C(_, _, _)), _, 0) => 15 
  case CC_C((_,CC_B(_, _, _)), _, 0) => 16 
  case CC_C((_,CC_B(_, _, _)), CC_B(_, _, _), 0) => 17 
  case CC_C((_,CC_C(_, _, _)), CC_B(_, _, _), _) => 18 
  case CC_C((12,CC_B(_, _, _)), _, 0) => 19 
  case CC_C((_,CC_B(_, _, _)), CC_B(_, _, _), _) => 20 
  case CC_C((12,CC_A(_, _, _)), CC_B(_, _, _), _) => 21 
  case CC_B(CC_D(_), _, CC_C(_, _, _)) => 22 
  case CC_B(CC_D(_), CC_D(_), _) => 23 
  case CC_B(CC_D(_), CC_D(_), CC_C(_, _, _)) => 24 
  case CC_B(_, CC_D(_), _) => 25 
  case CC_B(_, _, CC_A(_, _, _)) => 26 
  case CC_B(_, _, _) => 27 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_C Wildcard Wildcard T_B)