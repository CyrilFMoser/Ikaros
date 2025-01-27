package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (T_B[Byte, Boolean],(Int,(Int,Int)))) extends T_A[D]
case class CC_B[E](a: E) extends T_A[E]
case class CC_C[F](a: T_A[F], b: T_B[F, F]) extends T_A[F]
case class CC_D[G](a: ((Char,Boolean),CC_A[Char])) extends T_B[CC_C[G], G]
case class CC_E[H](a: T_B[CC_C[H], H], b: T_A[H]) extends T_B[CC_C[H], H]
case class CC_F(a: CC_C[Boolean]) extends T_B[CC_C[(CC_E[Int],(Boolean,Char))], (CC_E[Int],(Boolean,Char))]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_))) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}