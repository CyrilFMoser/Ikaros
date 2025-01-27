package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C](a: Int, b: T_B[CC_A, C]) extends T_B[C, T_A]

val v_a: T_B[Byte, T_A] = null
val v_b: Int = v_a match{
  case CC_B(12, _) => 0 
}
}
// This is not matched: (CC_B (CC_A Char Boolean Boolean Boolean Boolean)
//      (CC_B Char Boolean Boolean)
//      (T_B (CC_A Char Boolean Boolean Boolean Boolean)
//           (CC_B Char Boolean Boolean)))