package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: ((Char,Byte),T_A[(Boolean,Byte), Char]), b: T_A[C, C], c: C) extends T_A[T_A[T_A[Byte, Char], (Int,Int)], C]
case class CC_B() extends T_A[T_A[T_A[Byte, Char], (Int,Int)], CC_A[T_A[Byte, Boolean]]]

val v_a: T_A[T_A[T_A[Byte, Char], (Int,Int)], CC_A[T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),_), _, CC_A(_, _, _)) => 0 
  case CC_B() => 1 
}
}