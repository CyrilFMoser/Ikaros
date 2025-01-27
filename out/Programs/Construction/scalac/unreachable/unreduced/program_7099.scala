package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: ((Char,Boolean),T_B[Int, Boolean])) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: (Int,T_B[CC_A, CC_A]), b: T_A[T_A[(Char,Byte)]], c: CC_A) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),_)) => 0 
  case CC_B(_, _, _) => 1 
}
}