package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: CC_A, b: CC_A) extends T_A
case class CC_C(a: T_B[T_B[T_A]]) extends T_B[CC_B]
case class CC_D() extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D() => 1 
}
}