package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Int]
case class CC_B(a: T_A[T_A[CC_A]]) extends T_A[Int]
case class CC_C(a: Boolean) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(true) => 1 
  case CC_C(false) => 2 
}
}
// This is not matched: CC_A()