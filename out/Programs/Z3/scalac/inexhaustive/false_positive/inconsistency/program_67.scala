package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Char,(Char,Int)), b: T_A[Int]) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,('x',_)), _) => 0 
}
}
// This is not matched: (CC_C (T_A (T_A Boolean)))