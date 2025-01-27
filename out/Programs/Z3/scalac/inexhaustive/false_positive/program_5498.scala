package Program_11 

package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Boolean, b: T_A[B], c: Char) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard Wildcard (T_A (T_A Int)))
// This is not matched: (CC_C (CC_B Char Char Wildcard (T_A Char))
//      Wildcard
//      (T_B (T_A Boolean) (T_A Byte)))