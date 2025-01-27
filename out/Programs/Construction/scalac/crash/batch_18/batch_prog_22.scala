package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[C, D], b: Char, c: C) extends T_A[D, C]

val v_a: CC_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}