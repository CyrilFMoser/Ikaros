package Program_13 

object Test {
sealed trait T_A[A]
case class CC_B[E](a: (Char,(Boolean,Char))) extends T_A[E]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(('x',_)) => 0 
}
}
// This is not matched: (CC_B Boolean
//      (CC_D Boolean Boolean)
//      Wildcard
//      Int
//      (T_A Boolean (CC_D Boolean Boolean)))