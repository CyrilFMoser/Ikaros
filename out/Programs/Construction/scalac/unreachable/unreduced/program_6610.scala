package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char, b: T_B[Char], c: T_B[(Int,Byte)]) extends T_A[T_B[T_A[Int]]]
case class CC_B(a: (T_A[CC_A],CC_A)) extends T_A[T_B[T_A[Int]]]
case class CC_C(a: CC_B, b: CC_B, c: Int) extends T_B[T_A[CC_B]]
case class CC_D(a: CC_A) extends T_B[T_A[CC_B]]

val v_a: T_B[T_A[CC_B]] = null
val v_b: Int = v_a match{
  case CC_C(CC_B((_,_)), CC_B((_,_)), _) => 0 
  case CC_D(_) => 1 
}
}