package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_B[(Char,Int)]]) extends T_A
case class CC_B(a: T_A, b: T_B[Byte], c: T_A) extends T_A
case class CC_C() extends T_B[T_A]
case class CC_D(a: CC_A, b: T_B[T_A], c: Byte) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, CC_D(CC_A(_, _), _, _), _) => 1 
}
}
// This is not matched: CC_D(_, CC_C(), _)