package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[C, C], C]
case class CC_B(a: CC_A[T_A[Int, Boolean]], b: CC_A[CC_A[Int]], c: T_A[Char, CC_A[Int]]) extends T_A[T_A[T_A[T_A[Char, Char], Char], T_A[T_A[Char, Char], Char]], T_A[T_A[Char, Char], Char]]
case class CC_C[D](a: Byte, b: D, c: Byte) extends T_A[T_A[T_A[T_A[Char, Char], Char], T_A[T_A[Char, Char], Char]], T_A[T_A[Char, Char], Char]]

val v_a: T_A[T_A[T_A[T_A[T_A[T_A[Char, Char], Char], T_A[T_A[Char, Char], Char]], T_A[T_A[Char, Char], Char]], T_A[T_A[T_A[T_A[Char, Char], Char], T_A[T_A[Char, Char], Char]], T_A[T_A[Char, Char], Char]]], T_A[T_A[T_A[T_A[Char, Char], Char], T_A[T_A[Char, Char], Char]], T_A[T_A[Char, Char], Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(CC_A(_), _, _)) => 1 
}
}
// This is not matched: CC_A(CC_C(_, _, _))