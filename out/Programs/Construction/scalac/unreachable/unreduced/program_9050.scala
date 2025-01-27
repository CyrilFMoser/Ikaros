package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte) extends T_A[T_A[T_A[(Char,Int)]]]
case class CC_B(a: T_A[CC_A], b: T_A[Char]) extends T_A[T_A[T_A[(Char,Int)]]]

val v_a: T_A[T_A[T_A[(Char,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}