package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B) extends T_A[B]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_B Boolean Wildcard (T_A Boolean))