package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[(Char,Int)]], b: ((Int,Char),Byte)) extends T_A[T_A[T_B[Boolean]]]
case class CC_B(a: Boolean) extends T_A[T_A[T_B[Boolean]]]
case class CC_C[C](a: Int, b: CC_B, c: CC_A) extends T_B[C]

val v_a: T_A[T_A[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(true) => 1 
  case CC_B(false) => 2 
}
}