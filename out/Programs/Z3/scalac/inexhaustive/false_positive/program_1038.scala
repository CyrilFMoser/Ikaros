package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, T_A]) extends T_A
case class CC_C() extends T_A
case class CC_D[C]() extends T_B[CC_A, C]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants