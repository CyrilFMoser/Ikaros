package Program_61 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[(T_B,T_B)]
case class CC_B(a: T_A[CC_A], b: T_B) extends T_A[T_A[CC_A]]
case class CC_D() extends T_B
case class CC_E() extends T_B

val v_a: T_A[T_A[CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_D()) => 0 
}
}
// This is not matched: (CC_A (T_A T_B))