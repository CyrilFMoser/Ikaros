package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte, b: T_A[T_B[Boolean]]) extends T_A[T_A[(Int,Byte)]]
case class CC_B[C]() extends T_B[C]
case class CC_C[D]() extends T_B[T_A[Int]]
case class CC_D(a: T_A[(CC_A,Int)], b: CC_C[Byte]) extends T_B[T_A[Int]]

val v_a: T_B[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, CC_C()) => 1 
}
}
// This is not matched: CC_B()