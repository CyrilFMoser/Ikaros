package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A[C](a: (Int,(Int,Byte)), b: T_A[C]) extends T_A[T_A[C]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,0)), _) => 0 
}
}
// This is not matched: (CC_A Char (T_A Boolean Char))