package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_B[E, E]) extends T_A[E, (Char,Char)]
case class CC_B() extends T_B[T_A[Boolean, Int], T_A[(Char,Int), Int]]

val v_a: T_A[Int, (Char,Char)] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
}
}
// This is not matched: (CC_B (T_B (Tuple Boolean Boolean) Char)
//      Byte
//      (T_B (T_B (Tuple Boolean Boolean) Char) Byte))