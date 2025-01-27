package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean) extends T_A[T_A[T_A[(Char,Char)]]]
case class CC_B(a: Char, b: T_A[CC_A], c: Char) extends T_A[T_A[T_A[(Char,Char)]]]

val v_a: T_A[T_A[T_A[(Char,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(true) => 0 
  case CC_A(false) => 1 
  case CC_B(_, _, _) => 2 
}
}