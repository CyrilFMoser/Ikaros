package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, F](a: E) extends T_A[E, F]

val v_a: CC_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_A Char Int Boolean Wildcard Wildcard (T_A Char Int))