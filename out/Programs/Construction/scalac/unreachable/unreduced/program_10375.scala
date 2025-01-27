package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: Byte, b: CC_A, c: T_B[T_B[(Int,Int)]]) extends T_A
case class CC_C(a: T_A, b: T_B[T_A]) extends T_A
case class CC_D(a: CC_C) extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), _) => 1 
}
}
// This is not matched: CC_C(_, _)