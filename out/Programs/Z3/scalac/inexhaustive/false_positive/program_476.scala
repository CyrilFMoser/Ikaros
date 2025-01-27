package Program_31 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: E, b: T_B[E], c: (Boolean,Int)) extends T_A[E, D]
case class CC_B(a: T_A[Char, Char]) extends T_B[T_A[Byte, Char]]
case class CC_C(a: Byte, b: T_A[CC_B, Int], c: CC_B) extends T_B[T_A[Byte, Char]]
case class CC_D[F]() extends T_B[T_A[Byte, Char]]

val v_a: T_B[T_A[Byte, Char]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_D() => 1 
  case CC_C(0, _, _) => 2 
  case CC_C(_, CC_A(_, _, _), _) => 3 
  case CC_C(_, _, CC_B(_)) => 4 
  case CC_C(0, CC_A(_, _, _), _) => 5 
  case CC_C(0, _, CC_B(_)) => 6 
}
}
// This is not matched: (CC_D Boolean (T_B (T_A Byte Char)))
// This is not matched: (CC_A Wildcard Wildcard Wildcard (T_A (T_A Byte)))