package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: (T_A[Byte, Byte],(Int,Boolean))) extends T_A[T_A[D, D], D]
case class CC_B() extends T_A[T_A[Byte, Byte], Byte]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}