package Program_31 

package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean Boolean (T_A Boolean))
// This is not matched: (CC_C Byte
//      Int
//      Wildcard
//      (CC_A T_B (T_A T_B Int))
//      (CC_B Int (T_A Int Int))
//      (T_A Int Byte))