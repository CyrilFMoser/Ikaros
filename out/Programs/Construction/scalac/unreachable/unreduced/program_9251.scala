package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Byte, Char], T_A[Int, Boolean]]]
case class CC_B[D](a: T_A[D, D], b: Char) extends T_A[D, T_A[T_A[Byte, Char], T_A[Int, Boolean]]]
case class CC_C[E](a: E, b: (T_A[Byte, Int],T_A[Byte, Byte]), c: (Int,T_A[Char, Char])) extends T_A[E, T_A[T_A[Byte, Char], T_A[Int, Boolean]]]

val v_a: T_A[Int, T_A[T_A[Byte, Char], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}