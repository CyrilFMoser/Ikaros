package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[(Char,Int), Int],T_A[Byte, Boolean])) extends T_A[C, T_A[T_A[Byte, Boolean], T_A[Char, Int]]]
case class CC_B[D, E](a: CC_A[E]) extends T_A[D, T_A[T_A[Byte, Boolean], T_A[Char, Int]]]

val v_a: T_A[Int, T_A[T_A[Byte, Boolean], T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_) => 1 
}
}