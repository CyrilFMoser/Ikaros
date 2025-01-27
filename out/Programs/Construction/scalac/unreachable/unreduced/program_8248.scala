package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Char, Byte],T_A[Char, Char]), b: T_A[T_A[C, C], C], c: Int) extends T_A[T_A[C, C], C]
case class CC_B(a: Int) extends T_A[T_A[CC_A[T_A[Char, Boolean]], CC_A[T_A[Char, Boolean]]], CC_A[T_A[Char, Boolean]]]

val v_a: T_A[T_A[CC_A[T_A[Char, Boolean]], CC_A[T_A[Char, Boolean]]], CC_A[T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A((_,_), CC_A(_, CC_B(_), _), _) => 1 
  case CC_B(12) => 2 
  case CC_B(_) => 3 
}
}
// This is not matched: CC_A((_,_), CC_B(_), _)