package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[(Byte,Boolean), (Byte,Boolean)], C]
case class CC_B[D](a: CC_A[D], b: T_A[D, D], c: D) extends T_A[T_A[(Byte,Boolean), (Byte,Boolean)], D]
case class CC_C[E](a: Boolean) extends T_A[T_A[(Byte,Boolean), (Byte,Boolean)], E]

val v_a: T_A[T_A[(Byte,Boolean), (Byte,Boolean)], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(true) => 2 
  case CC_C(false) => 3 
}
}