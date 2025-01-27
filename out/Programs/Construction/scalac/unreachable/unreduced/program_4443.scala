package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Int, b: T_A[D, T_B[D]], c: T_A[D, D]) extends T_A[D, T_B[D]]
case class CC_B(a: Char, b: (T_A[Boolean, Int],(Char,Byte)), c: Int) extends T_A[Char, T_B[Char]]
case class CC_C(a: T_A[CC_A[Char], T_B[CC_B]], b: CC_A[CC_A[CC_B]]) extends T_A[Char, T_B[Char]]

val v_a: T_A[Char, T_B[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}