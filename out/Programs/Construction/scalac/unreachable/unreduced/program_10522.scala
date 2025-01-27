package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[T_A[Int]], c: T_A[T_A[Byte]]) extends T_A[(T_A[Byte],T_A[Int])]
case class CC_B[B]() extends T_A[(T_A[Byte],T_A[Int])]
case class CC_C(a: Byte, b: CC_B[CC_A]) extends T_A[(T_A[Byte],T_A[Int])]

val v_a: T_A[(T_A[Byte],T_A[Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B()