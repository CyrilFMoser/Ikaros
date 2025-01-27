package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[Boolean, T_A], c: T_A) extends T_A
case class CC_B(a: Char, b: (CC_A,CC_A)) extends T_A
case class CC_C[C]() extends T_B[Char, C]
case class CC_D[D](a: D) extends T_B[Char, D]
case class CC_E[E](a: T_A, b: CC_A) extends T_B[Char, E]

val v_a: T_B[Char, T_A] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(_, _, _)) => 1 
  case CC_E(CC_A(_, _, _), _) => 2 
  case CC_E(CC_B(_, _), _) => 3 
}
}
// This is not matched: CC_D(CC_B(_, _))