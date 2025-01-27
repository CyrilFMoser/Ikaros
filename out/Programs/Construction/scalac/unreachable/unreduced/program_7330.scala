package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, (T_A[Boolean, Char],T_A[(Char,Boolean), Char])]
case class CC_B[D](a: CC_A[D], b: T_A[D, D]) extends T_A[D, (T_A[Boolean, Char],T_A[(Char,Boolean), Char])]

val v_a: T_A[Char, (T_A[Boolean, Char],T_A[(Char,Boolean), Char])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}