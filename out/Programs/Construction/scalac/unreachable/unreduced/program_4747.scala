package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, (Int,Int)], b: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B(a: ((Char,Boolean),CC_A[Byte]), b: CC_A[(Byte,Byte)], c: T_A[T_A[T_A[Int, Boolean], T_A[Int, Boolean]], T_A[Int, Boolean]]) extends T_A[T_A[T_A[T_A[CC_A[Char], CC_A[Char]], CC_A[Char]], T_A[T_A[CC_A[Char], CC_A[Char]], CC_A[Char]]], T_A[T_A[CC_A[Char], CC_A[Char]], CC_A[Char]]]

val v_a: T_A[T_A[T_A[T_A[CC_A[Char], CC_A[Char]], CC_A[Char]], T_A[T_A[CC_A[Char], CC_A[Char]], CC_A[Char]]], T_A[T_A[CC_A[Char], CC_A[Char]], CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _, _))) => 1 
  case CC_A(_, CC_B((_,_), CC_A(_, _), _)) => 2 
  case CC_B(_, _, _) => 3 
}
}