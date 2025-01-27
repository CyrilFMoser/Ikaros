package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[((Int,Byte),T_A[Char, Boolean]), D]
case class CC_B(a: Byte, b: T_A[CC_A[Int], Boolean], c: CC_A[T_B[(Byte,Int)]]) extends T_A[((Int,Byte),T_A[Char, Boolean]), T_B[CC_A[Int]]]
case class CC_C() extends T_B[CC_A[(CC_B,CC_B)]]
case class CC_D() extends T_B[CC_A[(CC_B,CC_B)]]
case class CC_E[E](a: T_A[E, E], b: E, c: T_B[E]) extends T_B[E]

val v_a: T_B[CC_A[(CC_B,CC_B)]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D() => 1 
  case CC_E(_, CC_A(), _) => 2 
}
}