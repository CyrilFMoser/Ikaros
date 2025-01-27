package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_A[(Boolean,Char)]]]
case class CC_B(a: T_B, b: T_A[T_A[Int]]) extends T_B
case class CC_C() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_C(), _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A()