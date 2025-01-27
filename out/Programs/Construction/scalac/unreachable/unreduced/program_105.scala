package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: (T_B[Boolean],Boolean), b: T_B[Byte], c: T_B[T_B[Char]]) extends T_A
case class CC_C(a: CC_B, b: T_B[T_B[T_A]]) extends T_B[T_B[T_A]]
case class CC_D(a: T_B[T_B[T_A]], b: CC_B) extends T_B[T_B[T_A]]
case class CC_E(a: CC_B, b: CC_A) extends T_B[T_B[T_A]]

val v_a: T_B[T_B[T_A]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_C(_, _), CC_B(_, _, _)) => 1 
  case CC_D(CC_D(_, _), CC_B(_, _, _)) => 2 
  case CC_D(CC_E(_, _), CC_B(_, _, _)) => 3 
}
}
// This is not matched: CC_E(CC_B(_, _, _), _)