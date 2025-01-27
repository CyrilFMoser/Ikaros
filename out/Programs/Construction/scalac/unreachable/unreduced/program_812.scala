package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: T_A[D], b: T_B[D]) extends T_A[D]
case class CC_C() extends T_A[Char]
case class CC_D(a: T_B[Int], b: T_A[Char], c: (T_B[CC_C],(CC_C,CC_C))) extends T_B[Int]
case class CC_E(a: CC_A[Char]) extends T_B[Int]

val v_a: T_A[CC_E] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}