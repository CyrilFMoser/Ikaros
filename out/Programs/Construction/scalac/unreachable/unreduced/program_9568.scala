package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[C, T_A[T_A[Int, Byte], T_A[Char, Boolean]]]
case class CC_B[D]() extends T_A[D, T_A[T_A[Int, Byte], T_A[Char, Boolean]]]

val v_a: T_A[Char, T_A[T_A[Int, Byte], T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}