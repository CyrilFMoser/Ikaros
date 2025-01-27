package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[T_B, C]) extends T_A[C, T_A[Boolean, T_A[T_B, Byte]]]
case class CC_B(a: T_B, b: T_A[T_B, T_B]) extends T_B
case class CC_C(a: T_B) extends T_B
case class CC_D(a: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_B(_, _)) => 1 
  case CC_C(CC_D(_)) => 2 
  case CC_D(_) => 3 
}
}
// This is not matched: CC_C(CC_C(_))