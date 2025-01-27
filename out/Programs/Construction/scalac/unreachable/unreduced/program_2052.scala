package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: D, b: T_B[E], c: T_A[D, E]) extends T_A[D, E]
case class CC_B(a: T_A[(Byte,Char), T_A[Int, Char]], b: Byte, c: T_A[T_A[Char, Boolean], T_B[Boolean]]) extends T_A[CC_A[T_A[Int, Char], CC_A[Boolean, (Int,Boolean)]], T_A[Char, T_B[Int]]]
case class CC_C(a: Boolean, b: Byte, c: Char) extends T_B[T_B[CC_B]]
case class CC_D(a: T_A[CC_B, CC_B], b: CC_C) extends T_B[T_B[CC_B]]

val v_a: T_A[CC_A[T_A[Int, Char], CC_A[Boolean, (Int,Boolean)]], T_A[Char, T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _, CC_A(_, _, _)) => 0 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _, CC_B(_, _, _)) => 1 
  case CC_B(_, _, _) => 2 
}
}