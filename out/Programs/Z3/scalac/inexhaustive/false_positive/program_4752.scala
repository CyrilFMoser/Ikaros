package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[C](a: C) extends T_A[C]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_A T_B Byte (T_A Byte T_B))