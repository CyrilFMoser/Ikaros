package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Byte],(Int,Boolean))) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: (Boolean,T_A[Boolean, (Char,Int)])) extends T_A[D, T_A[D, D]]
case class CC_C[E]() extends T_A[T_A[CC_A[Int], T_A[CC_A[Int], CC_A[Int]]], E]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_))) => 0 
  case CC_B(CC_A(_), _) => 1 
}
}
// This is not matched: CC_B(CC_B(_, _), _)