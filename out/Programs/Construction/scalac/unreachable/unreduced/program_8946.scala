package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[E, T_A[((Char,Char),Char), Int]]
case class CC_B[F](a: Int) extends T_A[F, T_A[((Char,Char),Char), Int]]
case class CC_C[G]() extends T_A[G, T_A[((Char,Char),Char), Int]]
case class CC_D[H](a: H, b: CC_C[H]) extends T_B[Boolean, H]
case class CC_E(a: Byte, b: CC_D[T_B[Boolean, Int]], c: (CC_D[Byte],Char)) extends T_B[Boolean, Int]
case class CC_F[I](a: I) extends T_B[Boolean, I]

val v_a: T_A[Byte, T_A[((Char,Char),Char), Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C()