package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[T_B[Byte, Boolean], T_B[Byte, Boolean]], E]
case class CC_B[F, G]() extends T_A[F, G]
case class CC_C[H](a: T_B[H, H], b: CC_A[H]) extends T_A[T_B[T_B[Byte, Boolean], T_B[Byte, Boolean]], H]
case class CC_D[I](a: T_A[CC_B[I, I], I], b: T_B[I, I]) extends T_B[CC_B[Char, T_A[Int, Boolean]], I]
case class CC_E(a: ((Byte,Char),T_A[Byte, Int]), b: (CC_A[Char],T_A[Boolean, (Int,Char)])) extends T_B[CC_B[Char, T_A[Int, Boolean]], Int]
case class CC_F[J](a: T_A[CC_A[J], CC_B[(Byte,Char), J]], b: T_A[J, J], c: Byte) extends T_B[CC_B[Char, T_A[Int, Boolean]], J]

val v_a: T_A[T_B[T_B[Byte, Boolean], T_B[Byte, Boolean]], T_B[CC_B[Char, T_A[Int, Boolean]], Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}