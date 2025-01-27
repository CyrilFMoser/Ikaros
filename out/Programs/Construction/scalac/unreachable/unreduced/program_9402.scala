package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_A[Int]]]
case class CC_B() extends T_A[T_B[CC_A]]
case class CC_C(a: T_A[T_B[CC_A]], b: T_A[(Byte,CC_B)]) extends T_A[T_B[CC_A]]

val v_a: T_A[T_B[CC_A]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
}
}