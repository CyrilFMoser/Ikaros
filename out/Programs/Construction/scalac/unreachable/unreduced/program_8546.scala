package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Boolean) extends T_A
case class CC_B(a: Boolean, b: (T_B[T_A],T_B[CC_A]), c: T_B[(Int,CC_A)]) extends T_A
case class CC_C(a: T_B[CC_B], b: T_B[(CC_A,CC_B)]) extends T_A
case class CC_D(a: T_B[CC_C]) extends T_B[Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(_, _, _)