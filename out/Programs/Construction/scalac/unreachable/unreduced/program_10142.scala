package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[D, D], c: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: T_A[E], b: CC_A[E], c: T_A[E]) extends T_A[E]
case class CC_C[F]() extends T_A[F]
case class CC_D[G](a: T_A[G], b: Byte, c: T_A[G]) extends T_B[G, CC_B[G]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, _) => 0 
  case CC_A(CC_A(CC_B(_, _, _), _, _), _, _) => 1 
  case CC_A(CC_A(CC_C(), _, _), _, _) => 2 
  case CC_A(CC_B(_, _, _), _, _) => 3 
  case CC_A(CC_C(), _, _) => 4 
  case CC_B(_, _, _) => 5 
  case CC_C() => 6 
}
}