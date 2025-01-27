package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[(Byte,Byte), C], C]
case class CC_B[D](a: T_A[D, CC_A[D]], b: CC_A[D], c: D) extends T_A[T_A[(Byte,Byte), D], D]
case class CC_C[E]() extends T_A[T_A[(Byte,Byte), E], E]

val v_a: T_A[T_A[(Byte,Byte), Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, 0) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C() => 3 
}
}