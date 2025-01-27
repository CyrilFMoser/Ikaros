package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Int]
case class CC_B(a: (CC_A,T_A[Int]), b: T_A[T_A[Int]]) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),CC_A()), _) => 1 
}
}
// This is not matched: CC_B((CC_A(),CC_B(_, _)), _)