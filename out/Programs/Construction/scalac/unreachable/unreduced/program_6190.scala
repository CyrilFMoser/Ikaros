package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]
case class CC_B[C](a: Byte, b: C) extends T_B[C]
case class CC_C[D]() extends T_B[D]
case class CC_D(a: T_A[Char], b: CC_B[CC_A], c: CC_A) extends T_B[T_B[(CC_A,CC_A)]]

val v_a: T_B[T_B[(CC_A,CC_A)]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
  case CC_B(_, CC_C()) => 1 
  case CC_C() => 2 
  case CC_D(_, CC_B(_, _), _) => 3 
}
}