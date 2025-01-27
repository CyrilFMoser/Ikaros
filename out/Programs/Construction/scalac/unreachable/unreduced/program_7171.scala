package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_A[C], c: Int) extends T_A[C]
case class CC_B(a: Int, b: T_A[T_A[Boolean]], c: T_A[T_A[Byte]]) extends T_A[T_A[(Char,Boolean)]]
case class CC_C(a: CC_A[T_B[CC_B]], b: CC_B, c: T_A[(CC_B,(Boolean,Int))]) extends T_A[T_A[(Char,Boolean)]]
case class CC_D(a: T_A[Char]) extends T_B[T_A[CC_C]]
case class CC_E[D](a: CC_C, b: CC_B, c: T_A[T_A[D]]) extends T_B[T_A[CC_C]]

val v_a: T_A[T_A[(Char,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _, _), _), _) => 1 
  case CC_A(_, CC_A(_, CC_C(_, _, _), _), _) => 2 
  case CC_A(_, CC_B(_, _, _), _) => 3 
  case CC_A(_, CC_C(CC_A(_, _, _), _, _), _) => 4 
  case CC_B(_, _, _) => 5 
  case CC_C(_, _, _) => 6 
}
}