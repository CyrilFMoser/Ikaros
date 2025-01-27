package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_A[Boolean, (Byte,Byte)], D]
case class CC_B(a: CC_A[((Byte,Boolean),Int)], b: Char) extends T_B[T_B[T_B[Char]]]
case class CC_C() extends T_B[T_B[T_B[Char]]]
case class CC_D(a: Byte, b: T_A[Byte, Byte]) extends T_B[T_B[T_B[Char]]]

val v_a: T_B[T_B[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: CC_C()