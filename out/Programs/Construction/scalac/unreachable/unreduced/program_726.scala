package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, (T_A[Int, Char],T_A[Int, Char])]
case class CC_B[D](a: CC_A[D], b: T_A[D, D], c: CC_A[D]) extends T_A[D, (T_A[Int, Char],T_A[Int, Char])]
case class CC_C[E](a: CC_B[CC_A[E]], b: CC_A[E], c: Int) extends T_A[E, (T_A[Int, Char],T_A[Int, Char])]

val v_a: T_A[Int, (T_A[Int, Char],T_A[Int, Char])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_B(_, _, _), _, _) => 2 
}
}