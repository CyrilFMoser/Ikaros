package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_D(a: (T_A,T_A), b: T_B[T_A]) extends T_B[T_B[T_A]]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D((_,CC_A()), _) => 0 
}
}
// This is not matched: (CC_D (Tuple (CC_B (CC_A T_A T_A) Wildcard (CC_A T_A T_A) T_A)
//             (CC_B (CC_A T_A T_A) Byte (CC_A (T_B T_A) T_A) T_A))
//      Wildcard
//      Wildcard
//      (T_B (T_B T_A)))