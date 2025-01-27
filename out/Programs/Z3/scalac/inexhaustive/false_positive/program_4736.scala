package Program_15 

object Test {
sealed trait T_A[A]
case class CC_C(a: Int) extends T_A[T_A[Char]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_A Int
//      Wildcard
//      (CC_A Int Wildcard (CC_B Int (T_A Int)) Wildcard (T_A Int))
//      (CC_A Int Int (CC_B Int (T_A Int)) Wildcard (T_A Int))
//      (T_A Int))