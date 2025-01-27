package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: T_B[T_A, (T_A,T_A)], c: Int) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D[C](a: T_B[C, C], b: C, c: CC_C) extends T_B[C, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _)) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_, _, _)