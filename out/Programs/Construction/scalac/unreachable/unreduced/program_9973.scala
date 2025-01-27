package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Byte,(Byte,Char)), b: T_A[C, C], c: (T_A[Int, Int],T_A[Byte, Boolean])) extends T_A[T_A[T_A[Boolean, (Byte,Boolean)], T_A[Char, Int]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Boolean, (Byte,Boolean)], T_A[Char, Int]], D]
case class CC_C[E](a: E, b: CC_A[T_A[E, E]], c: CC_A[E]) extends T_A[T_A[T_A[Boolean, (Byte,Boolean)], T_A[Char, Int]], E]

val v_a: T_A[T_A[T_A[Boolean, (Byte,Boolean)], T_A[Char, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, CC_A(_, _, (_,_)), CC_A((_,_), _, (_,_)))