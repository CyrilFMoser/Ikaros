package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_A[Boolean], T_B[(Byte,Int), Char]]]
case class CC_B() extends T_A[T_B[T_A[Boolean], T_B[(Byte,Int), Char]]]
case class CC_C[E, D](a: D, b: E, c: Boolean) extends T_B[D, E]
case class CC_D[F, G](a: T_B[F, F], b: T_A[F], c: T_B[G, G]) extends T_B[F, G]
case class CC_E[I, H](a: Char, b: H, c: H) extends T_B[I, H]

val v_a: T_B[Boolean, T_A[T_B[T_A[Boolean], T_B[(Byte,Int), Char]]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(CC_C(_, _, _), _, _) => 1 
  case CC_D(CC_D(_, _, CC_C(_, _, _)), _, _) => 2 
  case CC_D(CC_D(_, _, CC_D(_, _, _)), _, _) => 3 
  case CC_D(CC_D(_, _, CC_E(_, _, _)), _, _) => 4 
  case CC_E(_, _, _) => 5 
}
}
// This is not matched: CC_A(CC_B(CC_B(_)))