package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: C) extends T_A[C, T_A[T_A[Char, Byte], T_A[Char, Int]]]
case class CC_B[D]() extends T_A[D, T_A[T_A[Char, Byte], T_A[Char, Int]]]

val v_a: T_A[Boolean, T_A[T_A[Char, Byte], T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, true) => 0 
  case CC_A(_, _, false) => 1 
  case CC_B() => 2 
}
}