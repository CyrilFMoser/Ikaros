package Program_21 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[(Boolean,Boolean)]]
case class CC_B(a: CC_A) extends T_A[T_A[(Boolean,Boolean)]]
case class CC_C(a: CC_B, b: Char, c: T_A[Byte]) extends T_A[T_A[(Boolean,Boolean)]]

val v_a: T_A[T_A[(Boolean,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A()) => 1 
  case CC_C(_, _, _) => 2 
}
}