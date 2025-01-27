package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[T_B, C], c: T_B) extends T_A[T_B, C]
case class CC_B(a: T_B) extends T_B
case class CC_C(a: T_B, b: T_A[Int, T_B], c: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_B(CC_B(_)), _, CC_B(_)) => 1 
  case CC_C(CC_C(_, _, _), _, CC_B(_)) => 2 
}
}
// This is not matched: CC_C(CC_B(CC_C(_, _, _)), _, CC_B(_))