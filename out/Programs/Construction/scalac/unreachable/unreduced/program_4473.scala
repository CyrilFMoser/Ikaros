package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: D, c: T_A[D]) extends T_A[Int]
case class CC_B(a: CC_A[T_A[Char]], b: CC_A[(Int,Char)]) extends T_A[Int]
case class CC_C() extends T_A[Int]
case class CC_D[E, F](a: F) extends T_B[E, F]
case class CC_E[G](a: G, b: Byte) extends T_B[G, CC_A[G]]
case class CC_F(a: CC_D[Byte, T_A[Int]], b: Byte, c: Char) extends T_B[CC_E[((Char,Int),CC_B)], CC_A[CC_E[((Char,Int),CC_B)]]]

val v_a: T_B[Boolean, CC_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _)) => 0 
  case CC_E(_, _) => 1 
}
}