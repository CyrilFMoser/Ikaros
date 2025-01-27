package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Boolean, Byte], T_A[Char, Boolean]], C]
case class CC_B[D](a: T_A[D, D], b: D, c: Char) extends T_A[T_A[T_A[Boolean, Byte], T_A[Char, Boolean]], D]

val v_a: T_A[T_A[T_A[Boolean, Byte], T_A[Char, Boolean]], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}