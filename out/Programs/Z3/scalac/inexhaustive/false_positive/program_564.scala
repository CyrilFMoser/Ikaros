package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B[F, E](a: E, b: (Char,Char)) extends T_A[E, F]
case class CC_D() extends T_B[T_B[Char]]

val v_a: T_A[T_B[Char], CC_D] = null
val v_b: Int = v_a match{
  case CC_B(_, ('x',_)) => 0 
}
}
// This is not matched: (CC_C (CC_D Boolean Boolean Boolean Boolean)
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (T_B Char) (CC_D Boolean Boolean Boolean Boolean)))