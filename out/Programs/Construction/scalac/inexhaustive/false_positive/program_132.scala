package Program_31 

package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F, G](a: T_B[E, G], b: T_A[F, F], c: T_A[E, F]) extends T_A[E, F]
case class CC_B[H, I]() extends T_A[H, I]
case class CC_C[J](a: CC_B[J, J], b: CC_A[J, Char, J], c: J) extends T_A[J, CC_A[J, J, J]]
case class CC_D[K]() extends T_B[K, (Char,(Byte,Byte))]
case class CC_E[L](a: CC_A[L, L, L], b: Int, c: T_A[L, Char]) extends T_B[L, (Char,(Byte,Byte))]
case class CC_F(a: Boolean) extends T_B[CC_A[Char, CC_A[Byte, Int, Byte], Byte], (Char,(Byte,Byte))]

val v_a: CC_A[CC_F, Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_A(_, CC_B(), CC_A(_, _, _)) => 1 
  case CC_A(_, CC_A(_, _, _), CC_B()) => 2 
}
}
// This is not matched: CC_A(_, CC_B(), CC_B())
// This is not matched: CC_C(_, CC_B(CC_A(_, _, _), _, CC_B(_, _, _)), _)