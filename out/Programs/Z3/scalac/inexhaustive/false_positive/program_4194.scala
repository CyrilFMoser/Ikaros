package Program_15 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_A) extends T_A
case class CC_B[C](a: T_B[C, C], b: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[E, D]() extends T_B[D, E]
case class CC_E[F]() extends T_B[T_B[Char, CC_C], F]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_D(), CC_B(_, _)) => 0 
  case CC_A(_, CC_C()) => 1 
  case CC_A(CC_D(), CC_A(_, _)) => 2 
}
}
// This is not matched: (CC_A Wildcard (CC_B T_A Wildcard (CC_A Wildcard Wildcard T_A) T_A) T_A)
// This is not matched: (CC_B Wildcard T_A)