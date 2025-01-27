package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[E, F](a: T_A[E, E], b: T_B) extends T_A[E, F]
case class CC_B[G, H]() extends T_A[G, H]

val v_a: CC_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_A Char Int Boolean Wildcard Wildcard (T_A Char Int))