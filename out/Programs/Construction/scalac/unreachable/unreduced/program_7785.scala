package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_B[T_A],T_A), b: Boolean) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B, b: T_B[(CC_B,CC_B)]) extends T_A
case class CC_D(a: T_A) extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), _) => 1 
}
}
// This is not matched: CC_A(_, _)