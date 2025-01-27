package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_B, b: T_B) extends T_A[T_A[T_B]]
case class CC_B(a: (T_A[T_B],T_A[T_B]), b: Char) extends T_B
case class CC_C(a: CC_A[CC_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B((_,_), _) => 0 
  case CC_C(_) => 1 
}
}