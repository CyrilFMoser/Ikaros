package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, F](a: F) extends T_A[E, F]

val v_a: CC_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_F Char Wildcard Wildcard (T_B Char Int))