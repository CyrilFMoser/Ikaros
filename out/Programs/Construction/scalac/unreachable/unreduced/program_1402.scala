package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Char) extends T_A[Char, D]
case class CC_B[E](a: Char, b: E, c: Byte) extends T_A[Char, E]
case class CC_C[F, G](a: (T_A[Int, Int],CC_B[(Byte,Boolean)])) extends T_A[Char, F]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
  case CC_A(_) => 1 
  case CC_B(_, _, 0) => 2 
  case CC_C((_,_)) => 3 
}
}
// This is not matched: CC_B(_, _, _)