package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: C) extends T_A[C, Byte]
case class CC_B[D]() extends T_A[D, Byte]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, 'x') => 0 
  case CC_A(_, _, _) => 1 
  case CC_B() => 2 
}
}