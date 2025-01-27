package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_B[C], c: ((Boolean,Char),T_A[(Char,Int)])) extends T_A[C]
case class CC_B(a: ((Char,Int),CC_A[Char]), b: Int) extends T_A[T_A[T_A[Char]]]
case class CC_C[D]() extends T_A[D]
case class CC_D(a: T_A[(CC_B,Boolean)], b: Char) extends T_B[T_B[T_A[CC_B]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B((_,_), _)