package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int) extends T_A[C, (Boolean,Boolean)]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_B Byte Boolean Wildcard (T_A Byte))