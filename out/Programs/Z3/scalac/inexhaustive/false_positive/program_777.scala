package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: T_B[T_A, Int]) extends T_A
case class CC_B[C]() extends T_B[CC_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: Pattern match is empty without constants