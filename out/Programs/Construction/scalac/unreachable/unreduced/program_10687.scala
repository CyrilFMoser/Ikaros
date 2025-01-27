package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[C, T_A[((Char,Byte),Char), T_A[Boolean, Int]]]
case class CC_B[D](a: T_A[D, D], b: D, c: T_A[D, D]) extends T_A[D, T_A[((Char,Byte),Char), T_A[Boolean, Int]]]
case class CC_C[E](a: E) extends T_A[E, T_A[((Char,Byte),Char), T_A[Boolean, Int]]]

val v_a: T_A[Byte, T_A[((Char,Byte),Char), T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}