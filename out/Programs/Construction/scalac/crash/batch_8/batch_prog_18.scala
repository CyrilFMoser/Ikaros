package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C]() extends T_A[D, C]
case class CC_B[E, F](a: T_A[E, F]) extends T_A[F, E]
case class CC_C[G](a: T_A[T_A[G, G], G], b: Char, c: G) extends T_A[T_A[G, G], G]
case class CC_D(a: CC_A[CC_A[(Char,Int), Int], CC_A[T_B, (Int,Char)]], b: T_A[CC_B[T_B, T_B], CC_A[T_B, T_B]], c: T_A[T_A[CC_A[Boolean, T_B], CC_A[Boolean, T_B]], CC_A[Boolean, T_B]]) extends T_B
case class CC_E(a: CC_D, b: Int) extends T_B
case class CC_F() extends T_B

val v_a: CC_B[Char, T_B] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
}
}