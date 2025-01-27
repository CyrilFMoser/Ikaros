package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C](a: T_A) extends T_A
case class CC_C[D, E]() extends T_B[T_A, D]
case class CC_D(a: T_B[T_A, CC_B[Byte]], b: Char) extends T_B[T_A, CC_B[Byte]]
case class CC_E(a: T_A, b: T_B[Byte, (CC_A,CC_A)]) extends T_B[T_A, T_A]

val v_a: T_B[T_A, T_A] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_E(CC_A(), _) => 1 
  case CC_E(CC_B(_), _) => 2 
}
}