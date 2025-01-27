package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[T_B[T_A[Byte, Byte], T_A[(Char,Char), Byte]], E]
case class CC_B[G](a: G, b: T_B[T_B[G, G], G]) extends T_B[Char, CC_A[CC_A[Byte, Boolean], T_A[Boolean, Boolean]]]
case class CC_C() extends T_B[Char, CC_A[CC_A[Byte, Boolean], T_A[Boolean, Boolean]]]
case class CC_D[H](a: CC_A[H, H], b: CC_A[H, H]) extends T_B[Int, H]

val v_a: T_B[Char, CC_A[CC_A[Byte, Boolean], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
}
}