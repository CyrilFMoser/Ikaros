package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_D(a: (Byte,Int)) extends T_B[T_A[Byte], T_A[Char]]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D((0,_)) => 0 
}
}
// This is not matched: (CC_A (Tuple (CC_C T_A Int T_A) (CC_C Wildcard Wildcard T_A)) T_A)