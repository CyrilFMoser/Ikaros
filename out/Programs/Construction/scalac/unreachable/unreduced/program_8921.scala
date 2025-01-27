package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]]) extends T_A[T_A[(Char,Boolean)]]
case class CC_B() extends T_A[T_A[(Char,Boolean)]]
case class CC_C(a: CC_A, b: CC_B, c: Int) extends T_A[T_A[(Char,Boolean)]]

val v_a: T_A[T_A[(Char,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_), CC_B(), _) => 2 
}
}