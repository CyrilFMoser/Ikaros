package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, Char], b: T_B[D, D], c: Boolean) extends T_A[D]
case class CC_B[E](a: (Byte,T_A[Int])) extends T_A[E]
case class CC_C[F]() extends T_B[F, T_A[T_A[Boolean]]]
case class CC_D[G]() extends T_B[T_B[G, G], G]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((0,CC_A(_, _, _))) => 1 
  case CC_B((0,CC_B(_))) => 2 
  case CC_B((_,CC_A(_, _, _))) => 3 
}
}
// This is not matched: CC_B((_,CC_B(_)))