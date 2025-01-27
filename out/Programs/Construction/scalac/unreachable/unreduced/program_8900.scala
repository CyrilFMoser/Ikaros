package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[Char, Char]]
case class CC_B[D](a: Char, b: T_A[Byte, (Char,Char)]) extends T_A[D, T_A[Char, Char]]
case class CC_C(a: T_A[CC_B[Boolean], T_A[Char, Char]]) extends T_A[T_A[T_A[Int, Char], T_A[Char, Char]], T_A[Char, Char]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}