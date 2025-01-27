package Program_30 

package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[(Byte,Int)], b: T_B[T_A]) extends T_A
case class CC_B[B, C]() extends T_B[B]
case class CC_C(a: Char, b: CC_B[CC_A, T_A]) extends T_B[CC_B[CC_A, T_A]]
case class CC_D(a: T_B[CC_C], b: T_A, c: CC_A) extends T_B[CC_B[CC_A, T_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
}
}
// This is not matched: (CC_A Wildcard (CC_B T_A T_A (T_B T_A)) T_A)
// This is not matched: (CC_A Wildcard (CC_B T_A T_A (T_B T_A)) T_A)