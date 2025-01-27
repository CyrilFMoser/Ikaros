package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[T_B, T_B]]
case class CC_C(a: T_A[Byte, T_B], b: Char, c: T_B) extends T_B
case class CC_D() extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_C(_, _, _)) => 0 
}
}
// This is not matched: (CC_A Boolean
//      Char
//      (CC_A Char Char Wildcard Wildcard (T_A Char Char))
//      Wildcard
//      (T_A Boolean Char))