package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Boolean) extends T_A[T_B, C]
case class CC_B[D](a: T_A[T_B, T_A[T_B, D]], b: D, c: T_A[D, D]) extends T_A[T_B, D]
case class CC_C(a: CC_B[T_B], b: Byte, c: T_B) extends T_B
case class CC_D(a: T_A[CC_B[T_B], (CC_C,T_B)]) extends T_B
case class CC_E(a: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _, _), _, CC_C(_, _, _)) => 0 
  case CC_C(CC_B(_, _, _), _, CC_D(_)) => 1 
  case CC_C(CC_B(_, _, _), _, CC_E(_)) => 2 
  case CC_D(_) => 3 
  case CC_E(CC_C(_, _, _)) => 4 
}
}