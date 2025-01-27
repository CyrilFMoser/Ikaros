package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[Char, C]
case class CC_B[D](a: T_A[CC_A[D], D], b: Int) extends T_A[Char, D]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, 12) => 1 
  case CC_B(_, _) => 2 
}
}