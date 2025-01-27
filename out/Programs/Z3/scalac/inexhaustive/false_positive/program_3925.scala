package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[F, E](a: (Byte,Boolean)) extends T_A[F, E]

val v_a: CC_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A((0,_)) => 0 
}
}
// This is not matched: (CC_B (CC_A Wildcard Wildcard (CC_A Int Wildcard Wildcard T_A) T_A)
//      Wildcard
//      Wildcard
//      T_A)