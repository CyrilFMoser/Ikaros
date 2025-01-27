package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: Char) extends T_A[T_A[T_A[Char, Byte], T_A[Char, Boolean]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Char, Byte], T_A[Char, Boolean]], D]

val v_a: T_A[T_A[T_A[Char, Byte], T_A[Char, Boolean]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}