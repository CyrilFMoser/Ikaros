package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[(Boolean,Char)]]
case class CC_B(a: Int, b: T_A[CC_A], c: T_A[Int]) extends T_A[T_B[(Boolean,Char)]]
case class CC_C() extends T_A[T_B[(Boolean,Char)]]
case class CC_D[C]() extends T_B[C]
case class CC_E(a: T_B[T_B[CC_A]]) extends T_B[T_B[T_B[CC_C]]]
case class CC_F(a: (CC_A,CC_C), b: T_A[CC_A]) extends T_B[T_B[T_B[CC_C]]]

val v_a: T_A[T_B[(Boolean,Char)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C()