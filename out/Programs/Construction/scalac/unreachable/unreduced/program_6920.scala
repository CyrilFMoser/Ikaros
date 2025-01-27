package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Int, b: D, c: T_A[D, C]) extends T_A[C, T_A[T_A[Byte, Int], T_A[Byte, Byte]]]
case class CC_B() extends T_A[T_A[CC_A[Int, Boolean], Char], T_A[T_A[Byte, Int], T_A[Byte, Byte]]]

val v_a: T_A[T_A[CC_A[Int, Boolean], Char], T_A[T_A[Byte, Int], T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}