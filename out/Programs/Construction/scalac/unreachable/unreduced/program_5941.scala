package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[T_A[D, C], C], b: Boolean) extends T_A[C, T_A[T_A[Int, Byte], Byte]]
case class CC_B() extends T_A[Byte, T_A[T_A[Int, Byte], Byte]]

val v_a: T_A[Byte, T_A[T_A[Int, Byte], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}