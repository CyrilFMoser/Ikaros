package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_B[D], c: T_B[D]) extends T_A[D, T_A[D, T_A[D, Boolean]]]
case class CC_B(a: CC_A[CC_A[(Char,Byte)]], b: Char, c: T_B[T_A[Byte, Int]]) extends T_A[T_A[T_A[Int, Char], CC_A[Char]], T_A[T_A[T_A[Int, Char], CC_A[Char]], T_A[T_A[T_A[Int, Char], CC_A[Char]], Boolean]]]
case class CC_C(a: CC_B) extends T_A[T_A[T_A[Int, Char], CC_A[Char]], T_A[T_A[T_A[Int, Char], CC_A[Char]], T_A[T_A[T_A[Int, Char], CC_A[Char]], Boolean]]]

val v_a: T_A[T_A[T_A[Int, Char], CC_A[Char]], T_A[T_A[T_A[Int, Char], CC_A[Char]], T_A[T_A[T_A[Int, Char], CC_A[Char]], Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), 'x', _) => 1 
  case CC_C(CC_B(_, _, _)) => 2 
}
}
// This is not matched: CC_B(CC_A(_, _, _), _, _)