package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_B]]
case class CC_B(a: T_B, b: T_A[T_B]) extends T_B
case class CC_D() extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_D(), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants