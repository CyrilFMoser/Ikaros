package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Char]], b: Byte, c: Byte) extends T_A[T_B[T_B[Int, Char], T_A[Boolean]]]
case class CC_B[D](a: Char, b: (Boolean,T_B[CC_A, Boolean]), c: T_A[D]) extends T_A[D]
case class CC_C(a: Boolean, b: (CC_A,T_A[CC_A]), c: T_A[T_B[CC_A, CC_A]]) extends T_A[T_B[T_B[Int, Char], T_A[Boolean]]]
case class CC_D[E]() extends T_B[E, T_A[E]]

val v_a: T_A[T_B[T_B[Int, Char], T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,_), CC_A(_, _, _)) => 0 
  case CC_B(_, (_,_), CC_B(_, _, _)) => 1 
  case CC_B(_, (_,_), CC_C(_, _, _)) => 2 
  case CC_C(_, _, _) => 3 
}
}
// This is not matched: CC_A(_, _, _)