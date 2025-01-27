package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: (T_A[Char, (Byte,Char)],T_A[Char, (Boolean,Byte)]), c: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D, b: D) extends T_A[D, T_A[D, D]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), CC_A(_, _, _)) => 0 
  case CC_A(_, (_,_), CC_B(_, _)) => 1 
  case CC_B(_, _) => 2 
}
}