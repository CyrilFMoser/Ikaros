package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Boolean, Byte],T_A[Byte, Int])) extends T_A[C, T_A[T_A[Int, Char], T_A[Char, Boolean]]]
case class CC_B[D](a: D, b: CC_A[D], c: CC_A[D]) extends T_A[D, T_A[T_A[Int, Char], T_A[Char, Boolean]]]

val v_a: T_A[Byte, T_A[T_A[Int, Char], T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, _, _) => 1 
}
}