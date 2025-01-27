package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_A[T_B, T_B], C], b: T_A[T_A[T_B, T_B], C], c: T_A[C, C]) extends T_A[T_A[T_B, T_B], C]
case class CC_B(a: T_A[T_A[T_B, T_B], T_A[Boolean, T_B]], b: T_A[Char, T_B]) extends T_B
case class CC_C(a: T_A[T_B, (CC_B,CC_B)]) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_) => 1 
  case CC_D() => 2 
}
}