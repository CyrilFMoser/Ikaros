package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, (Byte,T_A[(Char,Boolean), Boolean])]
case class CC_B[D](a: CC_A[D], b: Int, c: T_A[D, D]) extends T_A[D, (Byte,T_A[(Char,Boolean), Boolean])]
case class CC_C() extends T_A[Char, (Byte,T_A[(Char,Boolean), Boolean])]

val v_a: T_A[Char, (Byte,T_A[(Char,Boolean), Boolean])] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A()