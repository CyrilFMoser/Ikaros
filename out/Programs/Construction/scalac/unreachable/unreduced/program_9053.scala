package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean) extends T_A[T_A[(Byte,Char)]]
case class CC_B(a: T_A[CC_A], b: CC_A, c: CC_A) extends T_A[T_A[(Byte,Char)]]
case class CC_C(a: T_A[CC_A], b: CC_B) extends T_A[T_A[(Byte,Char)]]

val v_a: T_A[T_A[(Byte,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(true) => 0 
  case CC_A(false) => 1 
  case CC_B(_, CC_A(_), CC_A(_)) => 2 
  case CC_C(_, CC_B(_, _, CC_A(_))) => 3 
}
}