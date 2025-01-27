package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (T_A[Byte, Boolean],(Int,Boolean)), b: T_A[Byte, T_A[Int, Char]]) extends T_A[Int, T_A[T_A[Char, Boolean], T_A[Byte, Int]]]
case class CC_B(a: CC_A, b: CC_A, c: Int) extends T_A[Int, T_A[T_A[Char, Boolean], T_A[Byte, Int]]]
case class CC_C() extends T_A[Int, T_A[T_A[Char, Boolean], T_A[Byte, Int]]]

val v_a: T_A[Int, T_A[T_A[Char, Boolean], T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_)), _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}