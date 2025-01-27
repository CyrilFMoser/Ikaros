package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: Byte) extends T_A[T_A[T_A[Char, Char], T_A[Int, Char]], C]
case class CC_B[D](a: (T_A[Int, Boolean],Int), b: Int) extends T_A[T_A[T_A[Char, Char], T_A[Int, Char]], D]

val v_a: T_A[T_A[T_A[Char, Char], T_A[Int, Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((_,_), _) => 1 
}
}