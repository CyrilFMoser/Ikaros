package Program_15 

package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D) extends T_A[D]
case class CC_B[E, F, G](a: T_A[E], b: ((Char,Char),Boolean), c: T_A[E]) extends T_B[E, F]
case class CC_C[I, H]() extends T_B[H, I]

val v_a: T_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_B(CC_A(_), _, _) => 1 
}
}
// This is not matched: (CC_B Byte
//      Byte
//      Boolean
//      Wildcard
//      (Tuple Wildcard Wildcard)
//      (CC_A Byte Wildcard (T_A Byte))
//      (T_B Byte Byte))
// This is not matched: (CC_B Byte Byte Boolean Wildcard Wildcard Wildcard (T_B Byte Byte))