package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C[C]() extends T_B[T_A, C]
case class CC_D[D]() extends T_B[T_A, D]
case class CC_E[E](a: T_B[E, E], b: T_B[T_A, E]) extends T_B[T_A, E]

val v_a: T_B[T_A, Char] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D() => 1 
  case CC_E(_, CC_C()) => 2 
  case CC_E(_, CC_D()) => 3 
  case CC_E(_, CC_E(_, _)) => 4 
}
}