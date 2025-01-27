package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int) extends T_A[Char, C]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_A Wildcard
//      Wildcard
//      (Tuple (CC_A Wildcard (CC_A Wildcard Wildcard Wildcard T_A) Wildcard T_A)
//             (CC_B Wildcard Char Wildcard T_A))
//      T_A)