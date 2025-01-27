package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: E) extends T_A[E, F]
case class CC_B[G, H](a: T_B[G, G], b: CC_A[G, G]) extends T_A[G, H]
case class CC_C[I](a: I, b: (T_A[Byte, Boolean],CC_A[Char, Int]), c: Boolean) extends T_B[I, CC_B[I, I]]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(0, (CC_A(_),CC_A(_)), true) => 0 
  case CC_C(0, (CC_A(_),CC_A(_)), false) => 1 
  case CC_C(_, (CC_A(_),CC_A(_)), true) => 2 
  case CC_C(_, (CC_A(_),CC_A(_)), false) => 3 
  case CC_C(0, (CC_B(_, _),CC_A(_)), true) => 4 
  case CC_C(0, (CC_B(_, _),CC_A(_)), false) => 5 
  case CC_C(_, (CC_B(_, _),CC_A(_)), true) => 6 
  case CC_C(_, (CC_B(_, _),CC_A(_)), false) => 7 
}
}