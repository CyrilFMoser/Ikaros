package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B(a: (T_A[Boolean, Char],T_A[Char, Byte]), b: Char, c: Char) extends T_A[Char, T_A[Char, Char]]
case class CC_C[D](a: T_A[CC_A[D], D], b: T_A[(CC_B,CC_B), T_A[(CC_B,CC_B), (CC_B,CC_B)]]) extends T_A[D, T_A[D, D]]

val v_a: T_A[CC_B, T_A[CC_B, CC_B]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _) => 1 
}
}