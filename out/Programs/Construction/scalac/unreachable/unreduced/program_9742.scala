package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[C, C], C]
case class CC_B[D](a: D, b: T_A[D, D], c: D) extends T_A[T_A[D, D], D]
case class CC_C() extends T_A[T_A[T_A[T_A[CC_B[Char], CC_B[Char]], CC_B[Char]], T_A[T_A[CC_B[Char], CC_B[Char]], CC_B[Char]]], T_A[T_A[CC_B[Char], CC_B[Char]], CC_B[Char]]]

val v_a: T_A[T_A[T_A[T_A[CC_B[Char], CC_B[Char]], CC_B[Char]], T_A[T_A[CC_B[Char], CC_B[Char]], CC_B[Char]]], T_A[T_A[CC_B[Char], CC_B[Char]], CC_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
  case CC_B(CC_A(CC_B(_, _, _)), _, CC_A(_)) => 2 
  case CC_B(CC_A(CC_B(_, _, _)), _, CC_B(_, _, _)) => 3 
  case CC_B(CC_B(_, _, _), _, CC_A(_)) => 4 
  case CC_B(CC_B(_, _, _), _, CC_B(_, _, _)) => 5 
  case CC_C() => 6 
}
}