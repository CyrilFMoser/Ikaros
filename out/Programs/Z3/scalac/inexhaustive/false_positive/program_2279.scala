package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B]) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A (T_A Int)))
// This is not matched: (CC_C Char
//      Boolean
//      (CC_D Boolean Boolean Wildcard (T_B Boolean Boolean))
//      Wildcard
//      (T_B Boolean Char))