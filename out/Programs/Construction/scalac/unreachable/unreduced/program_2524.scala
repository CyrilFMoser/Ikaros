package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: Char) extends T_A
case class CC_C(a: T_B[(CC_B,CC_A), (CC_A,T_A)], b: CC_A) extends T_A
case class CC_D[C]() extends T_B[T_A, C]
case class CC_E[D](a: T_B[D, D]) extends T_B[CC_D[CC_A], D]
case class CC_F[E]() extends T_B[T_A, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
  case CC_C(_, CC_A()) => 2 
}
}