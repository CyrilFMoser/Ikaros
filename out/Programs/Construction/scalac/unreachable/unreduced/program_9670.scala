package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: Boolean) extends T_A[T_A[T_A[(Boolean,Int), T_B], T_A[T_B, Char]], C]
case class CC_B(a: CC_A[T_A[T_B, Byte]]) extends T_A[T_A[T_A[(Boolean,Int), T_B], T_A[T_B, Char]], T_A[Boolean, T_A[T_B, Int]]]
case class CC_C(a: T_B, b: Boolean, c: CC_A[T_B]) extends T_B
case class CC_D() extends T_B
case class CC_E(a: T_B, b: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A(_, _)) => 0 
  case CC_D() => 1 
  case CC_E(CC_C(_, _, _), _) => 2 
  case CC_E(CC_D(), _) => 3 
  case CC_E(CC_E(CC_C(_, _, _), _), _) => 4 
  case CC_E(CC_E(CC_D(), _), _) => 5 
  case CC_E(CC_E(CC_E(_, _), _), _) => 6 
}
}