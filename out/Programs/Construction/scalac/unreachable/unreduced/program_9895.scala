package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_B) extends T_A[Boolean, T_B]
case class CC_B(a: (T_A[T_B, T_B],Boolean), b: T_A[Boolean, T_B]) extends T_B
case class CC_C(a: T_B) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_B((_,_), _)) => 0 
  case CC_C(CC_C(CC_B(_, _))) => 1 
  case CC_C(CC_C(CC_C(_))) => 2 
}
}