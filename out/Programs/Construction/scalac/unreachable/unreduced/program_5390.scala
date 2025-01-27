package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_A[Char]]
case class CC_B() extends T_B
case class CC_C(a: T_A[Byte], b: T_A[T_A[Char]]) extends T_B
case class CC_D(a: T_B, b: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_D(CC_B(), CC_C(_, _)) => 1 
  case CC_D(CC_C(_, CC_A(_)), CC_C(_, _)) => 2 
  case CC_D(CC_D(_, _), CC_C(_, _)) => 3 
}
}
// This is not matched: CC_C(_, _)