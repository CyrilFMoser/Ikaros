package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, D], b: C) extends T_A[C, D]
case class CC_B[F, E]() extends T_A[E, F]

val v_a: CC_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants