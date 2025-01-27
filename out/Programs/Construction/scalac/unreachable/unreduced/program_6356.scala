package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (Int,Int), b: T_A[D]) extends T_A[D]
case class CC_B[E](a: (CC_A[Boolean],T_B[Int, Boolean]), b: T_A[E], c: T_A[E]) extends T_A[E]
case class CC_C(a: Byte) extends T_B[T_A[T_A[Byte]], CC_A[T_A[Char]]]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A((_,_), CC_A(_, CC_A(_, _))) => 0 
  case CC_A((_,_), CC_B((_,_), CC_A(_, _), CC_A(_, _))) => 1 
  case CC_A((_,_), CC_B((_,_), CC_B(_, _, _), CC_A(_, _))) => 2 
  case CC_A((_,_), CC_B((_,_), CC_A(_, _), CC_B(_, _, _))) => 3 
  case CC_A((_,_), CC_B((_,_), CC_B(_, _, _), CC_B(_, _, _))) => 4 
}
}
// This is not matched: CC_A((_,_), CC_A(_, CC_B(_, _, _)))