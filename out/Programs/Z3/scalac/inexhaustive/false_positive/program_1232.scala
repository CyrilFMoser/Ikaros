package Program_31 

package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E]() extends T_A[D]
case class CC_B(a: T_B[Char, Int]) extends T_B[Int, T_B[Byte, Int]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Byte Boolean (T_A Byte))
// This is not matched: Pattern match is empty without constants