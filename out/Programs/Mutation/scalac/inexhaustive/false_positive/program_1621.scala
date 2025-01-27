package Program_63 

package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Char, b: (T_B,T_B), c: C) extends T_A[T_B, C]
case class CC_B[E, D, F](a: (Boolean,T_B), b: (T_B,T_B), c: CC_A[D]) extends T_A[E, D]
case class CC_C(a: T_B, b: T_A[T_B, T_B], c: CC_B[T_B, T_B, T_B]) extends T_B
case class CC_D(a: CC_C, b: CC_C, c: Boolean) extends T_B

val v_a: T_A[T_B, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_C(_, _, _),CC_C(_, _, _)), 0) => 0 
  case CC_A('x', (CC_C(_, _, _),CC_D(_, _, _)), 0) => 1 
  case CC_A(_, (CC_D(_, _, _),CC_C(_, _, _)), 0) => 2 
  case CC_A(_, (CC_C(_, _, _),CC_C(_, _, _)), _) => 3 
  case CC_A(_, (CC_D(_, _, _),CC_C(_, _, _)), _) => 4 
  case CC_A(_, (CC_C(_, _, _),CC_D(_, _, _)), 0) => 5 
  case CC_A('x', (CC_D(_, _, _),CC_C(_, _, _)), 0) => 6 
  case CC_A(_, (CC_C(_, _, _),CC_D(_, _, _)), _) => 7 
  case CC_A('x', (CC_D(_, _, _),CC_D(_, _, _)), 0) => 8 
  case CC_A('x', (CC_C(_, _, _),CC_C(_, _, _)), _) => 9 
  case CC_A(_, _, 0) => 10 
  case CC_A(_, _, _) => 11 
  case CC_B((_,CC_C(_, _, _)), (CC_C(_, _, _),CC_C(_, _, _)), CC_A(_, _, _)) => 12 
  case CC_B((_,CC_D(_, _, _)), (CC_C(_, _, _),CC_C(_, _, _)), _) => 13 
  case CC_B(_, (CC_C(_, _, _),CC_C(_, _, _)), _) => 14 
  case CC_B(_, (CC_D(_, _, _),CC_C(_, _, _)), _) => 15 
  case CC_B((_,CC_D(_, _, _)), _, CC_A(_, _, _)) => 16 
  case CC_B((_,CC_C(_, _, _)), (CC_C(_, _, _),CC_C(_, _, _)), _) => 17 
  case CC_B((_,CC_D(_, _, _)), _, _) => 18 
  case CC_B(_, (CC_D(_, _, _),CC_D(_, _, _)), CC_A(_, _, _)) => 19 
  case CC_B((_,CC_D(_, _, _)), (CC_D(_, _, _),CC_C(_, _, _)), CC_A(_, _, _)) => 20 
  case CC_B((_,CC_D(_, _, _)), (CC_D(_, _, _),CC_C(_, _, _)), _) => 21 
  case CC_B(_, (CC_C(_, _, _),CC_D(_, _, _)), _) => 22 
  case CC_B(_, (CC_C(_, _, _),CC_C(_, _, _)), CC_A(_, _, _)) => 23 
  case CC_B((_,CC_C(_, _, _)), (CC_D(_, _, _),CC_D(_, _, _)), _) => 24 
  case CC_B((_,CC_D(_, _, _)), (CC_D(_, _, _),CC_D(_, _, _)), _) => 25 
  case CC_B((_,CC_C(_, _, _)), _, _) => 26 
  case CC_B((_,CC_C(_, _, _)), (CC_C(_, _, _),CC_D(_, _, _)), _) => 27 
  case CC_B((_,CC_D(_, _, _)), (CC_C(_, _, _),CC_C(_, _, _)), CC_A(_, _, _)) => 28 
  case CC_B(_, (CC_D(_, _, _),CC_C(_, _, _)), CC_A(_, _, _)) => 29 
  case CC_B(_, (CC_D(_, _, _),CC_D(_, _, _)), _) => 30 
  case CC_B((_,CC_C(_, _, _)), (CC_C(_, _, _),CC_D(_, _, _)), CC_A(_, _, _)) => 31 
  case CC_B(_, _, _) => 32 
  case CC_B((_,CC_C(_, _, _)), (CC_D(_, _, _),CC_D(_, _, _)), CC_A(_, _, _)) => 33 
  case CC_B((_,CC_D(_, _, _)), (CC_C(_, _, _),CC_D(_, _, _)), CC_A(_, _, _)) => 34 
}
}
// This is not matched: (CC_B T_B Byte T_B Wildcard Wildcard Wildcard (T_A T_B Byte))
// This is not matched: (CC_B T_B Byte T_B Wildcard Wildcard Wildcard (T_A T_B Byte))