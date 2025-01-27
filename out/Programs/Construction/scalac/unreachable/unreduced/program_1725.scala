package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[CC_A[(Byte,Byte)], T_A[CC_A[(Byte,Byte)], CC_A[(Byte,Byte)]]], b: (Byte,(Char,(Boolean,Int))), c: T_A[D, D]) extends T_A[D, T_A[D, D]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_B(_, _, _), (_,_), _) => 1 
}
}
// This is not matched: CC_B(CC_A(_), (_,_), _)