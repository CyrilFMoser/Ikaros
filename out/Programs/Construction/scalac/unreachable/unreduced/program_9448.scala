package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: D, b: Boolean) extends T_A[E, D]
case class CC_B(a: T_A[Int, T_B[Int]], b: (T_A[Char, (Int,Byte)],T_A[Char, Byte])) extends T_B[T_A[T_B[Byte], (Byte,Byte)]]
case class CC_C(a: CC_B) extends T_B[T_A[T_B[Byte], (Byte,Byte)]]

val v_a: T_B[T_A[T_B[Byte], (Byte,Byte)]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _) => 0 
  case CC_C(CC_B(_, _)) => 1 
}
}