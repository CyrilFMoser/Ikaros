package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[(T_A[Int, Byte],T_A[Boolean, Boolean]), C]
case class CC_B[D](a: (CC_A[Int],T_A[Boolean, Byte])) extends T_A[(T_A[Int, Byte],T_A[Boolean, Boolean]), D]
case class CC_C[E]() extends T_A[(T_A[Int, Byte],T_A[Boolean, Boolean]), E]

val v_a: T_A[(T_A[Int, Byte],T_A[Boolean, Boolean]), Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),_)) => 1 
  case CC_C() => 2 
}
}