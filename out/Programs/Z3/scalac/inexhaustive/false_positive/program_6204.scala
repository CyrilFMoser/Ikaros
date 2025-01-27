package Program_15 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_A[D]) extends T_A[C]
case class CC_B[E](a: E, b: (Char,Byte)) extends T_B[T_B[Boolean]]
case class CC_C(a: CC_B[Char], b: T_A[Char]) extends T_B[T_B[Boolean]]
case class CC_D(a: Boolean, b: CC_B[CC_C]) extends T_B[T_B[Boolean]]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,0)) => 0 
  case CC_B(12, (_,_)) => 1 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A Wildcard Wildcard T_A)