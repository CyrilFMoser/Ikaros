package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: ((Int,Byte),T_A[Int, Boolean]), c: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, (_,_), CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_B(CC_A(_, _, _))) => 1 
  case CC_A(_, _, CC_B(CC_B(_))) => 2 
  case CC_B(CC_A(_, (_,_), CC_A(_, _, _))) => 3 
  case CC_B(CC_A(_, (_,_), CC_B(_))) => 4 
  case CC_B(CC_B(CC_A(_, _, _))) => 5 
  case CC_B(CC_B(CC_B(_))) => 6 
}
}
// This is not matched: CC_A(_, _, CC_A(_, (_,_), CC_B(_)))