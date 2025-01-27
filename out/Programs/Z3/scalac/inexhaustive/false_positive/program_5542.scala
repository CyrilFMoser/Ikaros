package Program_15 

package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: T_A, c: CC_A) extends T_A
case class CC_D[B, C](a: T_B[C], b: (CC_B,CC_C)) extends T_B[B]

val v_a: CC_D[T_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_, _), (CC_B(),CC_C(_, _, _))) => 0 
}
}
// This is not matched: (CC_D T_A
//      (CC_A (T_B T_A) T_A)
//      (CC_D (CC_A T_A T_A) T_A Wildcard Wildcard (T_B (CC_A T_A T_A)))
//      Wildcard
//      (T_B T_A))
// This is not matched: (CC_B (T_A Int))