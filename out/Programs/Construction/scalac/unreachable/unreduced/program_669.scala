package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_B[Int, E], b: T_A[E], c: T_A[E]) extends T_B[Int, E]
case class CC_C(a: T_B[Int, T_A[(Char,Boolean)]], b: T_B[(Int,Int), T_B[Char, Char]], c: (Byte,T_A[Boolean])) extends T_B[Int, T_B[Int, T_B[Int, Byte]]]

val v_a: T_B[Int, T_B[Int, T_B[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _, _), CC_A(_), _) => 0 
  case CC_C(CC_B(_, _, _), _, (_,_)) => 1 
}
}
// This is not matched: CC_B(CC_C(_, _, _), CC_A(_), _)