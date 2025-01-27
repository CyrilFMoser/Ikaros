package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[E, E], b: Char) extends T_A[E, F]
case class CC_B[G]() extends T_B[Boolean, G]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: (CC_D Byte
//      (T_A Boolean Char)
//      Wildcard
//      Wildcard
//      (CC_C Wildcard Wildcard (T_A Boolean Char))
//      (T_B Byte (T_A Boolean Char)))