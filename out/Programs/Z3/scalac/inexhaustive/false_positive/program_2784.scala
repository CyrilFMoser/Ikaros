package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[T_B[Char], T_B[Char]]
case class CC_B[D](a: T_B[D], b: T_A[CC_A, D]) extends T_B[D]
case class CC_C[E]() extends T_B[E]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_C(), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants