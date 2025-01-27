package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: Byte, b: T_A[(Boolean,Byte), (Int,Boolean)]) extends T_A[Byte, T_B[T_A[Byte, Byte], (Byte,Int)]]
case class CC_B(a: CC_A) extends T_A[Byte, T_B[T_A[Byte, Byte], (Byte,Int)]]
case class CC_C(a: CC_A) extends T_A[Byte, T_B[T_A[Byte, Byte], (Byte,Int)]]
case class CC_D[E, F](a: T_B[F, F]) extends T_B[E, F]

val v_a: T_A[Byte, T_B[T_A[Byte, Byte], (Byte,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_)