package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Int]], b: T_A[T_B[Char]], c: (T_B[Char],T_B[Byte])) extends T_A[T_A[T_B[Int]]]
case class CC_B(a: T_A[(CC_A,CC_A)], b: T_A[T_A[CC_A]], c: T_B[Int]) extends T_B[(T_B[Int],T_A[CC_A])]
case class CC_C() extends T_B[(T_B[Int],T_A[CC_A])]
case class CC_D[C]() extends T_B[C]

val v_a: T_B[(T_B[Int],T_A[CC_A])] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_C()