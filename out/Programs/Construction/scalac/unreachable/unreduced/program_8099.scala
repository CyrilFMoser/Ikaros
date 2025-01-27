package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: CC_A, b: (T_B[Byte],CC_A), c: T_B[T_A]) extends T_A
case class CC_D(a: CC_C, b: Char) extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_A(_, _), (_,CC_A(_, _)), _) => 1 
}
}
// This is not matched: CC_A(_, _)