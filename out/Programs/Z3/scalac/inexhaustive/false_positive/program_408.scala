package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B(a: Int) extends T_A[T_A[Boolean, (Boolean,Byte)], T_A[Byte, Boolean]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard (T_A (T_A Int)))