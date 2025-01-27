package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[Int]]
case class CC_B[D](a: T_A[D], b: T_B[D, Char]) extends T_A[D]
case class CC_C() extends T_B[T_A[T_B[Byte, CC_A]], T_A[T_B[CC_A, (Byte,Byte)]]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
}
}
// This is not matched: CC_A()