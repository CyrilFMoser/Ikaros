package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: (Char,T_A[Boolean, Char])) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D, b: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(0, (_,_)) => 0 
  case CC_A(_, (_,_)) => 1 
  case CC_B(_, CC_A(_, (_,_))) => 2 
  case CC_B(_, CC_B(_, CC_A(_, _))) => 3 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 4 
}
}