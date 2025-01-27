package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]]) extends T_A[T_A[(Char,Boolean)]]
case class CC_B(a: CC_A, b: CC_A, c: Char) extends T_A[T_A[(Char,Boolean)]]
case class CC_C() extends T_A[T_A[(Char,Boolean)]]

val v_a: T_A[T_A[(Char,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), CC_A(_), _) => 1 
  case CC_C() => 2 
}
}