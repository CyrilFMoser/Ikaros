package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[F, F]) extends T_A[F, E]
case class CC_B[H, G, I](a: (T_A[Int, Int],Char), b: Boolean) extends T_A[G, H]
case class CC_C[J](a: Int) extends T_A[J, Boolean]
case class CC_D() extends T_B[CC_A[(Byte,Int), CC_B[(Byte,Int), Boolean, Char]], CC_B[(Int,Int), Char, T_A[Boolean, Boolean]]]
case class CC_E(a: (T_A[CC_D, Boolean],Char)) extends T_B[CC_A[(Byte,Int), CC_B[(Byte,Int), Boolean, Char]], CC_B[(Int,Int), Char, T_A[Boolean, Boolean]]]
case class CC_F(a: T_B[CC_C[CC_E], CC_C[CC_E]]) extends T_B[CC_A[(Byte,Int), CC_B[(Byte,Int), Boolean, Char]], CC_B[(Int,Int), Char, T_A[Boolean, Boolean]]]

val v_a: T_B[CC_A[(Byte,Int), CC_B[(Byte,Int), Boolean, Char]], CC_B[(Int,Int), Char, T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_) => 1 
  case CC_F(_) => 2 
}
}