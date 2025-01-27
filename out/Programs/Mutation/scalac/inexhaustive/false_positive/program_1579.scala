package Program_63 

package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[Boolean, C], c: T_A[C, C]) extends T_A[T_A[Int, Char], T_A[Int, Byte]]

val v_a: T_A[T_A[Int, Char], T_A[Int, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard Wildcard (T_A (T_A Int Char) (T_A Int Byte)))
// This is not matched: (CC_A Byte Boolean Boolean Wildcard Char (T_A Byte Boolean))