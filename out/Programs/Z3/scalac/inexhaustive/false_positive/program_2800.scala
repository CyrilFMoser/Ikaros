package Program_31 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C](a: T_B, b: T_A[D, C]) extends T_A[C, D]
case class CC_B(a: T_A[T_B, (Int,Boolean)], b: T_A[T_B, T_B]) extends T_A[Char, (T_B,T_B)]
case class CC_C(a: Boolean, b: CC_A[CC_B, T_B], c: CC_A[Char, (Byte,Boolean)]) extends T_B
case class CC_D[E](a: CC_C, b: CC_A[E, E], c: (CC_C,CC_C)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, _), CC_A(_, _)) => 0 
  case CC_D(_, _, (CC_C(_, _, _),CC_C(_, _, _))) => 1 
  case CC_D(_, _, _) => 2 
}
}
// This is not matched: (CC_D T_B Wildcard Wildcard Wildcard T_B)
// This is not matched: (CC_C T_A Wildcard (T_B (T_B (CC_A T_A))))