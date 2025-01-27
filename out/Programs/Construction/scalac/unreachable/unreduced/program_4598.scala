package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[C, T_A[C, C]]
case class CC_B(a: (T_B,Byte), b: T_A[T_B, T_A[T_B, (Int,Byte)]]) extends T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]]

val v_a: T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_B((_,0), _) => 1 
}
}
// This is not matched: CC_B((_,_), _)