package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C() extends T_B[Int]
case class CC_D(a: T_B[CC_C], b: (CC_C,CC_C), c: T_A[CC_C]) extends T_B[Int]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_B()) => 0 
}
}
// This is not matched: (CC_B (T_A Char Int) (T_A (T_A Char Int) (CC_A Byte Boolean Boolean)))