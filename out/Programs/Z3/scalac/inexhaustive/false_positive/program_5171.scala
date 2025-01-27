package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[F, E](a: F) extends T_A[E, F]

val v_a: CC_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_A Char
//      Wildcard
//      Wildcard
//      (CC_A Char Boolean Wildcard Wildcard (T_A Char))
//      (T_A Char))