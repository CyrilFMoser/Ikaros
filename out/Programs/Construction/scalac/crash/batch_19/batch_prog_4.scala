package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[(T_A,T_A), (T_A,T_A)], b: T_A) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D[D, C]() extends T_B[D, C]

val v_a: T_B[CC_A, CC_B] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
}
}