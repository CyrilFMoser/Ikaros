package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char, b: ((Int,Byte),T_A[Boolean]), c: T_B[T_B[Byte]]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: T_A[T_B[CC_A]]) extends T_B[T_A[CC_A]]
case class CC_C() extends T_B[T_A[CC_A]]

val v_a: T_B[T_A[CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
}
}