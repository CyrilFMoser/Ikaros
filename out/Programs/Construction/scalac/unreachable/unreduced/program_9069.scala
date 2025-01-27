package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[E, T_A[Boolean, T_B[E]]]) extends T_A[D, E]
case class CC_B[G](a: T_A[G, G], b: Char) extends T_A[CC_A[T_A[Int, Char], Byte], G]
case class CC_C[H]() extends T_A[CC_A[T_A[Int, Char], Byte], H]
case class CC_D(a: (T_B[Char],CC_A[Char, Byte])) extends T_B[CC_B[(Boolean,Char)]]
case class CC_E() extends T_B[CC_B[(Boolean,Char)]]
case class CC_F(a: T_B[CC_B[CC_D]], b: CC_E) extends T_B[CC_B[(Boolean,Char)]]

val v_a: T_B[CC_B[(Boolean,Char)]] = null
val v_b: Int = v_a match{
  case CC_D((_,CC_A(_))) => 0 
  case CC_E() => 1 
  case CC_F(_, CC_E()) => 2 
}
}