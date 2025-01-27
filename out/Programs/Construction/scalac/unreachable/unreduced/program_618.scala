package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Byte], T_A[Byte]], b: Byte) extends T_A[Byte]
case class CC_B(a: Char) extends T_A[Byte]
case class CC_C[D](a: CC_B, b: D) extends T_B[Char, D]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}