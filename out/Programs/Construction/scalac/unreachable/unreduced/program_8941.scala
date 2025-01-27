package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Char,Int)]], b: T_A[T_A[Int]], c: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[Byte]]]
case class CC_B() extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: ((Int,Boolean),CC_A), b: T_A[T_A[CC_B]], c: CC_B) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(((_,_),CC_A(_, _, _)), _, _) => 2 
}
}