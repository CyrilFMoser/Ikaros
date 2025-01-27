package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int) extends T_A[C, Char]
case class CC_B[D]() extends T_A[D, Char]
case class CC_C[E](a: T_A[E, E], b: CC_B[E]) extends T_A[E, Char]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}