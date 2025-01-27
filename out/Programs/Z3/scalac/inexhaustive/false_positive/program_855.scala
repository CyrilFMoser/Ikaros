package Program_30 

package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, Byte]) extends T_A[T_A[Int, Char], C]

val v_a: T_A[T_A[Int, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Char Boolean Wildcard (T_A (T_A Int Char) Char))
// This is not matched: (CC_A Char Boolean Wildcard (T_A (T_A Int Char) Char))