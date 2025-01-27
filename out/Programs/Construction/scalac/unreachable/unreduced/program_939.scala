package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: C) extends T_A[C, T_A[T_A[T_B, T_B], T_B]]
case class CC_B(a: CC_A[Byte], b: ((T_B,T_B),CC_A[T_B])) extends T_A[Byte, T_A[T_A[T_B, T_B], T_B]]
case class CC_C(a: T_B, b: Byte, c: T_B) extends T_A[Byte, T_A[T_A[T_B, T_B], T_B]]
case class CC_D(a: T_B, b: CC_A[T_B]) extends T_B
case class CC_E(a: Boolean, b: CC_B) extends T_B
case class CC_F(a: CC_C, b: T_B) extends T_B

val v_a: T_A[Byte, T_A[T_A[T_B, T_B], T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
  case CC_C(CC_E(_, _), _, CC_D(_, _)) => 2 
  case CC_C(CC_F(_, _), _, CC_D(_, _)) => 3 
  case CC_C(CC_D(_, _), _, CC_E(_, _)) => 4 
  case CC_C(CC_E(_, _), _, CC_E(_, _)) => 5 
  case CC_C(CC_F(_, _), _, CC_E(_, _)) => 6 
  case CC_C(CC_D(_, _), _, CC_F(_, _)) => 7 
  case CC_C(CC_E(_, _), _, CC_F(_, _)) => 8 
  case CC_C(CC_F(_, _), _, CC_F(_, _)) => 9 
}
}
// This is not matched: CC_C(CC_D(_, _), _, CC_D(_, _))