package Program_14 

package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, Byte]) extends T_A[C, T_A[Char, Boolean]]

val v_a: T_A[Int, T_A[Char, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Int Boolean Wildcard (T_A Int (T_A Char Boolean)))
// This is not matched: Pattern match is empty without constants