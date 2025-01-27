package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Byte,(Int,Byte))) extends T_A[C, Int]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A((0,_)) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard T_A)