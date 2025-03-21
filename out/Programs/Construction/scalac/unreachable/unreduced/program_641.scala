package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: T_A[T_A[C, C], C], c: C) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[D, T_A[D, D]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(), _, _) => 1 
  case CC_B() => 2 
}
}