package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C[C]() extends T_B[C, CC_A]
case class CC_D[D](a: T_B[D, D]) extends T_B[D, CC_A]

val v_a: T_B[Boolean, CC_A] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_) => 1 
}
}