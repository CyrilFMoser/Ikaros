package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean) extends T_A[C, T_A[Char, T_A[Int, Boolean]]]
case class CC_B[D](a: D, b: (T_A[Boolean, (Byte,Byte)],Int), c: T_A[D, D]) extends T_A[D, T_A[Char, T_A[Int, Boolean]]]

val v_a: T_A[Char, T_A[Char, T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B('x', (_,_), _) => 1 
  case CC_B(_, (_,_), _) => 2 
}
}