package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Char) extends T_A[Byte, E]
case class CC_B[F]() extends T_A[Byte, F]
case class CC_C[G](a: Char, b: Byte, c: T_A[G, G]) extends T_A[Byte, G]
case class CC_D[I, H](a: H, b: (T_A[Byte, Byte],T_A[Byte, Boolean])) extends T_B[I, H]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C('x', _, _) => 2 
  case CC_C(_, _, _) => 3 
}
}