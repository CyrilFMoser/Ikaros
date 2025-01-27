package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[CC_A, (CC_A,CC_B)], b: (CC_A,CC_A), c: CC_B) extends T_A
case class CC_D[C](a: CC_B) extends T_B[C, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}