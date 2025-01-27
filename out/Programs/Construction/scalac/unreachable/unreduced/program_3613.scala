package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[(Byte,Int), Byte], T_A[Byte, Boolean]], C]
case class CC_B() extends T_A[T_A[Boolean, CC_A[Boolean]], Int]
case class CC_C() extends T_A[T_A[T_A[(Byte,Int), Byte], T_A[Byte, Boolean]], CC_B]

val v_a: T_A[T_A[T_A[(Byte,Int), Byte], T_A[Byte, Boolean]], CC_B] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}