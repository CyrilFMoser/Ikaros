package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Char, Boolean],T_A[Int, Boolean]), b: C, c: T_A[C, C]) extends T_A[T_A[T_A[Boolean, Char], Boolean], C]
case class CC_B(a: CC_A[T_A[Int, Char]], b: CC_A[CC_A[Byte]], c: (T_A[Byte, Int],CC_A[Char])) extends T_A[T_A[T_A[Boolean, Char], Boolean], T_A[T_A[(Char,Boolean), Byte], CC_A[Char]]]

val v_a: T_A[T_A[T_A[Boolean, Char], Boolean], T_A[T_A[(Char,Boolean), Byte], CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
}
}
// This is not matched: CC_B(CC_A((_,_), _, _), _, (_,CC_A(_, _, _)))