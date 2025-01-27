package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: T_B[Char, T_A], b: (CC_A,CC_A), c: CC_A) extends T_A
case class CC_D[C]() extends T_B[C, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A()) => 1 
  case CC_C(_, (CC_A(),CC_A()), _) => 2 
}
}