package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_B[Boolean], T_B[Boolean]], b: T_A[T_A[Int, Boolean], T_A[Char, Boolean]]) extends T_A[(T_A[Boolean, Byte],T_A[Boolean, Boolean]), T_B[T_B[Boolean]]]
case class CC_B[D](a: Char, b: (Byte,T_B[Int]), c: CC_A) extends T_A[CC_A, D]
case class CC_C[E](a: T_A[CC_A, E], b: T_B[E], c: T_A[CC_A, E]) extends T_A[CC_A, E]

val v_a: T_A[CC_A, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,_), CC_A(_, _)) => 0 
  case CC_C(_, _, CC_B(_, (_,_), CC_A(_, _))) => 1 
  case CC_C(_, _, CC_C(CC_B(_, _, _), _, _)) => 2 
  case CC_C(_, _, CC_C(CC_C(_, _, _), _, _)) => 3 
}
}