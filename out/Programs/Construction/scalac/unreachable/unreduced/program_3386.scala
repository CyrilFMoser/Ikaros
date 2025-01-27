package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, (T_A[Char, Byte],Boolean)]
case class CC_B[D](a: T_A[D, D], b: D, c: D) extends T_A[D, (T_A[Char, Byte],Boolean)]
case class CC_C[E](a: CC_B[T_A[E, E]]) extends T_A[E, (T_A[Char, Byte],Boolean)]

val v_a: T_A[Boolean, (T_A[Char, Byte],Boolean)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_B(_, _, _)) => 2 
}
}