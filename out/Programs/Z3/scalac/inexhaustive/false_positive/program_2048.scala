package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, Boolean], b: Byte) extends T_A[C, T_B]

val v_a: T_A[Char, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A Boolean))