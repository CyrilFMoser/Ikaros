package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[((Boolean,Byte),T_A[Int, Byte]), C]
case class CC_B[E](a: T_A[E, T_A[E, E]], b: CC_A[E, E], c: CC_A[E, T_A[E, E]]) extends T_A[((Boolean,Byte),T_A[Int, Byte]), E]

val v_a: T_A[((Boolean,Byte),T_A[Int, Byte]), Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), CC_A()) => 1 
}
}