package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Int, b: T_A[C, C], c: T_B) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_B, b: D, c: D) extends T_A[(Byte,Int), T_A[(Byte,Int), (Byte,Int)]]
case class CC_C(a: T_B, b: T_A[T_B, CC_A[T_B]]) extends T_B
case class CC_D() extends T_B
case class CC_E(a: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D() => 1 
  case CC_E(CC_C(CC_C(_, _), _)) => 2 
  case CC_E(CC_C(CC_E(_), _)) => 3 
}
}
// This is not matched: CC_E(CC_C(CC_D(), _))