package Program_31 

package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D[B](a: B, b: CC_B) extends T_B[B]
case class CC_E[C](a: CC_C, b: T_B[C]) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_), CC_B()) => 0 
  case CC_E(CC_C(), CC_D(_, _)) => 1 
  case CC_E(_, _) => 2 
}
}
// This is not matched: (CC_E (CC_A T_A T_A)
//      (CC_C T_A)
//      (CC_E Boolean
//            (CC_C T_A)
//            (CC_D Boolean Boolean Wildcard (T_B Boolean))
//            (T_B (CC_A T_A T_A)))
//      (T_B (CC_A T_A T_A)))
// This is not matched: (CC_B Int Wildcard (CC_B Int Int Wildcard (T_A Int)) (T_A Int))