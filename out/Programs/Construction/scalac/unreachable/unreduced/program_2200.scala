package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, Byte]) extends T_A[E, (T_A[Char, (Byte,Char)],T_B[Int, Int])]
case class CC_B[F, G](a: CC_A[(Byte,Boolean)], b: T_B[F, G], c: Byte) extends T_A[F, (T_A[Char, (Byte,Char)],T_B[Int, Int])]
case class CC_C[I, H](a: H, b: Char) extends T_B[I, H]
case class CC_D[J](a: (T_B[Char, Boolean],Char), b: CC_C[J, J], c: T_A[J, CC_A[J]]) extends T_B[T_B[CC_C[Char, Boolean], T_B[Byte, Char]], J]

val v_a: T_A[Int, (T_A[Char, (Byte,Char)],T_B[Int, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}