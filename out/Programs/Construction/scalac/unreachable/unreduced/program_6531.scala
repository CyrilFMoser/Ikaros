package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[(Char,Byte)]]]
case class CC_B(a: T_A[((Byte,Int),CC_A)], b: T_A[CC_A], c: CC_A) extends T_A[T_A[T_A[(Char,Byte)]]]

val v_a: T_A[T_A[T_A[(Char,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}