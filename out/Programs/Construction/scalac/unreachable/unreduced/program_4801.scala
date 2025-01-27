package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]]) extends T_A[C, (((Int,Byte),Int),T_A[Byte, Int])]
case class CC_B[D]() extends T_A[D, (((Int,Byte),Int),T_A[Byte, Int])]
case class CC_C[E](a: T_A[E, E]) extends T_A[E, (((Int,Byte),Int),T_A[Byte, Int])]

val v_a: T_A[Byte, (((Int,Byte),Int),T_A[Byte, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}