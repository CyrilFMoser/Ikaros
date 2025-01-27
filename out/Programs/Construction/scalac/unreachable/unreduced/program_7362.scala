package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Boolean]]) extends T_A[Boolean]
case class CC_B(a: (CC_A,(Byte,CC_A)), b: T_A[Boolean]) extends T_A[Boolean]
case class CC_C() extends T_A[Boolean]
case class CC_D[D, E]() extends T_B[D, E]
case class CC_E[G, F](a: G) extends T_B[G, F]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}