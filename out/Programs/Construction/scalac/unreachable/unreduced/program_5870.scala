package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Int, b: Int, c: (T_A[(Int,Byte)],T_B[Boolean])) extends T_A[T_A[Char]]
case class CC_B(a: T_B[CC_A]) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B(_) => 1 
}
}