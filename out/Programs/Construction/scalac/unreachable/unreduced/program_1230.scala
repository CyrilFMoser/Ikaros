package Program_20 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[(Char,Char)]]
case class CC_B(a: T_A[T_A[CC_A]], b: CC_A, c: T_A[(CC_A,CC_A)]) extends T_A[T_A[(Char,Char)]]

val v_a: T_A[T_A[(Char,Char)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), _) => 1 
}
}