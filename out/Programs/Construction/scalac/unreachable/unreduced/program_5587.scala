package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (Int,T_A), b: Boolean, c: T_A) extends T_A
case class CC_B[C](a: CC_A, b: T_A) extends T_A
case class CC_C[D](a: D, b: T_B[D, D], c: (CC_A,CC_B[Char])) extends T_B[(T_A,T_A), D]
case class CC_D[E]() extends T_B[(T_A,T_A), E]
case class CC_E[F](a: T_B[(T_A,T_A), F], b: F) extends T_B[(T_A,T_A), F]

val v_a: T_B[(T_A,T_A), T_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D() => 1 
  case CC_E(CC_C(CC_A(_, _, _), _, _), _) => 2 
  case CC_E(CC_C(CC_B(_, _), _, _), _) => 3 
  case CC_E(CC_D(), _) => 4 
  case CC_E(CC_E(CC_C(_, _, _), _), _) => 5 
  case CC_E(CC_E(CC_D(), _), _) => 6 
  case CC_E(CC_E(CC_E(_, _), _), _) => 7 
}
}