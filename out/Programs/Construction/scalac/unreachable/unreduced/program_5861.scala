package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[(T_A[T_B],T_A[T_B])]
case class CC_B(a: CC_A, b: T_A[T_B]) extends T_B
case class CC_C(a: Int) extends T_B
case class CC_D(a: T_A[(CC_A,T_B)], b: (CC_C,T_A[CC_B])) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: CC_B(_, _)