package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Char],T_A[Int, Byte]), b: Int) extends T_A[C, T_A[T_A[Int, Char], Byte]]
case class CC_B[D](a: Char, b: Boolean) extends T_A[D, T_A[T_A[Int, Char], Byte]]

val v_a: T_A[Char, T_A[T_A[Int, Char], Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B(_, _) => 1 
}
}