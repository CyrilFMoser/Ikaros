package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Boolean], (Char,(Byte,Int))], b: T_B[T_B[Char, Boolean], T_A[Char]], c: T_B[T_B[Byte, (Char,Char)], T_B[Boolean, Char]]) extends T_A[T_A[T_A[(Byte,Boolean)]]]
case class CC_B(a: CC_A, b: CC_A, c: T_A[Byte]) extends T_A[T_A[T_A[(Byte,Boolean)]]]
case class CC_C(a: (CC_B,Int)) extends T_A[T_A[T_A[(Byte,Boolean)]]]
case class CC_D[D]() extends T_B[CC_B, D]
case class CC_E[E, F](a: CC_A, b: F) extends T_B[F, E]
case class CC_F[G](a: G, b: CC_E[G, G]) extends T_B[CC_B, G]

val v_a: T_B[CC_B, CC_A] = null
val v_b: Int = v_a match{
  case CC_E(CC_A(CC_E(_, _), CC_E(_, _), CC_E(_, _)), _) => 0 
  case CC_F(_, CC_E(CC_A(_, _, _), _)) => 1 
}
}
// This is not matched: CC_D()