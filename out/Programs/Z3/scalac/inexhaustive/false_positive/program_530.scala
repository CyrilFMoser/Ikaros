package Program_31 

package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]
case class CC_B[D](a: D, b: Boolean, c: D) extends T_A[D]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: (CC_A Boolean Boolean (T_A Boolean))
// This is not matched: (CC_B Int
//      (CC_B Int Wildcard Wildcard (T_A Int))
//      (CC_A Byte Wildcard (T_A Byte))
//      (T_A Int))