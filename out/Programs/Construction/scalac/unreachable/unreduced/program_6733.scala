package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, F]
case class CC_B[G, H](a: T_B[H, G], b: G, c: Boolean) extends T_A[G, H]
case class CC_C[I, J, K](a: CC_A[J, I], b: T_A[K, K]) extends T_A[I, J]
case class CC_D[L]() extends T_B[(CC_B[Boolean, (Byte,Char)],CC_C[Byte, Char, Char]), L]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, 0, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(), _) => 2 
}
}
// This is not matched: CC_A()