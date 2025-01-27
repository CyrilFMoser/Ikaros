package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B, Char], T_A[T_B, T_B]]) extends T_A[T_B, T_A[T_B, T_B]]
case class CC_B(a: T_B, b: T_B) extends T_A[T_B, T_A[T_B, T_B]]
case class CC_C(a: CC_A, b: ((CC_B,CC_A),(CC_A,T_B)), c: T_B) extends T_A[T_B, T_A[T_B, T_B]]

val v_a: T_A[T_B, T_A[T_B, T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(_), _, _) => 2 
}
}