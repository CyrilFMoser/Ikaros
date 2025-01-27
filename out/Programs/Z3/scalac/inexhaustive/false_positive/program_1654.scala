package Program_31 

package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B]) extends T_A[T_A[Byte]]
case class CC_B(a: Char, b: T_A[Boolean]) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_A(_) => 1 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A (T_A Byte)))
// This is not matched: (CC_A Boolean Wildcard (T_A (T_A Byte)))