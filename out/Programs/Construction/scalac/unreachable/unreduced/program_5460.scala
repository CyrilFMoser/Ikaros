package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[Int]]
case class CC_B(a: T_A[T_B]) extends T_A[T_A[Int]]
case class CC_C() extends T_A[T_A[Int]]
case class CC_D(a: Byte) extends T_B
case class CC_E() extends T_B

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C()