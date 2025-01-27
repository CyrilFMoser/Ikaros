package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: Char) extends T_A[Char, C]
case class CC_B[D]() extends T_A[Char, D]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, 0, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B() => 2 
}
}