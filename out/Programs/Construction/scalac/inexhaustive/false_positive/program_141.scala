package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[Byte, C]
case class CC_B[D](a: (T_A[Int, (Char,Byte)],T_A[Byte, Boolean])) extends T_A[Byte, D]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,CC_A())) => 1 
}
}
// This is not matched: CC_B((_,CC_B(_)))