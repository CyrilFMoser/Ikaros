package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_B, c: T_A[Boolean]) extends T_A[T_B]
case class CC_B(a: T_B, b: T_A[CC_A], c: CC_A) extends T_A[T_B]
case class CC_C(a: Boolean, b: Char) extends T_A[T_B]

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, CC_A(_, _, _)) => 1 
  case CC_C(_, _) => 2 
}
}