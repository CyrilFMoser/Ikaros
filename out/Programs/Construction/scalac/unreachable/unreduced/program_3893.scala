package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: Byte) extends T_A[C, T_A[T_A[Char, Byte], T_A[Char, Int]]]
case class CC_B[D](a: T_A[D, D], b: D, c: ((Char,Boolean),T_A[Int, (Char,Int)])) extends T_A[D, T_A[T_A[Char, Byte], T_A[Char, Int]]]

val v_a: T_A[Int, T_A[T_A[Char, Byte], T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(true, _) => 0 
  case CC_A(false, _) => 1 
  case CC_B(_, _, _) => 2 
}
}