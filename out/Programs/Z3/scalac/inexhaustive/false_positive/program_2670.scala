package Program_31 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E]() extends T_A[D]
case class CC_B[F, G](a: F, b: F) extends T_A[F]
case class CC_C(a: CC_A[Char, Boolean], b: T_A[Char], c: T_A[Int]) extends T_A[CC_B[Byte, Boolean]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: (CC_B Byte Boolean Wildcard Byte (T_A Byte))
// This is not matched: (CC_A (CC_E T_B) (CC_E T_B) Wildcard (T_A (T_A T_B T_B) (CC_E T_B)))