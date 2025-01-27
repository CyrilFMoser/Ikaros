package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[((Boolean,Int),T_A[Char])]
case class CC_B(a: T_A[Byte]) extends T_A[((Boolean,Int),T_A[Char])]
case class CC_C[E, D]() extends T_B[E, D]

val v_a: T_A[((Boolean,Int),T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}