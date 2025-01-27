package Program_29 

package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: T_B) extends T_A[B]
case class CC_B() extends T_B

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_B()) => 0 
  case CC_A(_) => 1 
}
}
// This is not matched: (CC_A Boolean T_B Wildcard (T_A Boolean))
// This is not matched: (CC_A (CC_C Boolean Boolean Boolean)
//      Wildcard
//      (T_A Byte (CC_C Boolean Boolean Boolean)))