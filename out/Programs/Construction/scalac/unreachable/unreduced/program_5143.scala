package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, (Char,((Char,Byte),Boolean))]
case class CC_B[D](a: Byte) extends T_A[D, (Char,((Char,Byte),Boolean))]
case class CC_C[E]() extends T_A[E, (Char,((Char,Byte),Boolean))]

val v_a: T_A[Char, (Char,((Char,Byte),Boolean))] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}