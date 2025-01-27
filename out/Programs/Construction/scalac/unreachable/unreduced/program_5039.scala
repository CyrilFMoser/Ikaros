package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Byte], b: Int) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A, b: CC_A) extends T_A
case class CC_D[C](a: C) extends T_B[T_B[C, C], C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_, _), CC_A(_, _)) => 1 
}
}
// This is not matched: CC_A(_, _)