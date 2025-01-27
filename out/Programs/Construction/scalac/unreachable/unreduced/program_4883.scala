package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: Byte) extends T_A[C, ((T_B,T_B),Char)]
case class CC_B[D](a: Boolean) extends T_A[D, ((T_B,T_B),Char)]
case class CC_C(a: (CC_A[Byte],T_A[T_B, T_B]), b: T_A[CC_A[T_B], Byte]) extends T_A[T_B, ((T_B,T_B),Char)]
case class CC_D() extends T_B
case class CC_E(a: CC_A[(T_B,T_B)], b: T_B) extends T_B

val v_a: CC_A[T_A[T_B, ((T_B,T_B),Char)]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_D(), 0), _) => 0 
  case CC_A(CC_A(CC_E(_, _), 0), _) => 1 
  case CC_A(CC_A(CC_D(), _), _) => 2 
  case CC_A(CC_A(CC_E(_, _), _), _) => 3 
  case CC_A(CC_C(_, _), _) => 4 
}
}
// This is not matched: CC_A(CC_B(_), _)