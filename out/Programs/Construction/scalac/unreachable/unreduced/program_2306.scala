package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: C) extends T_A[C, (T_A[Byte, Char],T_A[Char, Char])]
case class CC_B[D](a: D, b: (T_A[Int, Boolean],CC_A[Byte]), c: D) extends T_A[CC_A[CC_A[Boolean]], D]
case class CC_C[E]() extends T_A[E, (T_A[Byte, Char],T_A[Char, Char])]

val v_a: T_A[CC_A[CC_A[Boolean]], (T_A[Byte, Char],T_A[Char, Char])] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(CC_A(_, _, _), (_,_), _), CC_A(_, CC_A(_, _, _), _), CC_A(_, _, _)) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}