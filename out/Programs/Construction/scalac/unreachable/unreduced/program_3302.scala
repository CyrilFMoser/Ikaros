package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[Byte], b: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: T_B[CC_A]) extends T_A
case class CC_C(a: Boolean, b: T_A) extends T_A
case class CC_D(a: T_B[T_A], b: T_A, c: T_B[T_A]) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A(_, _)