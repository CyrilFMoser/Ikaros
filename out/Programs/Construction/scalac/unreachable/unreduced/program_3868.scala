package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[(T_A[Boolean, T_B],T_B), C]
case class CC_B() extends T_B
case class CC_C(a: T_A[T_A[CC_B, CC_B], Char], b: Char) extends T_B
case class CC_D(a: CC_A[T_A[CC_B, CC_C]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
  case CC_D(_) => 2 
}
}