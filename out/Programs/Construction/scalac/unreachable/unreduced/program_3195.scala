package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, Byte]
case class CC_B[E](a: T_A[E, T_A[E, Byte]]) extends T_A[E, Byte]
case class CC_C() extends T_A[T_A[CC_B[(Int,Int)], Byte], Byte]

val v_a: T_A[T_A[T_A[CC_B[(Int,Int)], Byte], Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}