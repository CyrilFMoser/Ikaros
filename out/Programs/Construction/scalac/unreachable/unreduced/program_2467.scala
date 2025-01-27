package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: (T_A[Byte, Byte],T_A[(Char,Boolean), Int])) extends T_A[C, T_A[C, C]]
case class CC_B() extends T_A[Byte, T_A[Byte, Byte]]
case class CC_C[D](a: T_A[D, D]) extends T_A[D, T_A[D, D]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}