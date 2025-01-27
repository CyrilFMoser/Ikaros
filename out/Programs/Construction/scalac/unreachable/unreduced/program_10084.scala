package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: Boolean) extends T_A[(T_A[(Char,Boolean)],T_A[Boolean])]
case class CC_B(a: Byte) extends T_A[(T_A[(Char,Boolean)],T_A[Boolean])]

val v_a: T_A[(T_A[(Char,Boolean)],T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, true) => 0 
  case CC_A(_, false) => 1 
  case CC_B(_) => 2 
}
}