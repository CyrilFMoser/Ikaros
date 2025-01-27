package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_B, c: T_A[T_A[T_B]]) extends T_A[T_B]
case class CC_B(a: T_A[T_B], b: (T_A[T_B],(Int,CC_A)), c: T_A[Char]) extends T_A[((Char,T_B),CC_A)]
case class CC_C(a: T_B) extends T_B
case class CC_D(a: T_A[CC_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_))) => 0 
  case CC_C(CC_C(CC_D(_))) => 1 
  case CC_C(CC_D(_)) => 2 
  case CC_D(_) => 3 
}
}