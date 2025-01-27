package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_B[D]) extends T_A[(T_A[Byte, Byte],T_B[Int]), D]
case class CC_B[E](a: CC_A[E], b: Boolean) extends T_B[E]
case class CC_C[F]() extends T_B[F]
case class CC_D[G](a: T_B[G], b: G, c: CC_B[G]) extends T_B[G]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _) => 0 
  case CC_C() => 1 
  case CC_D(CC_B(_, _), _, _) => 2 
  case CC_D(CC_C(), _, _) => 3 
  case CC_D(CC_D(CC_B(_, _), _, CC_B(_, _)), _, _) => 4 
  case CC_D(CC_D(CC_C(), _, CC_B(_, _)), _, _) => 5 
  case CC_D(CC_D(CC_D(_, _, _), _, CC_B(_, _)), _, _) => 6 
}
}