package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Byte]]) extends T_A[(T_B[Int, Byte],T_B[(Char,Byte), Byte])]
case class CC_B(a: T_A[CC_A]) extends T_A[(T_B[Int, Byte],T_B[(Char,Byte), Byte])]
case class CC_C(a: Char, b: Byte) extends T_A[(T_B[Int, Byte],T_B[(Char,Byte), Byte])]
case class CC_D[D, E](a: E) extends T_B[D, E]
case class CC_E[G, F](a: T_B[T_B[F, F], G], b: Char) extends T_B[F, G]

val v_a: T_A[(T_B[Int, Byte],T_B[(Char,Byte), Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}