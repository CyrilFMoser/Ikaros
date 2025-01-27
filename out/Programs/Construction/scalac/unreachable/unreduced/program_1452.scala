package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Boolean], T_A[Char]], b: Byte) extends T_A[T_A[T_A[(Char,Byte)]]]
case class CC_B(a: T_B[T_A[CC_A], CC_A], b: (T_A[CC_A],T_B[Char, CC_A])) extends T_A[T_A[T_A[(Char,Byte)]]]

val v_a: T_A[T_A[T_A[(Char,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, (_,_)) => 1 
}
}