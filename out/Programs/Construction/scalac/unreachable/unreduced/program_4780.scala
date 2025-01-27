package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[Int]
case class CC_B(a: (CC_A,T_A[CC_A]), b: (T_A[Int],Char)) extends T_B
case class CC_C(a: T_A[CC_A], b: T_A[Int]) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, CC_A()) => 1 
}
}
// This is not matched: CC_D()