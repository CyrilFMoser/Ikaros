package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[T_A], b: T_A) extends T_B[T_B[T_A]]
case class CC_C(a: T_A) extends T_B[T_B[T_A]]
case class CC_D(a: T_B[T_B[Char]]) extends T_B[T_B[T_A]]

val v_a: T_B[T_B[T_A]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_A(CC_A(_))) => 1 
}
}
// This is not matched: CC_D(_)