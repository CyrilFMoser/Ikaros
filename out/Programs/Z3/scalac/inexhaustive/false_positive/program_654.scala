package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B(a: Int) extends T_A[T_A[Char, (Byte,Boolean)], T_B[Int]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_B (Tuple (CC_A Wildcard T_A) (CC_B Wildcard T_A)) T_A)