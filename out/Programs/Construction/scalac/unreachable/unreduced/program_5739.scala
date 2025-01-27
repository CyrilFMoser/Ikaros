package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: CC_B, b: Char, c: CC_A) extends T_B[CC_A]
case class CC_D(a: T_B[T_B[T_A]]) extends T_B[CC_A]
case class CC_E(a: T_B[T_B[CC_A]]) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A(CC_A(_, _), CC_A(_, _))) => 0 
  case CC_C(_, _, CC_A(CC_B(_), CC_A(_, _))) => 1 
  case CC_C(_, _, CC_A(CC_A(_, _), CC_B(_))) => 2 
  case CC_D(_) => 3 
  case CC_E(_) => 4 
}
}
// This is not matched: CC_C(_, _, CC_A(CC_B(_), CC_B(_)))