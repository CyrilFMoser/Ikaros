package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: CC_A, c: CC_A) extends T_A
case class CC_C[C](a: C, b: CC_B, c: C) extends T_B[C, T_B[C, C]]
case class CC_D[D](a: Char, b: T_B[D, D], c: Byte) extends T_B[D, T_B[D, D]]

val v_a: T_B[T_A, T_B[T_A, T_A]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), _, _) => 0 
  case CC_C(CC_B(_, _, _), _, _) => 1 
  case CC_D(_, _, _) => 2 
}
}