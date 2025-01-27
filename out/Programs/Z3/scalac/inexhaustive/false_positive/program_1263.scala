package Program_31 

package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Boolean, b: T_B[C]) extends T_A[C]
case class CC_B[D](a: T_B[Int]) extends T_B[T_B[Char]]

val v_a: T_B[T_B[Char]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
}
}
// This is not matched: (CC_B Boolean Wildcard (T_B (T_B Char)))
// This is not matched: Pattern match is empty without constants