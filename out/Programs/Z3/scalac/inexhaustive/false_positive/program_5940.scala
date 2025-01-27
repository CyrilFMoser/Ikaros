package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, F](a: (Int,Boolean)) extends T_A[E, F]

val v_a: CC_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A((12,_)) => 0 
}
}
// This is not matched: (CC_A Wildcard (T_A (T_A Boolean)))