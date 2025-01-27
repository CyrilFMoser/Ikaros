package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, D]) extends T_A[C, (T_A[Boolean, Boolean],Int)]
case class CC_B[E](a: CC_A[E, CC_A[E, E]], b: E) extends T_A[E, (T_A[Boolean, Boolean],Int)]

val v_a: T_A[Char, (T_A[Boolean, Boolean],Int)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _) => 1 
}
}