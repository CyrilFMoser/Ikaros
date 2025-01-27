package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[Int]]
case class CC_C() extends T_B
case class CC_D(a: (T_B,(Int,Int)), b: T_A[Char]) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D((CC_C(),_), _) => 0 
}
}
// This is not matched: (CC_D (CC_A T_A T_A)
//      Wildcard
//      (CC_B (CC_A (T_B T_A) T_A) (T_B (CC_A (T_B T_A) T_A)))
//      Wildcard
//      (T_B (CC_A T_A T_A)))