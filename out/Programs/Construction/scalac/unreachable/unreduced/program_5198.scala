package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char], b: T_A[(Byte,Boolean)]) extends T_A[T_A[(Boolean,Boolean)]]
case class CC_B(a: CC_A) extends T_A[T_A[(Boolean,Boolean)]]
case class CC_C() extends T_A[T_A[(Boolean,Boolean)]]

val v_a: T_A[T_A[(Boolean,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _)) => 1 
  case CC_C() => 2 
}
}