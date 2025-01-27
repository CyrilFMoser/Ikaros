package Program_15 

package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: T_B) extends T_A[B]
case class CC_B() extends T_B
case class CC_C() extends T_B
case class CC_D() extends T_B

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_B()) => 0 
  case CC_A(_) => 1 
}
}
// This is not matched: (CC_A Int T_B Wildcard (T_A Int))
// This is not matched: Pattern match is empty without constants