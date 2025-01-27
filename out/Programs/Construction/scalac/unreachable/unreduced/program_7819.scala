package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: F, b: T_B[T_A[Char, E], T_A[E, E]]) extends T_A[F, E]
case class CC_B[G](a: CC_A[G, G]) extends T_A[(T_B[Byte, Char],T_B[Byte, Int]), G]
case class CC_C[H, I]() extends T_A[H, I]
case class CC_D[J]() extends T_B[J, Boolean]
case class CC_E(a: (T_A[Byte, Boolean],Byte)) extends T_B[CC_D[T_A[Byte, Int]], T_A[CC_C[Boolean, Int], CC_B[Boolean]]]
case class CC_F(a: Byte) extends T_B[CC_D[T_A[Byte, Int]], T_A[CC_C[Boolean, Int], CC_B[Boolean]]]

val v_a: T_B[CC_D[T_A[Byte, Int]], T_A[CC_C[Boolean, Int], CC_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_E((CC_A(_, _),_)) => 0 
  case CC_E((CC_C(),_)) => 1 
  case CC_F(_) => 2 
}
}