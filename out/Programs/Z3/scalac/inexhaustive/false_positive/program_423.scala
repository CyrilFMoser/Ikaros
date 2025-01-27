package Program_31 

package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B[B]() extends T_B[B]
case class CC_C[C, D](a: C) extends T_B[C]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_)) => 1 
}
}
// This is not matched: (CC_C T_A T_A Wildcard (T_B T_A))
// This is not matched: (CC_A T_A)