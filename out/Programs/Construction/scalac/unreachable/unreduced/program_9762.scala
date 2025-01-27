package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[Byte, C]
case class CC_B(a: (Char,Boolean), b: CC_A[Byte], c: (T_A[T_B, Int],T_A[Byte, Boolean])) extends T_A[T_A[(T_B,T_B), CC_A[T_B]], T_B]
case class CC_C[D](a: T_A[Byte, D], b: T_A[Byte, D], c: D) extends T_A[Byte, D]
case class CC_D(a: T_B, b: Boolean) extends T_B
case class CC_E(a: T_A[((Boolean,Byte),CC_D), T_A[Byte, CC_B]], b: (CC_B,CC_A[(Char,Boolean)])) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_, _), _) => 0 
  case CC_D(CC_E(_, _), _) => 1 
}
}