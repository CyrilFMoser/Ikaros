package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_B]
case class CC_B(a: CC_A) extends T_B
case class CC_C(a: Int, b: CC_A) extends T_B
case class CC_D(a: T_A[CC_A], b: (CC_B,CC_A)) extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(CC_A(_))) => 0 
  case CC_A(CC_D(_, _)) => 1 
}
}
// This is not matched: CC_A(CC_C(_, _))