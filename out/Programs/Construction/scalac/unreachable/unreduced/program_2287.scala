package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[F, E]
case class CC_B[G]() extends T_A[T_A[CC_A[Byte, (Char,Char)], T_A[Int, Int]], G]
case class CC_C[H](a: CC_A[H, H], b: Boolean) extends T_B[H, T_B[(Byte,Int), T_A[Boolean, Byte]]]
case class CC_D[I](a: Boolean, b: (T_A[Char, Boolean],T_A[Char, Byte]), c: Boolean) extends T_B[I, T_B[(Byte,Int), T_A[Boolean, Byte]]]
case class CC_E[J](a: T_A[J, J], b: T_B[CC_C[Boolean], J], c: CC_B[J]) extends T_B[J, T_B[(Byte,Int), T_A[Boolean, Byte]]]

val v_a: T_B[Int, T_B[(Byte,Int), T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_D(_, (CC_A(),CC_A()), true) => 0 
  case CC_D(_, (CC_A(),CC_A()), false) => 1 
  case CC_E(CC_A(), _, CC_B()) => 2 
}
}
// This is not matched: CC_C(CC_A(), _)