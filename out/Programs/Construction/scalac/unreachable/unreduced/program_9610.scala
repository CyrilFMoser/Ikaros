package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Boolean],T_A[Int, (Int,Int)]), b: T_A[C, C], c: ((Char,Char),T_A[Int, Char])) extends T_A[C, T_A[Int, T_A[Boolean, Byte]]]
case class CC_B[D](a: D) extends T_A[D, T_A[Int, T_A[Boolean, Byte]]]

val v_a: T_A[Boolean, T_A[Int, T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B(true) => 1 
  case CC_B(false) => 2 
}
}