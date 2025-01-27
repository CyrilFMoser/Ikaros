package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_B[E, E]) extends T_A[E, T_B[E, (Int,Boolean)]]
case class CC_B[F, G](a: T_B[G, G], b: G) extends T_B[F, G]
case class CC_C[H](a: (Byte,Int), b: H) extends T_B[CC_A[(Boolean,Byte)], H]
case class CC_D[I](a: CC_A[I]) extends T_B[CC_A[(Boolean,Byte)], I]

val v_a: T_B[CC_A[(Boolean,Byte)], Byte] = null
val v_b: Int = v_a match{
  case CC_C((_,12), _) => 0 
  case CC_C((_,_), _) => 1 
  case CC_D(CC_A(_, CC_B(_, _))) => 2 
}
}
// This is not matched: CC_B(CC_B(CC_B(_, _), _), _)