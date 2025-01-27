package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_B], b: T_A[C, C]) extends T_A[C, T_B]
case class CC_B[D]() extends T_A[D, T_B]
case class CC_C(a: T_B, b: T_B, c: T_A[T_A[Boolean, T_B], T_B]) extends T_A[Boolean, T_B]
case class CC_D() extends T_B
case class CC_E(a: T_A[Byte, CC_D]) extends T_B
case class CC_F(a: T_A[Boolean, T_B], b: CC_A[T_B], c: T_B) extends T_B

val v_a: T_A[Byte, T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(), _), _) => 1 
  case CC_A(CC_B(), _) => 2 
  case CC_B() => 3 
}
}