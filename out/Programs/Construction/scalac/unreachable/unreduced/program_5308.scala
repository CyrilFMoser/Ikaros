package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[(Byte,Boolean), T_A[(Byte,Byte)]], b: Int) extends T_A[T_A[T_B[Byte, Byte]]]
case class CC_B(a: Int, b: Boolean, c: T_B[CC_A, CC_A]) extends T_A[T_A[T_B[Byte, Byte]]]
case class CC_C() extends T_A[T_A[T_B[Byte, Byte]]]
case class CC_D[E, D](a: D) extends T_B[E, D]
case class CC_E[F](a: Int, b: CC_A) extends T_B[F, CC_C]

val v_a: T_A[T_A[T_B[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_), _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}