package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[((Boolean,Char),Boolean)]]
case class CC_B[C](a: Byte, b: Int, c: (Int,((Boolean,Boolean),CC_A))) extends T_B[C]
case class CC_C(a: T_A[(Boolean,CC_A)]) extends T_B[Byte]
case class CC_D() extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_B(_, _, _)