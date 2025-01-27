package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[(Boolean,Boolean), Byte], T_A[Byte, Int]], C]
case class CC_B[D](a: D) extends T_A[D, Byte]

val v_a: T_A[T_A[T_A[(Boolean,Boolean), Byte], T_A[Byte, Int]], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}